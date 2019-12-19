package com.zy.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

import com.beust.jcommander.internal.Maps;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MyTest {

	@Data
	@AllArgsConstructor public class Data1 {
		private int id;
		private String name;
		private int amount;
	}

	@Data
	@AllArgsConstructor
	public class Data2 {
		private int id;
		private String name;
		private String type;
	}

	@Data
	@AllArgsConstructor
	public class OutputData {
		private int id;
		private String name;
		private String type;
		private int amount;
	}

	@Test
	public void intersectByKeyTest() {
		List<Data2> listOfData2 = new ArrayList<Data2>();

		listOfData2.add(new Data2(10501, "JOE", "Type1"));
		listOfData2.add(new Data2(10603, "SAL", "Type5"));
		listOfData2.add(new Data2(40514, "PETER", "Type4"));
		listOfData2.add(new Data2(59562, "JIM", "Type2"));
		listOfData2.add(new Data2(29415, "BOB", "Type1"));
		listOfData2.add(new Data2(61812, "JOE", "Type9"));
		listOfData2.add(new Data2(98432, "JOE", "Type7"));
		listOfData2.add(new Data2(62556, "JEFF", "Type1"));
		listOfData2.add(new Data2(10599, "TOM", "Type4"));

		List<Data1> listOfData1 = new ArrayList<Data1>();

		listOfData1.add(new Data1(10501, "JOE", 3000000));
		listOfData1.add(new Data1(10603, "SAL", 6225000));
		listOfData1.add(new Data1(40514, "PETER", 2005000));
		listOfData1.add(new Data1(59562, "JIM", 3000000));
		listOfData1.add(new Data1(29415, "BOB", 3000000));

		List<OutputData> result = listOfData1.stream()
				.flatMap(x -> listOfData2.stream().filter(y -> x.getId() == y.getId())
				.map(y -> new OutputData(y.getId(), x.getName(), y.getType(), x.getAmount())))
				.collect(Collectors.toList());
		System.out.println(result);

		/* difference by key */
		List<Data1> data1IntersectResult = listOfData1.stream().filter(
				data1 -> listOfData2.stream().map(Data2::getId).collect(Collectors.toList()).contains(data1.getId()))
				.collect(Collectors.toList());
		System.out.println(data1IntersectResult);

	}

	@Test
	public void test3() {
		
		String string = "a,v";
		List<String> list = Splitter.on(",").omitEmptyStrings().splitToList(string);
		System.out.println(list.size());
	}
	
	@Test
	public void test4() {
		
		List<Map<String, Object>> list = Lists.newArrayList();
		
		Map<String, Object> map = Maps.newHashMap();
		map.put("a", "2");
		map.put("b", "1");
		list.add(map);
		
		map = Maps.newHashMap();
		map.put("a", "2");
		map.put("b", "1");
		list.add(map);
		
		map = Maps.newHashMap();
		map.put("a", "3");
		map.put("b", "3");
		list.add(map);
		
		System.out.println(list.size());

		//list = list.stream().distinct().collect(Collectors.toList());
		//list中的map去重
		list = list.stream().filter(distinctByKey(x->x.get("a")+","+x.get("b"))).collect(Collectors.toList());;
		System.out.println(list.size());
		
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}