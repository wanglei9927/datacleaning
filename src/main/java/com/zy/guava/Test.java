package com.zy.guava;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.IdentityHashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CharMatcher;
import com.google.common.collect.Maps;

public class Test {

	public static void main(String[] args) throws ParseException {
//		String [] s=new String[]{"one", "two", null, "", "three"};
//		
//		String result = Joiner.on("/").skipNulls().join(s);
//		
//		System.out.println(result);

		// System.out.println(DateUtils.parseDate("2019-09-02", "yyyy/MM/dd"));;

		// System.out.println(dg(4));

		System.err.println(CharMatcher.anyOf("否").matchesAnyOf("  是  "));
	}

	public static int dg(int n) {

		if (n > 1) {
			n = n - 1;
			return dg(n);
		}
		return n;

	}

	@org.junit.Test
	public void test() throws UnsupportedEncodingException {
		String str = "彭玉军";
		String[] strs = str.split("");
		System.out.println("string:length " + strs.length);
		System.out.println("chars:" + str.chars().findFirst().getAsInt());
		for (String s : strs) {
			System.out.println("xxx:" + s);
			System.out.println((int) s.charAt(0));
		}
		byte[] bytes = str.getBytes("UTF-8");

		System.out.println();
		System.out.printf("bytes:length%d\n", bytes.length);

		System.out.println((char) 24428);
	}

	@org.junit.Test
	public void test2() {
		String company = "清远市连南县马安中学4年级2015102班";

		StringBuilder sb = new StringBuilder(company);

		int first = CharMatcher.inRange('0', '9').indexIn(company);
		int second = CharMatcher.inRange('0', '9').indexIn(company, first + 1);

		System.out.println(first);
		System.out.println(second);

		sb.insert(first, '/');
		sb.insert(second + 1, '/');

		System.out.println(sb.toString());

	}

	@org.junit.Test
	public void test3() {
		String company = "闵行区第十五中学三年级2018班";

		boolean flag = CharMatcher.anyOf("2013").or(CharMatcher.anyOf("2014")).or(CharMatcher.anyOf("2015"))
				.or(CharMatcher.anyOf("2016")).or(CharMatcher.anyOf("2017")).or(CharMatcher.anyOf("2018"))
				.or(CharMatcher.anyOf("2019")).matchesAllOf(company);

		flag = company.contains("2013") || company.contains("2014") || company.contains("2015")
				|| company.contains("2016") || company.contains("2017") || company.contains("2018")
				|| company.contains("2019");
		System.out.println(flag);

	}

	@org.junit.Test
	public void test4() {
		String company = "徐汇区汇师小学六年级13班";

		System.out.println(CharMatcher.anyOf("一").replaceFrom(company, '1'));
	}

	@org.junit.Test
	public void test5() {
		String company = "徐汇区汇师小学五年级13班";

		company = company.replace("一年级", "1年级");
		company = company.replace("二年级", "2年级");
		company = company.replace("三年级", "3年级");
		company = company.replace("四年级", "4年级");
		company = company.replace("五年级", "5年级");
		company = company.replace("六年级", "6年级");

		System.out.println(company);
	}

	@org.junit.Test
	public void test6() {
		String teString = "x       ";
		System.out.println(teString);

		Map<String, String> test = Maps.newHashMap();
		test.put("key", teString);
		JSONObject json = new JSONObject();

		json.put("data", test);

		System.out.println(json.getString("data"));

	}

	@org.junit.Test
	public void test7() throws UnsupportedEncodingException {
		String teString2 = "B10010017       ";
		byte a = (byte)0;
		for(byte b :teString2.getBytes()) {
			if (b==a){
				
			}else {
				
			}
		}
	}
	
	@org.junit.Test
	public void test8() {
		
		int v =12;
		

		int b = v-1;
		
		System.out.println(v);
		System.out.println(b);
	}
@org.junit.Test
public void test9() {
	 IdentityHashMap<String,String> map = Maps.newIdentityHashMap();
	 
	 map.put(new String("s1"), "s1");
	 map.put(new String("s1"), "s2");
	 
	 map.forEach((k,v)->{
		 System.out.println(k);
		 System.out.println(v);

	 });

	 String string = map.get("s1");
	 
	 System.out.println(string);
	 
}
}
