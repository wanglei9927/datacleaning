package com.zy.easypoi.test;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import com.google.common.base.CharMatcher;
import com.zy.easypoi.model.Person;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;

public class test {
	
	@Test
	public void test2() {
		
//		System.out.println(CharMatcher.is('/').removeFrom("2222/3343/43"));	
//		System.out.println(CharMatcher.javaUpperCase().replaceFrom("AArilllllllLlllllllli","a"));
//
//		System.out.println(CharMatcher.any().removeFrom("aaadfsd"));
//		System.out.println(CharMatcher.any().retainFrom("dsfs"));
//		System.out.println(CharMatcher.javaLowerCase().retainFrom("Adsfs"));
//		System.out.println(CharMatcher.inRange('a','z').retainFrom("1dsfs"));
//		System.out.println(CharMatcher.whitespace().removeFrom("ds	 f s"));
		
		System.out.println(CharMatcher.inRange('0', '9').removeFrom("123io123ioi"));
		//System.out.println(CharMatcher.inRange('0', '9').and(CharMatcher.inRange('a', 'z')).retainFrom("123io123ioi"));
		System.out.println(CharMatcher.inRange('A', 'Z').replaceFrom("AArilllllllLlllllllli","a"));
		

	}

	@Test
	public void basetest() {
        try {
            ImportParams params = new ImportParams();
            params.setNeedVerfiy(true);
            params.setDataHandler(new UserExcelHandler());
            File file = new File("/Users/wanglei/Downloads/受检人模板.xlsx");
            ExcelImportResult<Person> result = ExcelImportUtil.importExcelMore(file, Person.class, params);
            
            List<Person> failList = result.getFailList();
            
            for (int i = 0; i < failList.size(); i++) {
            	
            	Person person =failList.get(i);
            	
            	System.out.println("第"+person.getRowNum()+"行，姓名："+person.getName()+"错误内容："+person.getErrorMsg());
				
			}
            for (int i = 0; i < result.getList().size(); i++) {
                System.out.println(ReflectionToStringBuilder.toString(result.getList().get(i)));
            }
        } catch (Exception e) {
        }
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
	        if (Pattern.compile(key).matcher(dateStr).matches()) {
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
	
	public static void main(String[] args) {
	    String[] dateStrArray=new String[]{
	        "2014-03-12 12:05:34",
	        "2014-03-12 12:05",
	        "2014-03-12 12",
	        "2014-03-12",
	        "2014-03",
	        "2014",
	        "20140312120534",
	        "2014/03/12 12:05:34",
	        "2014/3/12 12:5:34",
	        "2014年3月12日 13时5分34秒",
	        "201403121205",
	        "1234567890",
	        "20140312",
	        "201403",
	        "2000 13 33 13 13 13",
	        "30.12.2013",
	        "12.21.2013",
	        "21.1",
	        "13:05:34",
	        "12:05",
	        "14.1.8",
	        "14.10.18",
	        "Thu Mar 25 00:00:00 CST 1999",
	        "1993-8-1",
	        "1993.8.1",
	        "93.08.01"
	    };
	    for(int i=0;i<dateStrArray.length;i++){
	      System.out.println(dateStrArray[i] +"------------------------------".substring(1,30-dateStrArray[i].length())+ FormatDate(dateStrArray[i]));
	    }
	      
	  }
	
	@Test
	public void test5() {
		
		long time1 = 11883;//41884  
	    String result1 = new SimpleDateFormat("yyyy-MM-dd").format(new Date(time1 * 1000*100000));
	    

	    try {
			Date date1 = DateUtils.parseDate("1882-12-14","yyyy-MM-dd");
			Date date2 = DateUtils.parseDate(result1, "yyyy-MM-dd");
			
			System.err.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(date2.getTime()+date1.getTime())));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//System.out.println(result1);
	}
	
	@Test
	public void test6() {
		System.err.println(CharMatcher.javaDigit().matchesAllOf("41883"));
	}
}
