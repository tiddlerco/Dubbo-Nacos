package com.dubbo.api.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderDTO implements Serializable {

    //订单ID
    private String orderId;

    //订单状态（0：创建；1：交易中；2：交易完成；3：交易失败）
    private Integer status;

    //订单创建时间
    private Date createTime;

    private ProductDTO productDTO;

}
