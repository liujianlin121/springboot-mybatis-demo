package com.winter.controller;

import com.winter.entity.Dbbaroverview;
import com.winter.mapper.DbbaroverviewDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 *创建者: ljl
 *创建时间:2022-08-23 19:55
 *描述:
 */
@RestController
@RequestMapping(path = "/viewController")
public class ViewController {
    @Resource
    private DbbaroverviewDao dbbaroverviewDao;

    @GetMapping(path = "getDbView/{id}")
    public Dbbaroverview getDbView(@PathVariable("id") Integer id) {
        final Dbbaroverview dbbaroverview = dbbaroverviewDao.selectByPrimaryKey(id);
        return dbbaroverview;
    }
}
