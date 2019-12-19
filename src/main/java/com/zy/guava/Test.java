package com.zy.guava;

import java.rmi.dgc.DGC;
import java.text.ParseException;

import org.apache.commons.lang3.time.DateUtils;

public class Test {

	
	public static void main(String[] args) throws ParseException {
//		String [] s=new String[]{"one", "two", null, "", "three"};
//		
//		String result = Joiner.on("/").skipNulls().join(s);
//		
//		System.out.println(result);
		
		//System.out.println(DateUtils.parseDate("2019-09-02", "yyyy/MM/dd"));;
		
		System.out.println(dg(4));
	}
	
	public static int dg(int n) {
		
		if(n>1) {
			n = n-1;
			return dg(n);
		}
		return n;

	}
}

