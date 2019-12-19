package com.zy.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		String filePath = "/Users/wanglei/table81.pdf";
		
	    File file = new File(filePath);
	    
	    if (!file.exists()) {
	    	file.createNewFile();
		}
	    
	    
	    
	    //生成PDF文档
        Document document = new Document(PageSize.A4);
        PdfWriter writer 
        =  PdfWriter.getInstance(document,new FileOutputStream(file));
        
        writer.setPageEmpty(true); 

        
        document.open();
        
        float[] columnWidths = { 0.4f, 0.8f, 0.5f};

        PdfPTable tableBaseInfo = new PdfPTable(3);
        tableBaseInfo.setWidths(columnWidths);
        PdfPCell cellBaseInfo = new PdfPCell();
        //内容的宽度
        tableBaseInfo.setWidthPercentage(70);
        //内容居中
        tableBaseInfo.setHorizontalAlignment(Element.ALIGN_CENTER);
        /********身份信息核验************/
        iTextPDFUtil.addTableGroupTitle(tableBaseInfo,cellBaseInfo,"受检人基本信息                                                 口 侧弯  口 曲度  口 曲伸",3);
        //姓名
        cellBaseInfo = new PdfPCell(new Phrase("姓名",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        cellBaseInfo = new PdfPCell(new Phrase("有点小帅",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        
        document.add(tableBaseInfo);
        
        tableBaseInfo = new PdfPTable(3);
        tableBaseInfo.setWidths(columnWidths);
        cellBaseInfo = new PdfPCell();
        //内容的宽度
        tableBaseInfo.setWidthPercentage(70);
        //内容居中
        tableBaseInfo.setHorizontalAlignment(Element.ALIGN_CENTER);
        /********身份信息核验************/
        iTextPDFUtil.addTableGroupTitle(tableBaseInfo,cellBaseInfo,"受检人基本信息                                                 口 侧弯  口 曲度  口 曲伸",3);
        //姓名
        cellBaseInfo = new PdfPCell(new Phrase("姓名",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        cellBaseInfo = new PdfPCell(new Phrase("有点小帅",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        
        document.add(tableBaseInfo);        
         
        document.newPage();
        tableBaseInfo = new PdfPTable(3);
        tableBaseInfo.addCell(iTextPDFUtil.addBlankLine(20,2));
        document.add(tableBaseInfo);        
        document.close();
        
	}
	
	
 @org.junit.Test
  public void base64Decoder() {
	 
	 String target = "1231/23432//2//234";
		
		final Base64.Decoder decoder = Base64.getDecoder();
		final Base64.Encoder encoder = Base64.getEncoder();
		
		String encodedText = null;
		
		try {
			final byte[] textByte = target.getBytes("UTF-8");
			
			encodedText = encoder.encodeToString(textByte);
			
			
			System.out.println(new String(decoder.decode(encodedText), "UTF-8"));

			

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		

	}
}
