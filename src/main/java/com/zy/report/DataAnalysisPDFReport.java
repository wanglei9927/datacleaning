package com.zy.report;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.zy.utils.iTextPDFUtil;

public class DataAnalysisPDFReport {

	private Document document;

	private PdfWriter writer;

	private PdfContentByte cd;

	private String filePath;

	private String topLogo;

	private String companyInformation;

	private String exemptionFromdeClaration;

	private String title;

	private String jsLogo;

	public static void main(String[] args) throws Exception {

		String path = "/Users/wanglei/table81.pdf";

		DataAnalysisPDFReport report = new DataAnalysisPDFReport();

		String topLogo = "/Users/wanglei/Downloads/二维码预览.png";
		String companyInformation = "公司信息";
		String exemptionFromdeClaration = "免责申明";
		String title = "脊 柱 评 估 报 告";
		// 底部
		String jsLogo = "/Users/wanglei/Downloads/jslogo.png";
		
		report.prepareDocument(path, topLogo, title, jsLogo, companyInformation, exemptionFromdeClaration)
		  .addHeader(false)
		  .createTeamInfo()//团队信息
		  .wholeData()//全体分析
		  .screeningAssessmen()//筛查评估分析
		  .addBottom()
		  .addHeader(true)
		  .assistantDiagnosis()//辅助诊断分析
		  .highRisk()//高风险评估
		  .createEvaluation()//评估总结
		  .addBottom()
		  .closeDocument();


	}
	
	public DataAnalysisPDFReport closeDocument() {
		document.close();
		return this;
	}

	public DataAnalysisPDFReport prepareDocument(String path, String topLogo, String title, String jsLogo,
			String companyInformation, String exemptionFromdeClaration) throws Exception {

		this.filePath = path;
		this.topLogo = topLogo;
		this.companyInformation = companyInformation;
		this.exemptionFromdeClaration = exemptionFromdeClaration;
		this.title = title;
		// 底部
		this.jsLogo = jsLogo;
		// 创建文件
		File file = createPdfFile(filePath);

		// 生成PDF文档
		document = getDocument(file);

		this.writer = getPdfWriter(document, file);

		writer.setPageEmpty(true);
		document.open();
		this.cd = writer.getDirectContent();

		return this;

	}

	/**
	 * 高风险评估
	 * 
	 * @param document
	 * @throws Exception
	 */
	public DataAnalysisPDFReport highRisk() throws Exception {
		PdfPTable tableBaseInfo = new PdfPTable(3);
		tableBaseInfo.addCell(iTextPDFUtil.addBlankLine(12, 3));

		PdfPCell cellBaseInfo = new PdfPCell();
		tableBaseInfo.setWidthPercentage(100);
		tableBaseInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
		iTextPDFUtil.addTableGroupTitle(tableBaseInfo, cellBaseInfo, "高风险评估", 3);

		cellBaseInfo = new PdfPCell();
		Image image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		cellBaseInfo = new PdfPCell();
		image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		cellBaseInfo = new PdfPCell();
		image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(30f, 30f, 30f));
		document.add(tableBaseInfo);

		PdfPTable table = new PdfPTable(5);
		//// 设置表格宽度比例为%100
		table.setWidthPercentage(100);
		// 设置表格的宽度
		table.setTotalWidth(500);
		table.setTotalWidth(new float[] { 70, 70, 70, 70, 70 });
		for (int i = 0; i < 5; i++) {
			table.addCell(createTextCell("cell"));
		}
		for (int i = 0; i < 5; i++) {
			table.addCell(createTextCell("cell"));
		}
		for (int i = 0; i < 5; i++) {
			table.addCell(createTextCell("cell"));
		}

		document.add(table);

		return this;

	}

	/**
	 * 辅助诊断分析
	 * 
	 * @throws Exception
	 */
	public DataAnalysisPDFReport assistantDiagnosis() throws Exception {
		PdfPTable tableBaseInfo = new PdfPTable(3);

		PdfPCell cellBaseInfo = new PdfPCell();
		tableBaseInfo.setWidthPercentage(100);
		tableBaseInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
		iTextPDFUtil.addTableGroupTitle(tableBaseInfo, cellBaseInfo, "辅助诊断分析", 3);

		cellBaseInfo = new PdfPCell();
		Image image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		cellBaseInfo = new PdfPCell();
		image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		cellBaseInfo = new PdfPCell();
		image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(30f, 30f, 30f));
		document.add(tableBaseInfo);

		PdfPTable table = new PdfPTable(5);
		//// 设置表格宽度比例为%100
		table.setWidthPercentage(100);
		// 设置表格的宽度
		table.setTotalWidth(500);
		table.setTotalWidth(new float[] { 70, 70, 70, 70, 70 });
		for (int i = 0; i < 5; i++) {
			table.addCell(createTextCell("cell"));
		}
		for (int i = 0; i < 5; i++) {
			table.addCell(createTextCell("cell"));
		}
		for (int i = 0; i < 5; i++) {
			table.addCell(createTextCell("cell"));
		}

		document.add(table);

		return this;

	}

	/**
	 * 筛查评估分析
	 * 
	 * @throws DocumentException
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public DataAnalysisPDFReport screeningAssessmen() throws DocumentException, MalformedURLException, IOException {
		PdfPTable tableBaseInfo = new PdfPTable(3);
		tableBaseInfo.addCell(iTextPDFUtil.addBlankLine(20, 3));

		PdfPCell cellBaseInfo = new PdfPCell();
		tableBaseInfo.setWidthPercentage(100);
		tableBaseInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
		iTextPDFUtil.addTableGroupTitle(tableBaseInfo, cellBaseInfo, "筛查评估分析", 3);

		cellBaseInfo = new PdfPCell();
		Image image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		cellBaseInfo = new PdfPCell();
		image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		cellBaseInfo = new PdfPCell();
		image = Image.getInstance("/Users/wanglei/Downloads/demo2.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(30f, 30f, 30f));
		document.add(tableBaseInfo);

		PdfPTable table = new PdfPTable(7);
		//// 设置表格宽度比例为%100
		table.setWidthPercentage(100);
		// 设置表格的宽度
		table.setTotalWidth(500);
		table.setTotalWidth(new float[] { 60, 60, 90, 60, 90, 60, 90 });
		table.addCell(createTextCell("分类"));
		table.addCell(createTextCell("0°-   4°"));
		table.addCell(createTextCell("0°-   4°百分比"));
		table.addCell(createTextCell("4°-   7°"));
		table.addCell(createTextCell("4°-   7°百分比"));
		table.addCell(createTextCell("≥7°"));
		table.addCell(createTextCell("≥7°百分比"));

		for (int i = 0; i < 7; i++) {
			table.addCell(createTextCell("cell"));
		}
		for (int i = 0; i < 7; i++) {
			table.addCell(createTextCell("cell"));
		}

		document.add(table);
		return this;
	}

	/**
	 * 脊柱侧弯人数曲线
	 * 
	 * @throws DocumentException
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public DataAnalysisPDFReport wholeData() throws DocumentException, MalformedURLException, IOException {
		PdfPTable tableBaseInfo = new PdfPTable(1);
		tableBaseInfo.addCell(iTextPDFUtil.addBlankLine(20, 2));

		PdfPCell cellBaseInfo = new PdfPCell();
		//tableBaseInfo.setWidthPercentage(100);
		tableBaseInfo.setLockedWidth(true);
		tableBaseInfo.setTotalWidth(499.2f);
		tableBaseInfo.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		iTextPDFUtil.addTableGroupTitle(tableBaseInfo, cellBaseInfo, "脊柱侧弯人数曲线");
		cellBaseInfo = new PdfPCell();
		Image image = Image.getInstance("/Users/wanglei/Downloads/demo.png");
		cellBaseInfo.setImage(image);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 200, 0, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, Element.ALIGN_CENTER, Element.ALIGN_CENTER);

		tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(30f));
		document.add(tableBaseInfo);
		PdfPTable table = new PdfPTable(17);
		//// 设置表格宽度比例为%100
		//table.setWidthPercentage(100);
		table.setLockedWidth(true);
		table.setTotalWidth(499.2f);
		table.setHorizontalAlignment(Element.ALIGN_CENTER);
		// 设置表格的宽度
		//table.setTotalWidth(500);
		//table.setTotalWidth(new float[] { 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70 });
		// 度数
		for (int i = 0; i < 17; i++) {
			if (i == 0) {
				table.addCell(createTextCell("度数"));
			} else {
				table.addCell(createTextCell(String.valueOf(i - 1)));
			}
		}
		for (int i = 0; i < 17; i++) {
			table.addCell(createTextCell("cell"));
		}
		for (int i = 0; i < 17; i++) {
			table.addCell(createTextCell("cell"));
		}
		document.add(table);

		return this;
	}

	/**
	 * 团队信息
	 * 
	 * @throws DocumentException
	 */
	public DataAnalysisPDFReport createTeamInfo() throws DocumentException {

		PdfPTable tableBaseInfo = new PdfPTable(1);
		PdfPCell cellBaseInfo = new PdfPCell();
		//tableBaseInfo.setWidthPercentage(100);
		tableBaseInfo.setLockedWidth(true);
		tableBaseInfo.setTotalWidth(499.2f);
		tableBaseInfo.setHorizontalAlignment(Element.ALIGN_CENTER);
		iTextPDFUtil.addTableGroupTitle(tableBaseInfo, cellBaseInfo, " 团体信息");
		Phrase phrase = new Phrase("性别：全部;总人数:409人",iTextPDFUtil.getColorFont(BaseColor.BLACK, 12, "微软雅黑"));
		cellBaseInfo.addElement(phrase);
		cellBaseInfo.addElement(phrase);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 60, 5, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, 0, 0);

		tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(30f));
		document.add(tableBaseInfo);

		return this;
	}

	/**
	 * 评估总结
	 * 
	 * @throws DocumentException
	 */
	public DataAnalysisPDFReport createEvaluation() throws DocumentException {

		PdfPTable tableBaseInfo = new PdfPTable(1);
		tableBaseInfo.addCell(iTextPDFUtil.addBlankLine(20, 1));
		PdfPCell cellBaseInfo = new PdfPCell();
		cellBaseInfo.setLeading(1f, 2f);
		tableBaseInfo.setWidthPercentage(100);
		tableBaseInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
		iTextPDFUtil.addTableGroupTitle(tableBaseInfo, cellBaseInfo, "评估总结");
		Phrase phrase = new Phrase(
				"经过上述数据统计分析，其中正常人数为280人(男生150人，女生130人)。脊柱侧弯低风险人 数为116人(男生67人，女生49人)。建议进行再次复查评估的人数为58人(男生35人，女生23 人)。有13人(男生10人，女生3人)存在脊柱侧弯高风险，需要进一步诊断和进行运动康复干预。",
				iTextPDFUtil.getColorFont(BaseColor.BLACK, 8, "微软雅黑"));
		cellBaseInfo = new PdfPCell(phrase);
		cellBaseInfo.setLeading(0f,1.4f);
		iTextPDFUtil.addTableHeaderData(tableBaseInfo, cellBaseInfo, 0, 60, 10, 30, new BaseColor(69, 153, 241),
				BaseColor.WHITE, 0, 0);

		tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(30f));
		document.add(tableBaseInfo);

		return this;
	}

	/**
	 * 创建PDF文档
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public File createPdfFile(String filePath) throws IOException {
		File file = new File(filePath);
		if (!file.exists()) {
			file.createNewFile();
		}
		return file;

	}

	// 设置PDF文档
	public Document getDocument(File file) throws Exception {
		Document document = new Document(PageSize.A4);
		return document;
	}

	// 设置PDF文档
	public PdfWriter getPdfWriter(Document document, File file) throws Exception {
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
		return writer;
	}

	/**
	 * 生成头部logo，公司信息，免责申明，打印时间等信息
	 * 
	 * @param cd
	 * @param topLogo
	 * @param slogan
	 * @param companyInformation
	 * @param exemptionFromdeClaration
	 * @throws DocumentException
	 * @throws IOException
	 */
	public DataAnalysisPDFReport addHeader(boolean isNewPage) throws DocumentException, IOException {
		// 是否创建新的页
		// 创建新页
		if (isNewPage) {
			document.newPage();
		}
		// 标题
		Font font = iTextPDFUtil.getColorFont(BaseColor.BLACK, 20, "微软雅黑");
		font.setStyle("bold");
		Paragraph paragraph = new Paragraph(36f,title, font);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		paragraph.setSpacingAfter(36);
		document.add(paragraph);
		// 图标
		// Image image = Image.getInstance(Base64.decode(topLogo));
		Image image = Image.getInstance(topLogo);
		// 设置图片大小
		image.scaleAbsolute(47.5f, 47.5f);
		// 设置图片绝对位置
		image.setAbsolutePosition(48, 755.4f);
		document.add(image);
		// slogan
		BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		// 加载文本
		cd.beginText();
		// 设置文本为中文、和字体大小
		cd.setFontAndSize(bf, 9);
		// 机构信息
		cd.showTextAligned(Element.ALIGN_LEFT, "机构信息：" + companyInformation, 48, 48, 0);
		// 免责申明
		cd.showTextAligned(Element.ALIGN_LEFT, "免责申明：" + exemptionFromdeClaration, 48, 38, 0);
		// 日期
		cd.showTextAligned(Element.ALIGN_LEFT, "打印日期：" + "2019-12-12", 48, 28, 0);
		
		if (isNewPage) {
			cd.showTextAligned(Element.ALIGN_LEFT, "2/2",540, 18, 0);
		}else {
			cd.showTextAligned(Element.ALIGN_LEFT, "1/2",540, 20, 0);
		}
		
		cd.endText();

		document.add(image);

		return this;
	}

	/**
	 * 生成底部公司二维码
	 * 
	 * @param bottomLogo 公司的二维码图片
	 * @throws DocumentException
	 * @throws IOException
	 */
	public DataAnalysisPDFReport addBottom() throws DocumentException, IOException {

		Image image = Image.getInstance(jsLogo);
		// 设置图片大小
		image.scaleAbsolute(80, 20);
		// 设置图片绝对位置
		image.setAbsolutePosition(467.3f, 75.1f);
		document.add(image);

		return this;

	}

	/**
	 * 创建表格
	 * 
	 * @param text
	 * @return
	 */
	public PdfPCell createTextCell(String text) {
		PdfPCell cell = new PdfPCell(new Phrase(text, iTextPDFUtil.getColorFont(BaseColor.BLACK, 9, "/Users/wanglei/Downloads/yahei.ttf")));
		cell.setBorderColor(new BaseColor(206, 206, 206));
		cell.setVerticalAlignment(Element.ALIGN_CENTER);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setFixedHeight(20);
		return cell;
	}
	
	
}
