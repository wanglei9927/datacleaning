package com.zy.sc.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanglei
 * @since 2019-12-18
 */
@Data
@ToString
public class PhPerson extends Model<PhPerson> {

	private static final long serialVersionUID = 1L;

	/**
	 * 人员id
	 */
	@TableId(value="person_id")
	private String personId;

	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 生日
	 */
	private LocalDate birthday;

	/**
	 * 身份证号
	 */
	@TableField(value="id_card")
	private String idCard;

	/**
	 * 社保卡号
	 */
	@TableField(value = "social_security_card")
	private String socialSecurityCard;

	/**
	 * 身高
	 */
	private String height;

	/**
	 * 体重
	 */
	private String weight;

	/**
	 * 图片
	 */
	private String photo;



	/**
	 * 手机号码
	 */
	@TableField(value="mobile_phone")
	private String mobilePhone;

	/**
	 * 职务
	 */
	private String position;

	/**
	 * 职称
	 */
	@TableField(value="professional_title")
	private String professionalTitle;

	/**
	 * 签约状态(1:签约，2:未签约)
	 */
	@TableField(value="sign_status")
	private String signStatus;

	/**
	 * 简介
	 */
	private String intro;

	/**
	 * 机构id
	 */
	@TableField(value="org_id")
	private String orgId;

	/**
	 * 系统id
	 */
	@TableField(value="system_id")
	private String systemId;

	/**
	 * 地区编码
	 */
	@TableField(value="area_code")
	private String areaCode;

	/**
	 * 居住地区id
	 */
	@TableField(value="area_id")
	private String areaId;

	private String address;

	/**
	 * 删除标志
	 */
	@TableField(value="del_flag")
	private String delFlag;

	/**
	 * 创建者
	 */
	@TableField(value="create_by")
	private String createBy;

	/**
	 * 创建时间
	 */
	@TableField(value="create_datetime")
	private LocalDateTime createDatetime;

	/**
	 * 最后修改者
	 */
	@TableField(value="last_update_by")
	private String lastUpdateBy;

	/**
	 * 最后修改时间
	 */
	@TableField(value="last_update_datetime")
	private LocalDateTime lastUpdateDatetime;


	private String company;



	/**
	 * 现居地址
	 */
	@TableField(value="current_address")
	private String currentAddress;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * "0"代表是学生，"1"代表不是；默认为:"0"
	 */
	@TableField(value="isStudent")
	private String isStudent;


}
