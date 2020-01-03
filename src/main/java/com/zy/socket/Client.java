package com.zy.socket;

import java.io.*;
import java.net.Socket;

public class Client {

	/**
	 *  java 的输入输出流
	 *  输入流：input 读取
	 *  输出流：output 写入
	 */
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.0.0.1",8080);
			OutputStream os= socket.getOutputStream();

			//send an http request to the web server
			PrintWriter printWriter = new PrintWriter(os, true);
			printWriter.println("GET /gyServer-gy/bnlogin HTTP/1.1");
			printWriter.println("Host: localhsot:8080");
			printWriter.println("Connection: Close");
			printWriter.println();

			//read response
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            boolean loop = true;
			StringBuffer sb = new StringBuffer(8096);

			while(loop){
			    if (in.ready()){
			    	int i = 0;
			    	while (i!=-1){
			    		i = in.read();
			    		sb.append((char)i);
					}
			    	loop = false;
				}
			}

			System.out.println(sb.toString());
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
