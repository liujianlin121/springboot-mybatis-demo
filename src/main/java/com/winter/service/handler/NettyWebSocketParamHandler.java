package com.winter.service.handler;


import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.core.util.URLUtil;
import com.winter.entity.Personnel;
import com.winter.entity.Room;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.AttributeKey;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;


/**
 * URL参数处理程序，这时候连接还是个http请求，没有升级成webSocket协议，此处SimpleChannelInboundHandler泛型使用FullHttpRequest
 *
 * @author Nanase Takeshi
 * @date 2022/5/7 15:07
 */
@Slf4j
@Component
@ChannelHandler.Sharable
public class NettyWebSocketParamHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

    @Autowired
    private ChannelSupervise channelSupervise;

    /**
     * 此处进行url参数提取，重定向URL，访问webSocket的url不支持带参数的，带参数会抛异常，这里先提取参数，将参数放入通道中传递下去，重新设置一个不带参数的url
     *
     * @param ctx     the {@link ChannelHandlerContext} which this {@link SimpleChannelInboundHandler}
     *                belongs to
     * @param request the message to handle
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest request) throws Exception {
        String uri = request.uri();
        log.info("NettyWebSocketParamHandler.channelRead0 --> : 格式化URL... {}", uri);
        Map<CharSequence, CharSequence> queryMap = UrlBuilder.ofHttp(uri, CharsetUtil.UTF_8).getQuery().getQueryMap();
        //将参数放入通道中传递下去
        AttributeKey<String> attributeKey = AttributeKey.valueOf("token");
        ctx.channel().attr(attributeKey).setIfAbsent(queryMap.get("token").toString());
        request.setUri(URLUtil.getPath(uri));
        ctx.fireChannelRead(request.retain());
        String token = queryMap.get("token").toString();
        //验证是否登录
        if (StpUtil.getLoginIdByToken(token) == null) {
            TextWebSocketFrame tws = new TextWebSocketFrame(new Date().toString()
                    + ctx.channel().id() + "：回复" + "请先登录");
            ctx.channel().writeAndFlush(tws);
            ctx.close();
        }
        List<Room> roomList = channelSupervise.getRoomList();
        if (roomList.size() == 0) {
            roomList.add(createRoom(ctx, token));
        } else {
            roomList.forEach(room -> {
                if (room.getSize() > 3) {
                    room.getPersonnelList().add(createPersonnelInfo(ctx, token));
                    TextWebSocketFrame tws = new TextWebSocketFrame("房间:" + room.getRoomId());
                    ctx.channel().writeAndFlush(tws);
                    return;
                }
            });
        }
        log.info("1112131");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        log.error("NettyWebSocketParamHandler.exceptionCaught --> cause: ", cause);
        ctx.close();
    }

    private Personnel createPersonnelInfo(ChannelHandlerContext ctx, String token) {
        Personnel personnel = new Personnel();
        personnel.setUserId(StpUtil.getLoginIdByToken(token).toString());
        personnel.setUserName(StpUtil.getLoginIdByToken(token).toString());
        personnel.setToken(token);
        personnel.setChannel(ctx.channel());
        return personnel;
    }

    private Room createRoom(ChannelHandlerContext ctx, String token) {
        Room room = new Room();
        room.setRoomId(UUID.randomUUID().toString());
        room.setRoomName("凯迪克大奖");
        room.setSize(1);
        ArrayList<Personnel> objects = new ArrayList<>();
        objects.add(createPersonnelInfo(ctx, token));
        room.setPersonnelList(objects);
        return room;
    }

}
