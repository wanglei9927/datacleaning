package com.zy.medicine.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

@ExcelTarget("medicine")
@Data
public class Medicine implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Excel(name="药品编号")
	private String number;
	@Excel(name="药品代码")
	private String code;
	@Excel(name="药品名称")
	private String name;
	@Excel(name="规格")
	private String specification;
	@Excel(name="单位")
	private String unit;
	@Excel(name="MC")
	private String mc;
	@Excel(name="产地")
	private String cd;

}
