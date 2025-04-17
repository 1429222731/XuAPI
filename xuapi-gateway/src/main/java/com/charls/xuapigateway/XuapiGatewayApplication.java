package com.charls.xuapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class XuapiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuapiGatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                // 定义路由规则，给该规则起一个名字 "tobaidu"
//                .route("tobaidu", r -> r.path("/baidu")
//                        // 将满足 "/baidu" 路径的请求转发到 "https://www.baidu.com"
//                        .uri("https://www.baidu.com"))
//                .route("tocharls", r -> r.path("/charls")
//                        .uri("https://github.com/1429222731"))
//                .build();
//    }
}
