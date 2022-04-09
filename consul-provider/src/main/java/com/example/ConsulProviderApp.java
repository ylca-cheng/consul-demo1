package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProviderApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsulProviderApp.class,args);
    }
}
