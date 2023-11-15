package com.dubbo.user.controller;

import com.dubbo.api.dto.OrderDTO;
import com.dubbo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    private OrderDTO queryOrder(@PathVariable("userId") String userId) {
        return userService.queryOrder(userId);
    }

    /**
     * 用于测试登录
     * @param nickname
     * @param password
     * @return
     */
    @GetMapping("/user/login")
    private String login(String nickname, String password) {
        return userService.login(nickname,password);
    }

    /**
     * 用于测试不登录调用接口
     * @return
     */
    @GetMapping("/get/user")
    private String getUser() {
        return "yuke";
    }


}
