package com.zy.medicine;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.datacleaning.tools.SpringTool;
import com.zy.medicine.entity.LGS;
import com.zy.medicine.mapper.PhPersonMapper;
import com.zy.medicine.mapper.PhPersonMedicalCaseMapper;
import com.zy.medicine.vo.PhPerson;
import com.zy.medicine.vo.PhPersonMedicalCase;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

/**
 * 十院
 * @author wanglei
 *
 */
public class SYExcelToPhPerson {

	static {
		new ClassPathXmlApplicationContext("spring/app-datasource.xml", "spring/spring-framework.xml");
	}

	public static void main(String[] args) {
		
		//mapper
		PhPersonMapper phPersonMapper = (PhPersonMapper) SpringTool.getBean("phPersonMapper");
		
		PhPersonMedicalCaseMapper phPersonMedicalCaseMapper = (PhPersonMedicalCaseMapper) SpringTool.getBean("phPersonMedicalCaseMapper");

		//读取
		ImportParams params = new ImportParams();

		List<LGS> list = ExcelImportUtil.importExcel(new File("/Users/wanglei/Downloads/病例/2016-2017脑梗死.xlsx"), LGS.class,params);
		//循环插入
		
		for(LGS lgs : list) {
			
			//个人信息
			PhPerson person = new PhPerson();
			person.setName(lgs.getXm());
			person.setAddress(lgs.getJtzz());
			person.setBirthday(lgs.getCsrq());
			person.setMobilePhone(lgs.getLxdh());
			person.setSystemId("SYS-0011");
			person.setOrgId("ORG-000085");
			String personId = UUID.randomUUID().toString();
			person.setPersonId(personId);
			
			//病例
			PhPersonMedicalCase pcs = new PhPersonMedicalCase();
			pcs.setDelFlag("0");
			pcs.setDiagnosticName(lgs.getZyzdmc());
			pcs.setDischargeDate(lgs.getCyrq());
			pcs.setDischargeDepartment(lgs.getCyks());
			pcs.setDiseasesType("脑梗死");
			pcs.setHospitalNumber(lgs.getZyh());
			pcs.setId(UUID.randomUUID().toString());
			pcs.setPersonId(personId);
			
			phPersonMapper.insert(person);
			phPersonMedicalCaseMapper.insert(pcs);
		}
		
	}
}
