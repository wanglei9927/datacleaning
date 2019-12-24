package com.zy.fmt;

import org.junit.Test;

public class TestFmt {
  
	@Test
	public void test1() {
 
		System.out.printf("%s\n", "sss");
		System.out.printf("%d\n", 123);
		System.out.printf("%o\n", 123);
		System.out.printf("%x\n", 123);
		System.out.printf("%s\n", "sss");
		
		
		System.out.println("abc"=="abc");
		String a = "abc";
		String b = "abc";
		System.out.println(a==b);
		
		String aString = new String("abc");
		
		String bString = new String("abc");
		
		System.out.println(aString==bString);
		
		System.out.println(returnstrings()==returnstrings());
	}
	
	public String returnstrings() {
		String string = "123";
		return string;
	}

}
