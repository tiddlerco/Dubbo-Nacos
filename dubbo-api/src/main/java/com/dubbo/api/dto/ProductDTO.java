package com.dubbo.api.dto;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductDTO implements Serializable {

    //商品ID
    private String productId;

    //商品价格
    private BigDecimal amount;

}