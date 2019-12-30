package com.zy.guava;

import java.io.UnsupportedEncodingException;
import java.lang.Character.UnicodeBlock;
import java.nio.charset.Charset;
import java.rmi.dgc.DGC;
import java.text.ParseException;

import org.apache.commons.lang3.time.DateUtils;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.google.common.base.CharMatcher;

public class Test {

	
	public static void main(String[] args) throws ParseException {
//		String [] s=new String[]{"one", "two", null, "", "three"};
//		
//		String result = Joiner.on("/").skipNulls().join(s);
//		
//		System.out.println(result);
		
		//System.out.println(DateUtils.parseDate("2019-09-02", "yyyy/MM/dd"));;
		
		//System.out.println(dg(4));
		
		System.err.println(CharMatcher.anyOf("否").matchesAnyOf("  是  "));
	}
	
	public static int dg(int n) {
		
		if(n>1) {
			n = n-1;
			return dg(n);
		}
		return n;

	}
	
	@org.junit.Test
	public void test() throws UnsupportedEncodingException {
		String str = "彭玉军";
		String[] strs = str.split("");
		System.out.println("string:length "+strs.length);
		System.out.println("chars:"+str.chars().findFirst().getAsInt());
		for(String s:strs) {
			System.out.println("xxx:"+s);
			System.out.println((int)s.charAt(0));
		}
		byte[] bytes = str.getBytes("UTF-8");
		
		System.out.println();
		System.out.printf("bytes:length%d\n",bytes.length);
		
		System.out.println((char)24428);
	}
}

