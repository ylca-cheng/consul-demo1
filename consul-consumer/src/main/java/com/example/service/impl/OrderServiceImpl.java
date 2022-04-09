package com.example.service.impl;

import com.example.entity.Order;
import com.example.entity.Product;
import com.example.service.OrderService;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ProductService productService;

    @Override
    public Order selectOrderById(Integer id) {
//        return new Order(id,"order-001","中国",8888D,selectProductListByLoadBalanceAnnotation());
        //使用feign的方式实现远程调用
        return new Order(id,"order-001","中国",8888D,productService.getProductList());

    }

    private List<Product> selectProductListByLoadBalanceAnnotation(){
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                "http://consul-provider/product/list",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>(){}
        );
        return response.getBody();
    }
}


