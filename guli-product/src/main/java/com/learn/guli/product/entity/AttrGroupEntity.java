package com.learn.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 03:51:01
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * 
	 */
	private String attrGroupName;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 
	 */
	private String descript;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private Long catelogId;

}
