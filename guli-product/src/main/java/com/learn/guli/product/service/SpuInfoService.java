package com.learn.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.guli.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu
 *
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 03:51:01
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

