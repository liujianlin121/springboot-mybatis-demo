package com.winter.entity;

import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import lombok.Data;

/**
 * @author: ljl
 * @date: 2022/09/23
 **/
@Data
public class Personnel {

    private String userId;

    private String userName;

    private String token;

    private Channel channel;
}
