package com.zy.medicine.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;

@TableName(value = "yd_medicine_specialty")
@Data
@ToString
public class YdMedicineSpecialty {
	
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	
	@TableId
	private String id;
	
	@TableField("medicine_id")
	private String medicineId;
	
	@TableField("specialty")
	private String specialty;
	
	@TableField("unit")
	private String unit;
	
	@TableField("dose")
	private String dose;
	
	@TableField("unit_price")
	private String unitPrice;

}
