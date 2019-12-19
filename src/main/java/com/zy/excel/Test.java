package com.zy.excel;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Workbook;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import net.sf.jxls.transformer.XLSTransformer;

public class Test {
	
	@org.junit.Test
	public  void test() throws IOException {
		
		 ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();   
	        
	        BufferedImage bufferImg = ImageIO.read(new File("/Users/wanglei/eclipse-workspace/gyServer-gy/source/1567750505.png"));

	        ImageIO.write(bufferImg, "jpg", byteArrayOut);

			
			List<Map<String, Object>> list = Lists.newArrayList();
			
			//为模板中变量赋值
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("title", "受试者基本信息");
			map.put("name", "汪磊");
			map.put("sex", "男");
			map.put("bmi", "1");
			map.put("birthday", "1993-04-21");
			map.put("weight", "千克");
			map.put("height", "厘米");
			map.put("date", "2019-9-10");
			map.put("image", byteArrayOut.toByteArray());
			
			Map<String, Object> map2 = new HashMap<String, Object>();
			map2.put("title", "受试者基本信息");
			map2.put("name", "汪磊2");
			map2.put("sex", "男2");
			map2.put("bmi", "2");
			map2.put("birthday", "1993-04-21");
			map2.put("weight", "千克");
			map2.put("height", "厘米");
			map2.put("date", "2019-9-10");
			map2.put("image", byteArrayOut.toByteArray());
			map2.put("dw", "dw");
			
			list.add(map);
			list.add(map2);
			
			Map<String, Object> data = new HashMap<>();
	        data.put("list", list);


	        try {
				transformXLS("defaut.xlsx",data);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
    public void transformXLS(String filePath,Map<String, Object> data) throws Exception {
		
		InputStream resource = this.getClass().getClassLoader().getResourceAsStream(filePath);

		Workbook  workbook = new XLSTransformer().transformXLS(resource, data);
		
		
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
        workbook.write(output);
        
        
        File writename = new File("/Users/wanglei/defaut.xlsx"); 
        writename.createNewFile();
        

		BufferedWriter out = new BufferedWriter(new FileWriter(writename));
		out.write(""); // \r\n即为换行
		out.flush(); // 把缓存区内容压入文件
		out.close(); // 最后记得关闭文件

	}
    
    @org.junit.Test
    public void test1() {
    	try {
    	HashMap<String,String> map = Maps.newHashMap();
    	map.put("name", "汪磊");
    	map.put("sex", "01");
    	map.put("age", "20");
    	HashMap<String,String> map2 = Maps.newHashMap();
    	map2.put("name", "汪磊");
    	map2.put("sex", "01");
    	map2.put("age", "20");
    	HashMap<String,String> map3 = Maps.newHashMap();
    	map3.put("name", "汪磊");
    	map3.put("sex", "01");
    	map3.put("age", "20");
    	HashMap<String,String> map4 = Maps.newHashMap();
    	map4.put("name", "汪磊");
    	map4.put("sex", "01");
    	map4.put("age", "20");
    	HashMap<String,String> map5 = Maps.newHashMap();
    	map5.put("name", "汪磊");
    	map5.put("sex", "01");
    	map5.put("age", "20");
    	
    	ArrayList<Map<String, String>> list = Lists.newArrayList();
    	
    	list.add(map);
    	list.add(map2);
    	list.add(map3);
    	list.add(map4);
    	list.add(map5);
    	
    	 List<ExcelExportEntity> entity = new ArrayList<ExcelExportEntity>();
         entity.add(new ExcelExportEntity("姓名", "name"));
         ExcelExportEntity sex = new ExcelExportEntity("性别", "sex",20);
         sex.setDict("sex");
         entity.add(sex);
         entity.add(new ExcelExportEntity("年龄", "age"));
         //把我们构造好的bean对象放到params就可以了
         ExportParams params = new ExportParams("测试", "测试");
         
         params.setDictHandler(new ExcelDictHandlerImpl());
         
         Workbook workbook = ExcelExportUtil.exportExcel(params, entity,list);
         FileOutputStream fos = new FileOutputStream("/Users/wanglei/ExcelExportForMap.tt.xls");
         workbook.write(fos);
         fos.close();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
    }

}
