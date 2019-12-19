package com.zy.report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;

import com.alibaba.fastjson.JSON;
import com.zy.report.util.EchartsUtil;
import com.zy.report.util.FreemarkerUtil;

import freemarker.template.TemplateException;
import sun.misc.BASE64Decoder;

public class App4 {
	public static void main(String[] args) throws ClientProtocolException, IOException, TemplateException {
        // 变量
        String title = "水果";
        String[] categories = new String[] { "苹果", "香蕉", "西瓜" };
        int[] values = new int[] { 3, 2, 1 };

        // 模板参数
        HashMap<String, Object> datas = new HashMap<>();
        datas.put("categories", JSON.toJSONString(categories));
        datas.put("values", JSON.toJSONString(values));
        datas.put("title", title);

        // 生成option字符串
        String option = FreemarkerUtil.generateString("option.ftl", "", datas);

        // 根据option参数
        String base64 = EchartsUtil.generateEchartsBase64(option);
        
        System.out.println("BASE64:" + base64);
        generateImage(base64, "/Users/wanglei/test.png");
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
