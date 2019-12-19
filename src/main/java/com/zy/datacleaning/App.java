package com.zy.datacleaning;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * 数据清洗处理
 */
public class App {

	static {
		//new ClassPathXmlApplicationContext("spring/app-datasource.xml", "spring/spring-framework.xml");
	}

	public static void main(String[] args) {
		
		//ImmutableMap<String,String> map = ImmutableMap.<String,String>builder().put("1", "2").build();
		
		//System.out.println(map.get("1"));
		
		List<String> list = Lists.newArrayList();
		
		list.add("cccc");
		
		String str = Joiner.on("，").join(list);
		
		System.out.println(str+"。");

	}

}
