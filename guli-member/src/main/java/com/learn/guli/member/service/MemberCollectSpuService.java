package com.learn.guli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.guli.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 
 *
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 18:57:31
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

