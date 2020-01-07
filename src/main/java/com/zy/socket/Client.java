package com.zy.socket;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		try {
			Socket socket = new Socket("127.0.0.1",8080);
		} catch (IOException e) {
			e.printStackTrace();
	}	
	}
	
}
