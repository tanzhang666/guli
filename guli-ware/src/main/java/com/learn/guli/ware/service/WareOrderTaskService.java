package com.learn.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.guli.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 
 *
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 18:44:14
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

