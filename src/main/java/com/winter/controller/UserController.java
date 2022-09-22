package com.winter.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.winter.service.handler.ChannelSupervise;
import io.netty.channel.ChannelId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private ChannelSupervise channelSupervise;

    // 测试登录，浏览器访问： http://localhost:8081/user/doLogin?username=zhang&password=123456
    @RequestMapping("doLogin")
    public String doLogin(String username, String password) {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        if ("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return "登录成功";
        }
        return "登录失败";
    }

    // 查询登录状态，浏览器访问： http://localhost:8081/user/isLogin
    @RequestMapping("isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }


    // 测试登录
    @RequestMapping("login")
    public SaResult login() {
        StpUtil.login(10001);
        return SaResult.ok("登录成功");
    }


    // 测试注销
    @RequestMapping("logout")
    public SaResult logout() {
        StpUtil.logout();
        return SaResult.ok();
    }

    @RequestMapping("getRoomNumber")
    public String getRoomNumber() {
        //获取房间集合
        ConcurrentMap<String, List<ConcurrentMap<String, ChannelId>>> roomMap = channelSupervise.getRoomMap();
        Set<String> keyset = roomMap.keySet();
        for (String key : keyset) {
            if (roomMap.get(key) != null && roomMap.get(key).size() < 3) {
                return key;
            }
        }
        UUID uuid = UUID.randomUUID();
        roomMap.put(uuid.toString(), new LinkedList<>());
        return uuid.toString();
    }

}

