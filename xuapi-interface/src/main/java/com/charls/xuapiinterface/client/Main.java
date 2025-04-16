package com.charls.xuapiinterface.client;

import com.charls.xuapiinterface.model.User;

/**
 * @Author: charls
 * @Description: 测试客户端
 * @Date: 2025/04/16/ 13:18
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        String accessKey = "charls";
        String secretKey = "abcdefgh";
        XuApiClient xuApiClient = new XuApiClient(accessKey, secretKey);
        String result1 = xuApiClient.getNameByGet("charls");
        String result2 = xuApiClient.getNameByPost("charls");
        User user = new User();
        user.setUsername("Charls");
        String result3 = xuApiClient.getUserNameByPost(user);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
