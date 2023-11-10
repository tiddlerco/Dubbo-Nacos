package com.dubbo.user.service.impl;


import com.dubbo.api.dto.OrderDTO;
import com.dubbo.api.service.OrderService;
import com.dubbo.user.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Reference
    private OrderService orderService;

    @Override
    public OrderDTO queryOrder(String userId) {
        if (StringUtils.isEmpty(userId)) {
            return new OrderDTO();
        }
        return orderService.queryOrder(userId);
    }

}