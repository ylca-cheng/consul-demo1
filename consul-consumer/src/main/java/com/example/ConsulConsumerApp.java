package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@EnableFeignClients
@SpringBootApplication
public class ConsulConsumerApp
{
    //RestTemplate的bean实例
    @Bean
    //负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /*@Bean
    public IRule myRule()
    {
//        return new RoundRobinRule();
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
//        return new RetryRule();
        return new RandomRule();
    }*/

    /*@Bean
    public IRule myRule()
    {
        //return new RoundRobinRule();
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        return new RetryRule();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApp.class,args);
    }
}
