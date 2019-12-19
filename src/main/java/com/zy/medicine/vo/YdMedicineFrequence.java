package com.zy.medicine.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.ToString;

@TableName(value="yd_medicine_frequence")
@Data
@ToString
public class YdMedicineFrequence {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	
	@Excel(name="XH")
	@TableId
	private Integer id;
	
	@Excel(name="MC")
	@TableField(value="freq_name")
	private String freqName;
	
	@Excel(name="DM")
	@TableField(value="freq_abbr")
	private String freqAbbr;
	
}
