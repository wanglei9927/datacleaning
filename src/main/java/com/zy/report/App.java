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

public class App {
    public static void main(String[] args) throws ClientProtocolException, IOException, TemplateException {
        // 变量
    	String string = "[[0.2,17],[0.4,16.9],[0.7,16.8],[1,16.7],[1.2,16.6],[1.5,16.5],[1.8,16.4],[2,16.3],[2.3,16.2],[2.6,16.1],[2.9,16],[3.1,15.9],[3.4,15.8],[3.6,15.7],[3.9,15.6],[4.1,15.5],[4.4,15.4],[4.6,15.3],[4.8,15.2],[5,15.1],[5.2,15],[5.5,14.9],[5.7,14.8],[5.9,14.7],[6.1,14.6],[6.3,14.5],[6.5,14.4],[6.7,14.3],[6.9,14.2],[7.1,14.1],[7.3,14],[7.6,13.9],[7.8,13.8],[8.1,13.7],[8.4,13.6],[8.7,13.5],[9,13.4],[9.3,13.3],[9.6,13.2],[9.9,13.1],[10.2,13],[10.6,12.9],[10.9,12.8],[11.2,12.7],[11.5,12.6],[11.8,12.5],[12.2,12.4],[12.5,12.3],[12.8,12.2],[13.2,12.1],[13.5,12],[13.9,11.9],[14.2,11.8],[14.6,11.7],[15,11.6],[15.3,11.5],[15.6,11.4],[15.9,11.3],[16.2,11.2],[16.4,11.1],[16.6,11],[16.8,10.9],[16.9,10.8],[17,10.7],[17.2,10.6],[17.2,10.5],[17.3,10.4],[17.4,10.3],[17.4,10.2],[17.5,10.1],[17.5,10],[17.6,9.9],[17.6,9.8],[17.6,9.7],[17.6,9.6],[17.5,9.5],[17.5,9.4],[17.4,9.3],[17.4,9.2],[17.3,9.1],[17.2,9],[17.1,8.9],[17,8.8],[16.9,8.7],[16.8,8.6],[16.7,8.5],[16.7,8.4],[16.6,8.3],[16.5,8.2],[16.4,8.1],[16.2,8],[16.1,7.9],[15.9,7.8],[15.7,7.7],[15.5,7.6],[15.2,7.5],[14.9,7.4],[14.6,7.3],[14.3,7.2],[13.9,7.1],[13.5,7],[13.1,6.9],[12.8,6.8],[12.4,6.7],[12.1,6.6],[11.8,6.5],[11.6,6.4],[11.4,6.3],[11.2,6.2],[11,6.1],[10.9,6],[10.8,5.9],[10.7,5.8],[10.6,5.7],[10.5,5.6],[10.4,5.5],[10.3,5.4],[10.3,5.3],[10.2,5.2],[10.1,5.1],[10,5],[9.9,4.9],[9.8,4.8],[9.7,4.7],[9.6,4.6],[9.5,4.5],[9.4,4.4],[9.3,4.3],[9.2,4.2],[9.1,4.1],[9.1,4],[9.1,3.9],[9.1,3.8],[9.1,3.7],[9.1,3.6],[9.2,3.5],[9.3,3.4],[9.4,3.3],[9.6,3.2],[9.7,3.1],[9.9,3],[10.1,2.9],[10.3,2.8],[10.5,2.7],[10.7,2.6],[10.9,2.5],[11.1,2.4],[11.3,2.3],[11.6,2.2],[11.9,2.1],[12.2,2],[12.5,1.9],[12.9,1.8],[13.2,1.7],[13.5,1.6],[13.8,1.5],[14.2,1.4],[14.5,1.3],[14.9,1.2],[15.2,1.1],[15.6,1],[16,0.9],[16.4,0.8],[16.7,0.7],[17.1,0.6],[17.4,0.5],[17.6,0.4],[17.8,0.3],[18,0.2],[18.2,0.1]]";
    	
        // 模板参数
        HashMap<String, Object> datas = new HashMap<>();
        datas.put("data", string);

        // 生成option字符串
        String option = FreemarkerUtil.generateString("spinalcurvature.ftl", "", datas);

        // 根据option参数
        String base64 = EchartsUtil.generateEchartsBase64(option);
        
        System.out.println(base64);
        generateImage(base64, "/Users/wanglei/脊柱曲度.png");
        
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