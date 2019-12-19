package com.zy.report;

public class Main {
	 public static void main(String[] args) throws Exception {
		 
		 
		 //启动之前先停止
		 stopPhantomjs();
		 ExecCmd cmd6666 = new ExecCmd("nohup /usr/local/bin/phantomjs /Users/wanglei/Downloads/echartsconvert/echarts-convert.js -s -p 6666",null);
		 ExecCmd cmd6667 = new ExecCmd("nohup /usr/local/bin/phantomjs /Users/wanglei/Downloads/echartsconvert/echarts-convert.js -s -p 6667",null);
		 ExecCmd cmd6668 = new ExecCmd("nohup /usr/local/bin/phantomjs /Users/wanglei/Downloads/echartsconvert/echarts-convert.js -s -p 6668",null);
		 ExecCmd cmd6669 = new ExecCmd("nohup /usr/local/bin/phantomjs /Users/wanglei/Downloads/echartsconvert/echarts-convert.js -s -p 6669",null);

		 cmd6666.start();
		 cmd6667.start();
		 cmd6668.start();
		 cmd6669.start();
	    }
	 
	 
	 
	 public static void stopPhantomjs() {
		 
		 ExecCmd cmd = new ExecCmd("",null);
		 
		 try {
			String result = cmd.execCmd("killall phantomjs", null);
			
			System.out.println("stop======="+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }

}
