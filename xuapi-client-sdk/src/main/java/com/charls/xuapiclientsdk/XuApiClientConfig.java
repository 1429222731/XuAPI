package com.charls.xuapiclientsdk;

import com.charls.xuapiclientsdk.client.XuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: charls
 * @Description: SDK配置类
 * @Date: 2025/04/16/ 21:30
 * @Version: 1.0
 */
// 通过 @Configuration 注解,将该类标记为一个配置类,告诉 Spring 这是一个用于配置的类
@Configuration
// 能够读取application.yml的配置,读取到配置之后,把这个读到的配置设置到我们这里的属性中,
// 这里给所有的配置加上前缀为"yuapi.client"
@ConfigurationProperties("xuapi.client")
// @Data 注解是一个 Lombok 注解,自动生成了类的getter、setter方法
@Data
// @ComponentScan 注解用于自动扫描组件，使得 Spring 能够自动注册相应的 Bean
@ComponentScan
public class XuApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public XuApiClient xuApiClient() {
        // 使用 XuApiClientConfig 中的 accessKey 和 secretKey 初始化 XuApiClient
        return new XuApiClient(accessKey, secretKey);
    }
}
