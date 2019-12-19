package com.zy.utils;

import java.io.File;
import java.io.IOException;

import org.w3c.dom.Element;

public class XmlTest {
	
	public static void main(String[] args) throws IOException {
		
		Element note = XmlUtils.createRootElement("note");
        XmlUtils.appendElement(note, "to", "George1");
        XmlUtils.appendElement(note, "from", "John2");
        XmlUtils.appendElement(note, "heading", "Reminder1");
        XmlUtils.appendElement(note, "body", "Don't forget the meeting!");
        
        File file = new File("/Users/wanglei/temp.xml");
        
        if (!file.exists()) {
        	file.createNewFile();
		}
        
        XmlUtils.saveToXml(note, file);

        //使用xml生成工具生成java代码(控制台输出)
        
        XmlUtils.createJavaCode(file);
	}

}
