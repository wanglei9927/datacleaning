package com.zy.medicine.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;

@TableName(value = "ph_person_medical_case")
@Data
@ToString
public class PhPersonMedicalCase {
	
	@TableId(value="id")
	private String id;
	
	@TableField(value="person_id")
	private String personId;
	

	@TableField(value="hospital_number")
	private String hospitalNumber;
	
	@TableField(value="discharge_department")
	private String dischargeDepartment;
	
	@TableField(value="discharge_date")
	private String dischargeDate;
	
	@TableField(value="diagnostic_name")
	private String diagnosticName;
	
	@TableField(value="diseases_type")
	private String diseasesType;
	
	@TableField(value="del_flag")
	private String delFlag;
	
}
