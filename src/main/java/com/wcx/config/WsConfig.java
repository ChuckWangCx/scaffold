package com.wcx.config;

import com.wcx.webservice.ScaffoldWebService;
import com.wcx.webservice.impl.ScaffoldWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author: chuck
 * @Date: 2018/8/21
 * @Time: 11:00
 * @Description: webservice接口服务配置类
 * @modified:
 */
@Configuration
public class WsConfig {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public ServletRegistrationBean<CXFServlet> servletRegistrationBean() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/webservice/*");
    }

    @Bean
    public ScaffoldWebService scaffoldWebService() {
        return new ScaffoldWebServiceImpl();
    }

    /**
     * 定义webservice的endpoint
     * @return
     */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), scaffoldWebService());
        endpoint.publish("/");
        return endpoint;
    }
}
