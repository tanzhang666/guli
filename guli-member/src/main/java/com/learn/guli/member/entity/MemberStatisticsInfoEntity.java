package com.learn.guli.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zztt
 * @email tanzhang666@outlook.com
 * @date 2021-02-01 18:57:31
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long memberId;
	/**
	 * 
	 */
	private BigDecimal consumeAmount;
	/**
	 * 
	 */
	private BigDecimal couponAmount;
	/**
	 * 
	 */
	private Integer orderCount;
	/**
	 * 
	 */
	private Integer couponCount;
	/**
	 * 
	 */
	private Integer commentCount;
	/**
	 * 
	 */
	private Integer returnOrderCount;
	/**
	 * 
	 */
	private Integer loginCount;
	/**
	 * 
	 */
	private Integer attendCount;
	/**
	 * 
	 */
	private Integer fansCount;
	/**
	 * 
	 */
	private Integer collectProductCount;
	/**
	 * 
	 */
	private Integer collectSubjectCount;
	/**
	 * 
	 */
	private Integer collectCommentCount;
	/**
	 * 
	 */
	private Integer inviteFriendCount;

}
