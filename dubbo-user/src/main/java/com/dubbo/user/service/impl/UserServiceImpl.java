package com.dubbo.user.service.impl;


import cn.dev33.satoken.stp.StpUtil;
import com.dubbo.api.dto.OrderDTO;
import com.dubbo.api.service.OrderService;
import com.dubbo.user.exception.UserException;
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

    @Override
    public String login(String nickname, String password) {

        if (nickname.equals("yuke")&&password.equals("123")){
            StpUtil.login(6666);
            // 在登录时缓存 user 对象
            StpUtil.getSession().set("user", "yuke");
            return "success";
        }else {
            throw new UserException("user.password.not.match", "yuke");
        }

    }

}