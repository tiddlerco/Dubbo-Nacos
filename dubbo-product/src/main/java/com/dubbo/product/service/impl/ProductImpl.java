package com.dubbo.product.service.impl;


import com.dubbo.api.dto.ProductDTO;
import com.dubbo.api.service.ProduceService;
import org.apache.dubbo.config.annotation.Service;

import javax.ws.rs.Path;
import java.math.BigDecimal;


@Service
@Path("/product")
public class ProductImpl implements ProduceService {

    @Override
    public ProductDTO queryProduct(String productId) {
        //查询指定商品的信息
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductId(productId);
        productDTO.setAmount(BigDecimal.valueOf(100));
        return productDTO;
    }

}