package com.example.service;

import com.example.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("consul-provider")
public interface ProductService {

    @GetMapping("/product/list")
    List<Product> getProductList();
}
