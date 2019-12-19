package com.zy.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.beust.jcommander.internal.Lists;
import com.beust.jcommander.internal.Maps;

public class Group {
	
	public static void main(String[] args) {
		
//		List<Map<String, String>> list = Lists.newArrayList();
//		
//		String[] strings = new String[] {"八年级一班","八年级二班",""};
//		
//		for (int i = 0; i < 10000; i++) {
//			
//			Random random = new Random();
//			int pick = random.nextInt(3);
//			
//			Map<String,String> map = Maps.newHashMap();
//			
//			map.put("company", strings[pick]);
//			
//			list.add(map);
//			
//		}
//		
//		//按照所属分组
//		Map<String, List<Map<String, String>>> group1 = list.parallelStream()
//															.collect(Collectors.groupingBy(map->map.get("company")));
//		
//		Map<String, List<Map<String, String>>> group2 = Maps.newHashMap();
//		//500条一组
//		group1.forEach((k,v)->{
//			
//			if (v.size()>500) {
//				List<List<Map<String, String>>> l1 = splitList(v,500);
//				
//				for (int i = 0; i < l1.size(); i++) {
//					if (StringUtils.isBlank(k)) {
//						k = "所属空";
//					}
//					group2.put(k+"("+(i+1)+")", l1.get(i));
//				}
//				
//			}
//			
//		});
		
		List<Map<String, String>> list = Lists.newArrayList();
		
		String serviceName = list.get(0).get("serviceName");
		System.out.println(serviceName);
		
		
	}
	
	public static <T> List<List<T>> splitList(List<T> totalList, int size) {
        List<List<T>> splitList = new ArrayList<List<T>>();
        //获取被拆分的数组个数
        int arrSize = totalList.size() % size == 0 ? totalList.size() / size : totalList.size() / size + 1;
        for (int i = 0; i < arrSize; i++) {
            List<T> sub = new ArrayList<T>();
            //把指定索引数据放入到list中
            for (int j = i * size; j <= size * (i + 1) - 1; j++) {
                if (j <= totalList.size() - 1) {
                    sub.add(totalList.get(j));
                }
            }
            splitList.add(sub);
        }
        return splitList;
    }

}
