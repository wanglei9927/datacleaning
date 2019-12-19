package com.zy.medicine;

import java.io.File;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.datacleaning.tools.SpringTool;
import com.zy.medicine.mapper.YdMedicineFrequenceMapper;
import com.zy.medicine.mapper.YdMedicineUsageMapper;
import com.zy.medicine.vo.YdMedicineUsage;
import com.zy.utils.Pinyin4jUtil;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

public class XlsToMedicineUsage {

	static {
		new ClassPathXmlApplicationContext("spring/app-datasource.xml", "spring/spring-framework.xml");
	}
	
	public static void main(String[] args) {
		
		try {

			YdMedicineUsageMapper ydMedicineUsageMapper = (YdMedicineUsageMapper) SpringTool.getBean("ydMedicineUsageMapper");
			
			
			ImportParams params = new ImportParams();

			List<YdMedicineUsage> list = ExcelImportUtil.importExcel(new File("/Users/wanglei/Downloads/给药方式.xls"), YdMedicineUsage.class,params);
			
			for (int i = 0; i < list.size(); i++) {
				
				YdMedicineUsage usage = list.get(i);
				
				usage.setId(String.valueOf(i));
				usage.setUsageAbbr(Pinyin4jUtil.getPinYinHeadChar(usage.getUsageName()));
				
				ydMedicineUsageMapper.insert(usage);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
