package com.winter.service.handler;

import com.winter.entity.Room;
import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author: ljl
 * @date: 2022/09/21
 **/
@Slf4j
@Component
public class ChannelSupervise {
    private static ChannelGroup GlobalGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    private static ConcurrentMap<String, ChannelId> ChannelMap = new ConcurrentHashMap();
    private static ConcurrentMap<String, List<ConcurrentMap<String, ChannelId>>> roomMap = new ConcurrentHashMap(1000);
    private static List<Room> list = new Vector();

    public static void addChannel(Channel channel) {
        GlobalGroup.add(channel);
        ChannelMap.put(channel.id().asShortText(), channel.id());

    }

    public static void removeChannel(Channel channel) {
        GlobalGroup.remove(channel);
        ChannelMap.remove(channel.id().asShortText());
    }

    public static Channel findChannel(String id) {
        return GlobalGroup.find(ChannelMap.get(id));
    }

    public static void send2All(TextWebSocketFrame tws) {
        GlobalGroup.writeAndFlush(tws);
    }

    public ConcurrentMap<String, List<ConcurrentMap<String, ChannelId>>> getRoomMap() {
        return roomMap;
    }

    public List getRoomList() {
        return list;
    }
}
