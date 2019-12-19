package com.zy.easypoi.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zy.easypoi.model.Person;

import cn.afterturn.easypoi.handler.impl.ExcelDataHandlerDefaultImpl;

public class UserExcelHandler extends ExcelDataHandlerDefaultImpl<Person> {
	
	private static final Logger log = LoggerFactory.getLogger(UserExcelHandler.class);

	
	@Override
	public Object importHandler(Person obj, String name, Object value) {
		log.info(name+":"+value);
		return super.importHandler(obj, name, value);
	}
	
}
