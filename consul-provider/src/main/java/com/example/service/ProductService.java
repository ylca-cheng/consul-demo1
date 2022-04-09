package com.example.service;

import com.example.entity.Product;

import java.util.List;

public interface ProductService {
    /**
     * 查询商品列表
     *
     * @return
     */
    List<Product> selectProductList();
}
