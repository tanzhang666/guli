package com.learn.guli.order.dao;

import com.learn.guli.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 18:50:57
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
