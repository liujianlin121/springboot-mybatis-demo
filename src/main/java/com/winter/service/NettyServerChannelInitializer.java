package com.winter.service;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: ljl
 * @date: 2022/09/20
 **/
@Component
@Slf4j
public class NettyServerChannelInitializer extends ChannelInitializer {
    @Autowired
    private ClientMessageHandler clientMessageHandler;
    @Autowired
    private ClientUserHandler clientUserHandler;
    @Override
    protected void initChannel(Channel channel) {

        channel.pipeline().addLast("http-codec", new HttpServerCodec());
        channel.pipeline().addLast("aggregator", new HttpObjectAggregator(65535));
        channel.pipeline().addLast("http-chunked", new ChunkedWriteHandler());
        // 设置编码类型
        //channel.pipeline().addLast("decoder",new StringDecoder(CharsetUtil.UTF_8));
        // 设置解码类型
        //channel.pipeline().addLast("encoder",new StringEncoder(CharsetUtil.UTF_8));
        // 用户校验处理逻辑
        channel.pipeline().addLast("ClientTokenHandler", clientUserHandler);
        // 通过校验最终消息业务处理
        channel.pipeline().addLast("ClientMessageHandler",clientMessageHandler);




    }
}
