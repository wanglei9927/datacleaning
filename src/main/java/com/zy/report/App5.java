package com.zy.report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;

import com.zy.report.util.EchartsUtil;
import com.zy.report.util.FreemarkerUtil;

import freemarker.template.TemplateException;
import sun.misc.BASE64Decoder;

public class App5 {
	 public static void main(String[] args) throws ClientProtocolException, IOException, TemplateException {
	        // 变量
		 	String string = "[2]";
	        // 模板参数
	        HashMap<String, Object> datas = new HashMap<>();
	        datas.put("data", string);

	        // 生成option字符串
	        String option = FreemarkerUtil.generateString("zhbg.ftl", "", datas);

	        // 根据option参数
	        String base64 = EchartsUtil.generateEchartsBase64(option);
	        
	        System.out.println(base64);
	        generateImage(base64, "/Users/wanglei/综合报告.png");
	        
	    }

	    public static void generateImage(String base64, String path) throws IOException {
	        BASE64Decoder decoder = new BASE64Decoder();
	        try (OutputStream out = new FileOutputStream(path)){
	            // 解密
	            byte[] b = decoder.decodeBuffer(base64);
	            for (int i = 0; i < b.length; ++i) {
	                if (b[i] < 0) {
	                    b[i] += 256;
	                }
	            }
	            out.write(b);
	            out.flush();
	        } 
	    }
}
