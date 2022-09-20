package com.winter.service;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

public class CoordinationSocketHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("与客户端建立连接，通道开启！");
        //添加到channelGroup通道组
        CoordinationChannelHandlerPool.channelGroup.add(ctx.channel());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("与客户端断开连接，通道关闭！");
        //从channelGroup通道组删除
        CoordinationChannelHandlerPool.channelGroup.remove(ctx.channel());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        //接收的消息
        System.out.println(String.format("收到客户端%s的数据：%s", ctx.channel().id(), msg.text()));

        // 单独发消息
        // sendMessage(ctx);
        // 群发消息
        sendAllMessage();
    }

    private void sendMessage(ChannelHandlerContext ctx) throws InterruptedException {
        String message = "我是服务器，你好呀";
        ctx.writeAndFlush(new TextWebSocketFrame("hello"));
    }

    private void sendAllMessage() {
        String message = "我是服务器，这是群发消息";
        CoordinationChannelHandlerPool.channelGroup.writeAndFlush(new TextWebSocketFrame(message));
    }


}