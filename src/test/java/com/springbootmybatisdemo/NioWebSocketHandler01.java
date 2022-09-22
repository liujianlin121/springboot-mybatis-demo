package com.springbootmybatisdemo;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.winter.service.MessageBO;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerUpgradeHandler;
import io.netty.handler.codec.http.websocketx.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Map;

/**
 * @author: ljl
 * @date: 2022/09/22
 **/
@Slf4j
public class NioWebSocketHandler01 extends SimpleChannelInboundHandler<Object> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.debug("收到消息：" + msg);


        //处理websocket客户端的消息
        handlerWebSocketFrame(ctx, (HttpServerUpgradeHandler) msg);

    }

    private void handlerWebSocketFrame(ChannelHandlerContext ctx, HttpObjectAggregator frame) {


        // 返回应答消息

        log.debug("服务端收到sssss：" + frame);

    }


}
