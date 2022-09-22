package com.winter.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    // 测试Sa-Token缓存
    @RequestMapping("login")
    public SaResult login(@RequestParam(defaultValue="10001") String id) {
        System.out.println("--------------- 测试Sa-Token缓存");
        StpUtil.login(id);
        return SaResult.ok();
    }

    // 测试业务缓存
    @RequestMapping("test")
    public SaResult test() {
        System.out.println("--------------- 测试业务缓存");
        stringRedisTemplate.opsForValue().set("hello", "Hello World");
        return SaResult.ok();
    }

}
