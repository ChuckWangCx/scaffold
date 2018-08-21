package com.wcx.webservice.impl;

import com.wcx.webservice.ScaffoldWebSerivce;

import javax.jws.WebService;

/**
 * @author: chuck
 * @Date: 2018/8/21
 * @Time: 13:25
 * @Description:
 * @modified:
 */
@WebService(targetNamespace="http://service.scaffold.cn/", endpointInterface="com.wcx.webservice.ScaffoldWebSerivce")
public class ScaffoldWebSerivceImpl implements ScaffoldWebSerivce {

    @Override
    public String WsTest() {
        return "This is a webservice method";
    }
}
