package com.dubbo.order.controller;

import com.dubbo.api.dto.OrderDTO;
import com.dubbo.api.service.OrderService;
import com.dubbo.order.domain.User;
import com.dubbo.order.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author tiddler
 * @Date 2023/11/15 12:21
 */

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private UserMapper userMapper;

    /**
     * 测试通过dubbo调用
     * @param userId
     * @return
     */
    @GetMapping("/getOrderByRpc")
    private OrderDTO queryOrderByRpc(String userId) {
        return orderService.queryOrder(userId);
    }


    /**
     * 测试普通调用
     * @param userId
     * @return
     */
    @GetMapping("/getOrder")
    private String queryOrder(String userId) {
        return userId;
    }


    @GetMapping("/queryOrder")
    private int queryOrder(){
     User user= userMapper.selectById(1);
        return user.getAge();
    }


}
