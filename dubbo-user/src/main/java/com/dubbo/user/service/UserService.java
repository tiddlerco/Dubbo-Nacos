package com.dubbo.user.service;

import com.dubbo.api.dto.OrderDTO;

public interface UserService {

    OrderDTO queryOrder(String userId);

}
