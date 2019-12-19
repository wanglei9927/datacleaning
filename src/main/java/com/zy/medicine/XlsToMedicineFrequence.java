package com.zy.medicine;

import java.io.File;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.datacleaning.tools.SpringTool;
import com.zy.medicine.mapper.YdMedicineFrequenceMapper;
import com.zy.medicine.vo.YdMedicineFrequence;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

public class XlsToMedicineFrequence {

	static {
		new ClassPathXmlApplicationContext("spring/app-datasource.xml", "spring/spring-framework.xml");
	}

	public static void main(String[] args) {
		
		//mapper
		YdMedicineFrequenceMapper ydMedicineFrequenceMapper = (YdMedicineFrequenceMapper) SpringTool.getBean("ydMedicineFrequenceMapper");
		//读取
		ImportParams params = new ImportParams();

		List<YdMedicineFrequence> list = ExcelImportUtil.importExcel(new File("/Users/wanglei/Downloads/用法.xls"), YdMedicineFrequence.class,params);
		//循环插入
		
		for(YdMedicineFrequence item : list) {
			
			ydMedicineFrequenceMapper.insert(item);
			
		}

	}

}
