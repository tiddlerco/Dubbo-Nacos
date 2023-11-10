package com.dubbo.api.service;


import com.dubbo.api.dto.OrderDTO;

public interface OrderService {

    OrderDTO queryOrder(String userId);
}
