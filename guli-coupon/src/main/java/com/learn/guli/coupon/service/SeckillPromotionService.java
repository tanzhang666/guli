package com.learn.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.guli.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 
 *
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 18:23:20
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

