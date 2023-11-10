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


}
