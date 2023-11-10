package com.dubbo.api.service;


import com.dubbo.api.dto.ProductDTO;

public interface ProduceService {

    ProductDTO queryProduct(String productId);

}
