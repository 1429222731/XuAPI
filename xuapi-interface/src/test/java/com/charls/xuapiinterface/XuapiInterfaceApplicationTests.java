package com.charls.xuapiinterface;

import com.charls.xuapiclientsdk.client.XuApiClient;
import com.charls.xuapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class XuapiInterfaceApplicationTests {

    @Resource
    private XuApiClient xuApiClient;

    @Test
    void contextLoads() {
        String result = xuApiClient.getNameByGet("charls");
        User user = new User();
        user.setUsername("Charls");
        String usernameByPost = xuApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }


}
