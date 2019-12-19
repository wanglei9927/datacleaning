package com.zy.sc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.datacleaning.tools.SpringTool;
import com.zy.sc.mapper.CervicalVertebraMapper;
import com.zy.sc.mapper.CurvesInsepctResultMapper;
import com.zy.sc.mapper.InspectResultMapper;
import com.zy.sc.mapper.SubjectsMapper;
import com.zy.sc.thread.SyncCvaThread;
import com.zy.sc.thread.SyncSbThread;
import com.zy.sc.thread.SyncScThread;
import com.zy.sc.thread.SyncUserThread;

public class App {
	
	static {
		new ClassPathXmlApplicationContext("spring/app-datasource.xml", "spring/spring-framework.xml");
	}
	
	public static void main(String[] args) {
		
		SubjectsMapper subjectsMapper = (SubjectsMapper) SpringTool.getBean("subjectsMapper");
		CervicalVertebraMapper cervicalVertebraMapper = (CervicalVertebraMapper) SpringTool.getBean("cervicalVertebraMapper");
		InspectResultMapper inspectResultMapper = (InspectResultMapper) SpringTool.getBean("inspectResultMapper");
		CurvesInsepctResultMapper curvesInsepctResultMapper = (CurvesInsepctResultMapper) SpringTool.getBean("curvesInsepctResultMapper");
		
//		//处理用户
//		Thread userThread = new Thread(new SyncUserThread());
//		userThread.start();
//		
//		//颈椎活动度线程
//		Thread cvaThread = new Thread(new SyncCvaThread());
//		cvaThread.start();
//		
//		//侧弯
//		Thread sbThread = new Thread(new SyncSbThread(inspectResultMapper));
//		sbThread.start();
//		
//		//曲度
//		Thread scThread = new Thread(new SyncScThread(curvesInsepctResultMapper));
//		scThread.start();
		

	}
	
}
