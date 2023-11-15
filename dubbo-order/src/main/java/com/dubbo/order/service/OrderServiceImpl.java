package com.dubbo.order.service;

import com.dubbo.api.dto.OrderDTO;
import com.dubbo.api.dto.ProductDTO;
import com.dubbo.api.service.OrderService;
import com.dubbo.api.service.ProduceService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;


@Service
public class OrderServiceImpl implements OrderService {


    @Reference
    ProduceService produceService;

    @Override
    public OrderDTO queryOrder(String userId) {

        OrderDTO orderDTO = new OrderDTO();
        //查询用户的订单,模拟订单号
        String orderId = "order_123456789";
        orderDTO.setOrderId(orderId);
        orderDTO.setStatus(1);
        orderDTO.setCreateTime(new Date());
        //订单对应的商品ID，模拟商品ID
        String productId = "product_123456789";
        ProductDTO productDTO = produceService.queryProduct(productId);
        if (Objects.nonNull(productDTO)) {
            orderDTO.setProductDTO(productDTO);
        }
        return orderDTO;
    }


}