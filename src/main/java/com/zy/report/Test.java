package com.zy.report;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import com.google.common.collect.Lists;

public class Test {


	@org.junit.Test
	public void test1() {
		
		//生成一个1000大小的list
		
		List<String> list = Lists.newArrayList();
		
		for (int i = 0; i < 1000; i++) {
			list.add(String.valueOf(i));
		}
		
		list.stream().forEach(i->{
			
			System.out.println(i);
			
			String report = "report";
			
			System.out.println(report+"========"+prt(report));
			
			report = "report2" ;
			
			System.out.println(report+"========"+prt(report));

			report = "report3" ;
			
			System.out.println(report+"========"+prt(report));

			
		});
		
	}
	
	public String prt(String report) {
		
		try {
			Thread.sleep(1000*3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return report;
	}
	
	
	@org.junit.Test
	public void test2() {
		float a = 0.1f;
		System.out.println(a==0.1f);
	}

	@org.junit.Test
	public void test3() {
		 Properties props = System.getProperties();
		 System.out.println(props.getProperty("os.name"));

	}
	
	@org.junit.Test
	public void test4() {
		String path = "/Users/wanglei/Download/report/";
		
		File fi = new File(path+"20191009勿动02b340cc66bf42689d13abd0d7487b79");
		
		System.out.println(fi.exists());
		
		fi = new File(path+"20191009勿动02b340cc66bf42689d13abd0d7487b79.zip");

		System.out.println(fi.exists());

	}
	
	
	@org.junit.Test
	public void test5() {
		InputStream in = null;

		try {
			Process pro =  Runtime.getRuntime().exec("ps -ef|grep phantomjs");
			pro.waitFor();
			in = pro.getInputStream();
			BufferedReader read = new BufferedReader(new InputStreamReader(in));
			String result = read.readLine();
			System.out.println("INFO:"+result);


		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@org.junit.Test
	public void test6() {
		Random r;
		r=new Random();
		for (int i = 0; i < 100; i++) {
			int a=r.nextInt(3);
			System.out.println(a);
		}
		
		
		
	}
	@org.junit.Test
	public void test7() {
		
		DecimalFormat numberFormat = new DecimalFormat();
		
		 numberFormat.setMaximumFractionDigits(2);
		 
		 System.out.println(numberFormat.format((float)0/(float)1*100));
	}
}
