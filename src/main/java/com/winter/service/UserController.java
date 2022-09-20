package com.winter.service;


import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author hl.Wu
 * @date 2022/7/14
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ClientUserHandler clientUserHandler;

    @GetMapping("/token")
    public String getToken(){
        String token = IdUtil.fastSimpleUUID();
        ClientUserHandler.userMap.put(token,token);
        return token;
    }

    @PostMapping("/tips")
    public void sendToClient(@RequestParam("tips") String tips, @RequestParam("userId") String userId){
        Map<String, Channel> channelMap = clientUserHandler.channelMap;
        Channel channel = channelMap.get(userId);
        if(ObjectUtil.isNotNull(channel)){
            channel.writeAndFlush(tips);
        }
    }
}