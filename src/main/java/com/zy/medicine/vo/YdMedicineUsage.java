package com.zy.medicine.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.ToString;

@TableName(value="yd_medicine_usage")
@Data
@ToString
public class YdMedicineUsage {
	
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	
	@TableId
	private String id;
	
	@Excel(name="MC")
	@TableField("usage_name")
	private String usageName;
	
	@TableField("usage_abbr")
	private String usageAbbr;
	
	@Excel(name="DM")
	@TableField("dm")
	private String dm;

}
