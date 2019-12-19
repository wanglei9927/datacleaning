package com.zy.medicine.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

/**
 * 脑卒中
 * @author wanglei
 */
@ExcelTarget("lzz")
@Data
public class LZZ implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Excel(name = "住院号")
	private String zyh;
	
	@Excel(name = "姓名")
	private String xm;
	
	@Excel(name = "性别")
	private String xb;
	
	@Excel(name = "年龄")
	private String nl;
	
	@Excel(name = "出生日期")
	private String csrq;
	
	@Excel(name = "出院科室")
	private String cyks;
	
	@Excel(name = "出院日期")
	private String cyrq;
	
	@Excel(name = "主要诊断名称")
	private String zyzdmc;
	
	@Excel(name = "联系电话")
	private String lxdh;
	
	@Excel(name = "家庭住址")
	private String jtzz;
}
