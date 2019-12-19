package com.zy.medicine.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;

@TableName(value = "yd_medicine")
@Data
@ToString
public class YdMedicine {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	
	@TableId
	private String id;
	
	@TableField("medicine_name")
	private String medicineName;
	
	@TableField("medicine_abbre")
	private String medicineAbbre;
	
	@TableField("medicine_code")
	private String medicineCode;
	
	@TableField("medicine_mc")
	private String medicineMc;
	
	@TableField("medicine_cd")
	private String medicineCd;
	
}
