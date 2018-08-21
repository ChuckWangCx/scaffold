package com.wcx.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author: chuck
 * @Date: 2018/8/21
 * @Time: 13:24
 * @Description:
 * @modified:
 */
@WebService
public interface ScaffoldWebService {

    /**
     * 测试功能
     * @return
     */
    @WebMethod
    public String WsTest();
}
