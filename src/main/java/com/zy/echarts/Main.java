package com.zy.echarts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zy.datacleaning.tools.SpringTool;
import com.zy.echarts.mapper.DeviceMapper;
import com.zy.echarts.vo.DeviceData;

public class Main {

	static {
		new ClassPathXmlApplicationContext("spring/app-datasource.xml", "spring/spring-framework.xml");
	}

	public static void main(String[] args) {
		
		DeviceMapper deviceMapper = (DeviceMapper) SpringTool.getBean("deviceMapper");
		
		List<DeviceData> deviceDatas = deviceMapper.selectDeviceData();
		
		//根据SN分组
		Map<String,List<DeviceData>> maps= deviceDatas.stream()
													  .filter(bean->null!=bean.getSn())
													  .collect(Collectors.groupingBy(DeviceData::getSn));
		
		System.out.println(maps);
		
		Map<String, List<String>> targetMap = Maps.newHashMap();

		maps.forEach((k,v)->{
			
			List<String> targetDeviceData = Lists.newArrayList("0","0","0","0","0",
															   "0","0","0","0","0",
															   "0","0","0","0","0",
															   "0","0","0","0","0",
															   "0","0","0","0");
			
			for(int j = 0;j<v.size();j++) {
				
				DeviceData deviceData = v.get(j);
				
				String hour = deviceData.getHour();
				
				String count = deviceData.getCount();
				
				targetDeviceData.add(Integer.valueOf(hour), count);
			}
			
			targetMap.put(k, targetDeviceData.subList(0, 23));
			
		});
		

		targetMap.forEach((k,v)->{
			System.out.println(k+":"+v.size());
			System.out.println(v);

		});
		
		
		
	}
}
