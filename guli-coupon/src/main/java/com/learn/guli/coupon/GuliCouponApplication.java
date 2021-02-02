package com.learn.guli.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.learn.guli.coupon.dao")
@EnableDiscoveryClient
public class GuliCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliCouponApplication.class, args);
	}

}
