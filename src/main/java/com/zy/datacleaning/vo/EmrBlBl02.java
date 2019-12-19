package com.zy.datacleaning.vo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;

@TableName(value = "emr_bl_bl02")
@Data
@ToString
public class EmrBlBl02 {
	
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	@TableId
	private Long BLBH;
	
	private Object BLNR;
	
	//1、姓名
	private String BLXM;
	
	//2、年龄
	private String AGE;
	
	//性别
	private String SEX;
	
	//科室
	private String KS;
	
	//5、住院号
	private String ZYH;
	
	//床号
	private String CH;
	
	//7、病理号
	private String BLH;
	
	//8、影像检查号
	private String YXJCH;
	
	//9、入院日期
	private String RYRQ;
	
	//出院日期
	private String CYRQ;
	
	//诊断
	private String ZD;
	
	//入院时主要症状及体征
	private String RYZZ;
	
	//主要化验结果
	private String HYJG;
	
	//特殊检查及重要会诊
	private String TSJCHZ;
	
	//15、住院治疗简要过程及主要治疗措施
	private String ZYZLCS;
	
	//出院情况
	private String CYQK;
	
	//出院医嘱
	private String CYYZ;
	
	//主治医师
	private String ZZYS ;
	
	//住院医师
	private String ZYYS;
	
	//实习医师
	private String SXYS;
	
	//查房
	private String CF;
	
	/**
	 * 病区
	 */
	private String BQ;
}
