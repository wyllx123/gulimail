package com.atguigu.gulimail.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author luoxu
 * @create 2022-10-27-11:29
 */
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.atguigu.gulimail.coupon.dao")
@EnableDiscoveryClient
public class GulimailCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimailCouponApplication.class,args);
    }
}
