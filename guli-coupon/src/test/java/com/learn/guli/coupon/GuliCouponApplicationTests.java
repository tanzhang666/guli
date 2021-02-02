package com.learn.guli.coupon;

import com.learn.guli.coupon.entity.CouponEntity;
import com.learn.guli.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class GuliCouponApplicationTests {

	@Autowired
	private CouponService couponService;

	@Test
	void contextLoads() {
		CouponEntity couponEntity = new CouponEntity();
		couponEntity.setCouponName("五折");
		couponService.save(couponEntity);
		System.out.println("保存成功");
	}

}
