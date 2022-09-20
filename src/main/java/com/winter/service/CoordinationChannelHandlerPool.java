package com.winter.service;


import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class CoordinationChannelHandlerPool {

    public CoordinationChannelHandlerPool() {
    }

    //可以存储userId与ChannelId的映射表
//    public static ConcurrentHashMap<String, ChannelId> channelIdMap = new ConcurrentHashMap<>();

    //channelGroup通道组
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}