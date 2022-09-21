package com.springbootmybatisdemo;

import cn.hutool.json.JSONUtil;
import com.winter.service.MessageBO;
import org.junit.jupiter.api.Test;

/**
 * @author: ljl
 * @date: 2022/09/21
 **/
public class UtilTest {

    @Test
    public void Test(){
        String s = "GET /?token=241f83cb9cb34f189e7cdf549c316848 HTTP/1.1";

        //String token = (String) JSONUtil.getByPath(s, MessageBO.Fields.token);
        //System.out.println(token);
    }
}
