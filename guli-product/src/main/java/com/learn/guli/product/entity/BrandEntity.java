package com.learn.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Ʒ
 * 
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 03:51:01
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Ʒ
	 */
	@TableId
	private Long brandId;
	/**
	 * Ʒ
	 */
	private String name;
	/**
	 * Ʒ
	 */
	private String logo;
	/**
	 * 
	 */
	private String descript;
	/**
	 * 
	 */
	private Integer showStatus;
	/**
	 * 
	 */
	private String firstLetter;
	/**
	 * 
	 */
	private Integer sort;

}
