package com.zy.medicine;

import java.io.File;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.datacleaning.tools.SpringTool;
import com.zy.medicine.entity.Medicine;
import com.zy.medicine.mapper.YdMedicineMapper;
import com.zy.medicine.mapper.YdMedicineSpecialtyMapper;
import com.zy.medicine.vo.YdMedicine;
import com.zy.medicine.vo.YdMedicineSpecialty;
import com.zy.utils.Pinyin4jUtil;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

public class YPMCxlsToMedicine {
	
	static {
		new ClassPathXmlApplicationContext("spring/app-datasource.xml","spring/spring-framework.xml");
   }

	public static void main(String[] args) {

		try {

			YdMedicineMapper ydMedicineMapper = (YdMedicineMapper) SpringTool.getBean("ydMedicineMapper");
			
			YdMedicineSpecialtyMapper ydMedicineSpecialtyMapper = (YdMedicineSpecialtyMapper) SpringTool.getBean("ydMedicineSpecialtyMapper");
			
			ImportParams params = new ImportParams();

			List<Medicine> list = ExcelImportUtil.importExcel(new File("/Users/wanglei/YPMC.xls"), Medicine.class,params);
			
			for (Medicine medicine : list) {
				
				YdMedicine ydMedicine = new YdMedicine();
				YdMedicineSpecialty ydMedicineSpecialty = new YdMedicineSpecialty();
				
				//药品编号
				ydMedicine.setId(medicine.getNumber());
				//药品名称
				ydMedicine.setMedicineName(medicine.getName());
				//药品缩写
				ydMedicine.setMedicineAbbre(Pinyin4jUtil.getPinYinHeadChar(medicine.getName()));
				//药品代码
				ydMedicine.setMedicineCode(medicine.getCode());
				//剂型
				ydMedicine.setMedicineMc(medicine.getMc());
				//产地
				ydMedicine.setMedicineCd(medicine.getCd());
				
				ydMedicineSpecialty.setId(medicine.getNumber());
				ydMedicineSpecialty.setMedicineId(medicine.getNumber());
				//规格
				ydMedicineSpecialty.setSpecialty(medicine.getSpecification());
				//单位
				ydMedicineSpecialty.setUnit(medicine.getUnit());
				
				ydMedicineMapper.insert(ydMedicine);
				ydMedicineSpecialtyMapper.insert(ydMedicineSpecialty);

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
