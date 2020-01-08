package com.zy.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.junit.Test;

public class HttpTest {

	public static void main(String[] args) throws  Exception{
        StringBuilder sb = new StringBuilder("http://localhost:8081/oneplatform/getMedicationAssess?systemId=SYS-0010&appKey=1111&type=");
        sb.append(URLEncoder.encode("有效性","UTF-8"));
        System.out.println(sb.toString());
		String result = loadJSON(sb.toString());
		
		System.out.println("result:"+result);
	}
	
    public static String loadJSON(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }
    
    
    @Test
    public void test1() throws UnsupportedEncodingException {
    	
    	System.out.println(URLEncoder.encode("http://localhost:800/a=大","UTF-8"));
    }
}
