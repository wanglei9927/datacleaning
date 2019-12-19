package com.zy.excel;

import cn.afterturn.easypoi.handler.inter.IExcelDictHandler;

public class ExcelDictHandlerImpl implements IExcelDictHandler{

	@Override
	public String toName(String dict, Object obj, String name, Object value) {
		
		if ("sex".equals(dict)) {
			switch((String)value) {
			
			case "01":
                return "女";
            case "02":
                return "男";
                
             default:
             return "";
			
			}
		}
		return null;
	}

	@Override
	public String toValue(String dict, Object obj, String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
