package com.zy.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class FilterApple {

	
	static List<Apple> filterApples(List<Apple> inventory,Predicatea<Apple> p){
		
		
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory){
			if (p.test(apple)) {
				 result.add(apple);
			}
		}
		
		return result;
		
	}
	
	
	public static boolean isGreenApple(Apple apple) {
	    return "green".equals(apple.getColor());
	}
	
	
	public static boolean isHeavyApple(Apple apple) {
	    return apple.getWeight() > 150;
	}
	
	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>();
		
		new Apple();
		
		
		inventory.parallelStream().max((Apple a1,Apple a2)->{
			
			return 9;
			
		});
		
		
		filterApples(inventory,FilterApple::isHeavyApple);
		
	}
	
	@Test
	public void test1() {
		
		//String result = "{\"success\":\"ok\",\"array\":[\"key\",\"value\"]}";
		
		String result = null;
		
		//JSONObject obj = JSON.parseObject(result);
		
		Optional<JSONObject> obj= Optional.ofNullable(JSON.parseObject(result));
		
		
		System.out.println(obj.map(FilterApple::getKey)
								.orElse(new JSONArray()));
	}
	
	public static JSONArray getKey(JSONObject obj) {
		
		return obj.getJSONArray("array");
		
	}
	
	
	@Test
	public void test2() {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<String> future =  executor.submit(FilterApple::doSometing);
	}

	
	public static String doSometing() {
		return "";
	}
	
	@Test
	public void test3() {
		
		System.out.println(String.valueOf(Math.floor(1.9)));
		
	}
}
