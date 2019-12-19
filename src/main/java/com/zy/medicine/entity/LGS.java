package com.zy.medicine.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

/**
 * 脑梗死
 * @author wanglei
 *
 */
@ExcelTarget("lgs")
@Data
public class LGS implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Excel(name = "住院号")
	private String zyh;
	
	@Excel(name = "姓名")
	private String xm;
	
	@Excel(name = "出院科室")
	private String cyks;
	
	@Excel(name = "出生日期")
	private String csrq;
	
	@Excel(name = "主要诊断名称")
	private String zyzdmc;
	
	@Excel(name = "家庭地址")
	private String jtzz;
	
	@Excel(name = "家庭电话")
	private String jtdh;
	
	@Excel(name = "联系地址")
	private String lxdz;
	
	@Excel(name = "联系电话")
	private String lxdh;
	
	@Excel(name = "出院日期")
	private String cyrq;
}
