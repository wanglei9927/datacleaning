package com.zy.easypoi.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.handler.inter.IExcelDataModel;
import cn.afterturn.easypoi.handler.inter.IExcelModel;

public class Person implements IExcelModel,IExcelDataModel {

	
	@Excel(name = "姓名")
	@NotNull(message = "姓名不能为空")
	private String name;
	
	@Excel(name = "联系电话")
    @Pattern(regexp = "^1[3456789]\\d{9}$", message = "联系电话格式不正确")
	private String  phone;
	
	@Excel(name = "身份证号")
    @Pattern(regexp = "(^\\d{15}$)|(^\\d{17}([0-9]|X)$)", message = "身份证格式不正确")
	private String idCard;
	
	@Excel(name = "性别")
    @NotNull
	private String 	sex;
	
	@Excel(name = "出生日期")
	@NotNull
	private String birthday;
	
	@Excel(name = "年龄")
    @Pattern(regexp = "^\\d+$", message = "年龄不正确")
	private String age;
	
	@Excel(name = "单位")
	private String dw;
	
	@Excel(name = "家庭住址")
	private String address;
	
	@Excel(name = "省")
	private String province;
	
	@Excel(name = "市")
	private String city;
	
	@Excel(name = "区")
	private String area;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(Object birthday) {

		String value = null;
		
		if(birthday instanceof Date) {
			value = birthday.toString();
		}else if(birthday instanceof String) {
			value = (String)birthday;
		}
		this.birthday = FormatDate(value);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	private String errorMsg;

	@Override
	public String getErrorMsg() {
		return errorMsg;
	}

	@Override
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	private int rowNum;

	@Override
	public int getRowNum() {
		// TODO Auto-generated method stub
		return rowNum;
	}

	@Override
	public void setRowNum(int rowNum) {

		this.rowNum = rowNum;
	}

	public static String FormatDate(String dateStr){
		//验证是不是美区时间
		if(dateStr.contains("CST")) {
		      DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
		      try {
				Date date = df.parse(dateStr);
			    df = new SimpleDateFormat("yyyy-MM-dd");
			    return df.format(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
	    HashMap<String, String> dateRegFormat = new HashMap<String, String>();
	    dateRegFormat.put("^\\d{4}\\D+\\d{1,2}\\D+\\d{1,2}\\D+\\d{1,2}\\D+\\d{1,2}\\D+\\d{1,2}\\D*$","yyyy-MM-dd-HH-mm-ss");//2014年3月12日 13时5分34秒，2014-03-12 12:05:34，2014/3/12 12:5:34
	    dateRegFormat.put("^\\d{4}\\D+\\d{2}\\D+\\d{2}\\D+\\d{2}\\D+\\d{2}$", "yyyy-MM-dd-HH-mm");//2014-03-12 12:05
	    dateRegFormat.put("^\\d{4}\\D+\\d{2}\\D+\\d{2}\\D+\\d{2}$","yyyy-MM-dd-HH");//2014-03-12 12
	    dateRegFormat.put("^\\d{4}\\D+\\d{1,2}\\D+\\d{1,2}$", "yyyy-MM-dd");//2014-03-12
	    dateRegFormat.put("^\\d{4}\\D+\\d{2}$", "yyyy-MM");//2014-03
	    dateRegFormat.put("^\\d{4}$", "yyyy");//2014
	    dateRegFormat.put("^\\d{14}$", "yyyyMMddHHmmss");//20140312120534
	    dateRegFormat.put("^\\d{12}$", "yyyyMMddHHmm");//201403121205
	    dateRegFormat.put("^\\d{10}$", "yyyyMMddHH");//2014031212
	    dateRegFormat.put("^\\d{8}$", "yyyyMMdd");//20140312
	    dateRegFormat.put("^\\d{6}$", "yyyyMM");//201403
	    dateRegFormat.put("^\\d{2}\\s*:\\s*\\d{2}\\s*:\\s*\\d{2}$","yyyy-MM-dd-HH-mm-ss");//13:05:34 拼接当前日期
	    dateRegFormat.put("^\\d{2}\\s*:\\s*\\d{2}$", "yyyy-MM-dd-HH-mm");//13:05 拼接当前日期
	    dateRegFormat.put("^\\d{2}\\D+\\d{1,2}\\D+\\d{1,2}$", "yy-MM-dd");//14.10.18(年.月.日)
	    dateRegFormat.put("^\\d{1,2}\\D+\\d{1,2}$", "yyyy-dd-MM");//30.12(日.月) 拼接当前年份
	    dateRegFormat.put("^\\d{1,2}\\D+\\d{1,2}\\D+\\d{4}$", "dd-MM-yyyy");//12.21.2013(日.月.年)
	  
	    String curDate =new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	    DateFormat formatter1 =new SimpleDateFormat("yyyy-MM-dd");
	    DateFormat formatter2;
	    String dateReplace;
	    String strSuccess="";
	    try {
	      for (String key : dateRegFormat.keySet()) {
	        if (java.util.regex.Pattern.compile(key).matcher(dateStr).matches()) {
	          formatter2 = new SimpleDateFormat(dateRegFormat.get(key));
	          if (key.equals("^\\d{2}\\s*:\\s*\\d{2}\\s*:\\s*\\d{2}$")|| key.equals("^\\d{2}\\s*:\\s*\\d{2}$")) {//13:05:34 或 13:05 拼接当前日期
	            dateStr = curDate + "-" + dateStr;
	          } else if (key.equals("^\\d{1,2}\\D+\\d{1,2}$")) {//21.1 (日.月) 拼接当前年份
	            dateStr = curDate.substring(0, 4) + "-" + dateStr;
	          }
	          dateReplace = dateStr.replaceAll("\\D+", "-");
	          // System.out.println(dateRegExpArr[i]);
	          strSuccess = formatter1.format(formatter2.parse(dateReplace));
	          break;
	        }
	      }
	    } catch (Exception e) {
	      System.err.println("-----------------日期格式无效:"+dateStr);
	      throw new Exception( "日期格式无效");
	    } finally {
	      return strSuccess;
	    }
	  }
}
