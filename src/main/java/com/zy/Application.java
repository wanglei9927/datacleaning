package com.zy;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.zy.sc.thread.SyncCvaThread;
import com.zy.sc.thread.SyncSbThread;
import com.zy.sc.thread.SyncScThread;
import com.zy.sc.thread.SyncUserThread;


@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class Application implements CommandLineRunner{
	
	@Resource
	private SyncUserThread syncUserThread;
	
	@Resource
	private SyncCvaThread syncCvaThread;
	
	@Resource
	private SyncSbThread syncSbThread;
	
	@Resource
	private SyncScThread syncScThread;

	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	  }

	@Override
	public void run(String... args){
		Thread userThread = new Thread(syncUserThread);
		userThread.start();
		
//		Thread cvaThread = new Thread(syncCvaThread);
//		cvaThread.start();


		Thread sbThread = new Thread(syncSbThread);
		sbThread.start();
		
//		Thread scThread = new Thread(syncScThread);
//		scThread.start();
	}
	
	
}
