package com.zy.medicine.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;

@TableName(value = "ph_person")
@Data
@ToString
public class PhPerson {
	
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	
	@TableId(value="person_id")
	private String personId;

	@TableField(value="name")
	private String name;
	
	@TableField(value="birthday")
	private String birthday;
	
	@TableField(value="address")
	private String address;
	
	@TableField(value="mobile_phone")
	private String mobilePhone;
	
	@TableField(value="system_id")
	private String systemId;
	
	@TableField(value="org_id")
	private String orgId;
	
	@TableField(value="sex")
	private String sex;
	
	@TableField(value="age")
	private String age;
	
	
}
