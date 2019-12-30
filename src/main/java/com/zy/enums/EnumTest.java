package com.zy.enums;

import java.time.DayOfWeek;

/**
 * 枚举类型中的变量，实际上是几个实例化的类
 * @author wanglei
 *
 */
public class EnumTest {

	public static void main(String[] args) {
		
		DayOfWeek monday = DayOfWeek.MONDAY;
		
		System.out.println(monday.ordinal());
		
	}
	
	enum Day {
		
		MONDAY,TUESDAY
	}
}
