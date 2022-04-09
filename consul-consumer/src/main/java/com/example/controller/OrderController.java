package com.example.controller;

import com.example.entity.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @GetMapping("/{id}")
    public Order selectOrderById(@PathVariable("id") Integer id){
        return orderService.selectOrderById(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "redirect:https://www.baidu.com/";
    }
}


