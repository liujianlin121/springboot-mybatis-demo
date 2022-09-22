package com.winter.service;

/**
 * @author: ljl
 * @date: 2022/09/20
 **/

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hl.Wu
 * @date 2022/7/14
 **/
@Slf4j
@Component
@ChannelHandler.Sharable
public class ClientUserHandler extends SimpleChannelInboundHandler<String> {

    /**
     * k：token,v：userId
     */
    public static Map<String,String> userMap = new ConcurrentHashMap<>();

    /**
     * 通道信息 k:userId v:通道信息
     */
    public Map<String, Channel> channelMap = new ConcurrentHashMap<>();

    @Override
    public void channelRead0(ChannelHandlerContext ctx, String msg) {
        // 解析消息对象 校验token信息
        log.info("receive message info is {}", msg);
        String token = (String)JSONUtil.getByPath(JSONUtil.parse(msg), MessageBO.Fields.token);
        // 校验token是否失效
        // TODO 根据业务场景添加身份校验
        Preconditions.checkArgument(userMap.containsKey(token),"抱歉，Token已失效");
        if(!channelMap.containsKey(userMap.get(token))){
            channelMap.put(userMap.get(token), ctx.channel());
        }
        // 开启访问后面的处理逻辑
        ctx.fireChannelRead(msg);
    }


}