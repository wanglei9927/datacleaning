package com.zy.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @Description iTextGeneratePDFSample
 * @author 小帅丶
 * @className iTextGeneratePDFSample
 * @Date 2019/7/18-11:27
 **/
public class TestExportPdf {
    //水印PDF
    public static final String DEST = "C:\\Users\\Administrator\\Desktop\\demo_watermark.pdf";
    public static void main(String[] args) throws Exception {
        //测试pdf保存路径
        String filePath = "C:\\Users\\Administrator\\Desktop\\demoxs.pdf";
//        Image image = Image.getInstance(IMG);
        File file = new File(filePath);

        //生成PDF文档
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document,new FileOutputStream(file));
        document.open();
        document.addAuthor("小帅丶");//作者
        document.addCreationDate();//创建时间
        document.addCreator("https://www.ydxiaoshuai.cn");//创建者
        document.addTitle("报告");//标题
        document.addSubject("报告");//主题
        document.addKeywords("iText 生成PDF 纯代码实现 表格 等效果 ");//关键字
        //顶部说明
        document.add(new Paragraph("报告内容涉及个人隐私，查询者应依法使用、妥善保管。", iTextPDFUtil.getColorFont(BaseColor.RED,19,"宋体")));
        document.add( Chunk.NEWLINE );
        //报告基础信息说明
        document.add(new Paragraph("报告方："+"有点小帅",iTextPDFUtil.getColorFont(BaseColor.BLACK,19,"宋体")));
        document.add(new Paragraph("报告编号："+"YDXS201907180001",iTextPDFUtil.getColorFont(BaseColor.BLACK,19,"宋体")));
        document.add(new Paragraph("查询时间："+"2019-07-18 13:31:51",iTextPDFUtil.getColorFont(BaseColor.BLACK,19,"宋体")));
        document.add( Chunk.NEWLINE );
        //高危预警
        PdfPTable table = new PdfPTable(2);
        table.setWidthPercentage(100);
        table.setHorizontalAlignment(Element.ALIGN_LEFT);
        PdfPCell cell = new PdfPCell(new Phrase("高危预警",iTextPDFUtil.getColorFont(BaseColor.WHITE)));
        table.addCell(iTextPDFUtil.addTitleCell(cell, 25, BaseColor.RED, 2, false));
        cell = new PdfPCell(new Phrase("无",iTextPDFUtil.getColorFont()));
        table.addCell(iTextPDFUtil.addBaseCell(cell));
        cell = new PdfPCell(new Phrase("未命中任何高危预警项目，请查看具体报告内容",iTextPDFUtil.getColorFont()));
        table.addCell(iTextPDFUtil.addBaseCell(cell));
        table.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //添加空行
        table.addCell(iTextPDFUtil.addBlankLine(10,2));
        document.add(table);


        PdfPTable tableMobileHeader = new PdfPTable(6);
        tableMobileHeader.setWidthPercentage(100);
        PdfPCell cellMobileHeader = new PdfPCell();

        Image radarImage = Image.getInstance("E:/JfreeChart/MySpiderWebPlot.png");
        cellMobileHeader = new PdfPCell(radarImage,false);
        cellMobileHeader.setRowspan(2);
        cellMobileHeader.setColspan(2);
        cellMobileHeader.setBorder(Rectangle.NO_BORDER);
        cellMobileHeader.setFixedHeight(100);
        tableMobileHeader.addCell(cellMobileHeader);
//        tableMobileHeader.addCell(iTextPDFUtil.addTitleCell(cellMobileHeader, 50, BaseColor.WHITE, 2, true));

        cellMobileHeader = new PdfPCell(new Phrase("预警总数",iTextPDFUtil.getColorFont()));
        cellMobileHeader.setUseBorderPadding(true);
        iTextPDFUtil.addTableHeaderData(tableMobileHeader,cellMobileHeader,2,null);

        cellMobileHeader = new PdfPCell(new Phrase("失信被执行人信息",iTextPDFUtil.getColorFont(BaseColor.WHITE,20,"黑体")));
        iTextPDFUtil.addTableHeaderData(tableMobileHeader,cellMobileHeader,0,new BaseColor(145,108,240));

        cellMobileHeader = new PdfPCell(new Phrase("存在失信记录",iTextPDFUtil.getColorFont(BaseColor.WHITE,20,"黑体")));
        iTextPDFUtil.addTableHeaderData(tableMobileHeader,cellMobileHeader,0,new BaseColor(240,113,62));

        cellMobileHeader = new PdfPCell(new Phrase("特殊名单核查",iTextPDFUtil.getColorFont(BaseColor.WHITE,20,"黑体")));
        iTextPDFUtil.addTableHeaderData(tableMobileHeader,cellMobileHeader,0,new BaseColor(44,154,241));

        cellMobileHeader = new PdfPCell(new Phrase("风险关注名单",iTextPDFUtil.getColorFont(BaseColor.WHITE,20,"黑体")));
        iTextPDFUtil.addTableHeaderData(tableMobileHeader,cellMobileHeader,0,new BaseColor(235,87,75));

        cellMobileHeader = new PdfPCell(new Phrase("逾期名单",iTextPDFUtil.getColorFont(BaseColor.WHITE,20,"黑体")));
        iTextPDFUtil.addTableHeaderData(tableMobileHeader,cellMobileHeader,0,new BaseColor(40,193,111));

        cellMobileHeader = new PdfPCell(new Phrase("过往存在逾期记录",iTextPDFUtil.getColorFont(BaseColor.WHITE,20,"黑体")));
        iTextPDFUtil.addTableHeaderData(tableMobileHeader,cellMobileHeader,0,new BaseColor(44,154,241));

        tableMobileHeader.addCell(iTextPDFUtil.addBlankLine(20,6));
        document.add(tableMobileHeader);


        //信息核验
        document.add(iTextPDFUtil.addTableGroupLine("信息核验"));
        PdfPTable tableBaseInfo = new PdfPTable(2);
        PdfPCell cellBaseInfo = new PdfPCell();
        tableBaseInfo.setWidthPercentage(100);
        tableBaseInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
        /********身份信息核验************/
        iTextPDFUtil.addTableGroupTitle(tableBaseInfo,cellBaseInfo,"身份信息核验",3);
        //姓名
        cellBaseInfo = new PdfPCell(new Phrase("姓名",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        cellBaseInfo = new PdfPCell(new Phrase("有点小帅",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //身份证号
        cellBaseInfo = new PdfPCell(new Phrase("身份证号",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        cellBaseInfo = new PdfPCell(new Phrase("110000******000010",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo));
        float[] cloumnWithsBaseInfoIdCard =new float[]{10f,30f};
        tableBaseInfo.setWidths(cloumnWithsBaseInfoIdCard);
        //身份二要素验证
        cellBaseInfo = new PdfPCell(new Phrase("手机号",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo,false));
        cellBaseInfo = new PdfPCell(new Phrase("188****8888",iTextPDFUtil.getColorFont()));
        tableBaseInfo.addCell(iTextPDFUtil.addBaseCell(cellBaseInfo,false));
        tableBaseInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //核查建议
        iTextPDFUtil.addSuggestLine(tableBaseInfo, cellBaseInfo, "该客户身份信息核验正常",new BaseColor(79,170,246));
        //添加空行
        tableBaseInfo.addCell(iTextPDFUtil.addBlankLine(20,2));
        document.add(tableBaseInfo);

        PdfPTable tableMobileInfo = new PdfPTable(2);
        PdfPCell cellMobileInfo = new PdfPCell();
        tableMobileInfo.setWidthPercentage(100);
        tableMobileInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
        /********手机信息核验************/
        iTextPDFUtil.addTableGroupTitle(tableMobileInfo,cellMobileInfo,"手机信息核验",3);
        //手机三要素验证
        cellMobileInfo = new PdfPCell(new Phrase("手机三要素验证",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo));
        cellMobileInfo = new PdfPCell(new Phrase("一致",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo));
        tableMobileInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //手机在网状态
        cellMobileInfo = new PdfPCell(new Phrase("手机在网状态",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo));
        cellMobileInfo = new PdfPCell(new Phrase("正常",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo));
        tableMobileInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //手机在网时长
        cellMobileInfo = new PdfPCell(new Phrase("手机在网时长",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo));
        cellMobileInfo = new PdfPCell(new Phrase("24个月以上",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo));
        tableMobileInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //手机消费档次
        cellMobileInfo = new PdfPCell(new Phrase("手机消费档次",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo,false));
        cellMobileInfo = new PdfPCell(new Phrase("移动，近三月平均金额50-100元",new Font(iTextPDFUtil.getFont())));
        tableMobileInfo.addCell(iTextPDFUtil.addBaseCell(cellMobileInfo,false));
        tableMobileInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //核查建议
        iTextPDFUtil.addSuggestLine(tableMobileInfo, cellMobileInfo, "手机三要素验证一致",new BaseColor(245,163,112));
        //添加空行
        tableMobileInfo.addCell(iTextPDFUtil.addBlankLine(20,2));
        document.add(tableMobileInfo);

        PdfPTable tableBankInfo = new PdfPTable(2);
        PdfPCell cellBankInfo = new PdfPCell();
        tableBankInfo.setWidthPercentage(100);
        tableBankInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
        /********银行卡信息核验(选填项)************/
        iTextPDFUtil.addTableGroupTitle(tableBankInfo,cellBankInfo,"银行卡信息核验(选填项)",3);
        //银行卡四要素核验
        cellBankInfo = new PdfPCell(new Phrase("银行卡四要素核验",iTextPDFUtil.getColorFont()));
        tableBankInfo.addCell(iTextPDFUtil.addBaseCell(cellBankInfo));
        cellBankInfo = new PdfPCell(new Phrase("一致",iTextPDFUtil.getColorFont()));
        tableBankInfo.addCell(iTextPDFUtil.addBaseCell(cellBankInfo));
        tableBankInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //添加空行
        tableBankInfo.addCell(iTextPDFUtil.addBlankLine(20,2));
        document.add(tableBankInfo);
        //公检法信息
        document.add(iTextPDFUtil.addTableGroupLine("公检法信息"));
        PdfPTable tablePCInfo = new PdfPTable(2);
        PdfPCell cellPCInfo = new PdfPCell();
        tablePCInfo.setWidthPercentage(100);
        tablePCInfo.setHorizontalAlignment(Element.ALIGN_LEFT);
        /********公安负面信息************/
        iTextPDFUtil.addTableGroupTitle(tablePCInfo,cellPCInfo,"公安负面信息",3);
        //违法行为
        cellPCInfo = new PdfPCell(new Phrase("违法行为",iTextPDFUtil.getColorFont()));
        tablePCInfo.addCell(iTextPDFUtil.addBaseCell(cellPCInfo,false));
        cellPCInfo = new PdfPCell(new Phrase("金融诈骗案",iTextPDFUtil.getColorFont()));
        tablePCInfo.addCell(iTextPDFUtil.addBaseCell(cellPCInfo,false));
        tablePCInfo.setWidths(iTextPDFUtil.getColumnWiths(10f,30f));
        //核查建议
        iTextPDFUtil.addSuggestLine(tablePCInfo, cellPCInfo, "该客户存在公安负面信息，违约风险较大，不建议授信",new BaseColor(240,61,61));
        //添加空行
        tablePCInfo.addCell(iTextPDFUtil.addBlankLine(20,2));
        document.add(tablePCInfo);
        //失信被执行人信息
        PdfPTable breakFithTable = new PdfPTable(5);
        PdfPCell breakFithCell = new PdfPCell();
        breakFithTable.setWidthPercentage(100);
        breakFithTable.setHorizontalAlignment(Element.ALIGN_LEFT);
        iTextPDFUtil.addTableGroupTitle(breakFithTable,breakFithCell,"失信被执行人信息",5);
        //实际渲染数据 循环即可
        //表头1
        breakFithCell = new PdfPCell(new Phrase("序号",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("姓名",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("执行案号",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("执行法院",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("案件执行状态",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        //数据行1
        breakFithCell = new PdfPCell(new Phrase("1",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("艾腾祥",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("(2018) 沪0115执15507号",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("上海市浦东新区人民法院",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("-",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        //表头2
        breakFithCell = new PdfPCell(new Phrase("   ",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("执行依据文号",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("执行依据单位",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("被执行人履行情况",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("发布日期",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        //数据行2
        breakFithCell = new PdfPCell(new Phrase("   ",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("(2018) 沪0115执15507号",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("上海市浦东新区人民法院",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("全部未履行",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("2018-08-03",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        //数据行3
        breakFithCell = new PdfPCell(new Phrase("失信公告详情",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("有履行能力而拒不履行生效法律文...",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("   ",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("   ",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("-",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        //数据行4
        breakFithCell = new PdfPCell(new Phrase("失信人被执行人行为具体情形",iTextPDFUtil.getColorFont(new BaseColor(204,204,204))));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("有履行能力而拒不履行生效法律文书确定义务",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("   ",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("   ",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        breakFithCell = new PdfPCell(new Phrase("   ",iTextPDFUtil.getColorFont()));
        breakFithTable.addCell(iTextPDFUtil.addBaseCell(breakFithCell));
        document.add(breakFithTable);
        //添加空行
        breakFithTable.addCell(iTextPDFUtil.addBlankLine(20,5));
        //额外处理的建议表格
        PdfPTable breakFootTable = new PdfPTable(2);
        breakFootTable.setWidthPercentage(100);
        breakFootTable.setHorizontalAlignment(Element.ALIGN_LEFT);
        PdfPCell breakFootCell = new PdfPCell();
        iTextPDFUtil.addSuggestLine(breakFootTable, breakFootCell, "存在失信记录，违约风险较大，不建议授信", new BaseColor(240,61,61),0,20f,50f);
        document.add(breakFootTable);

        document.add(Chunk.NEWLINE);
        //添加图片
//        document.add(image);
        document.add(Chunk.NEWLINE);
        document.add(new Paragraph("请妥善保管报告",new Font(iTextPDFUtil.getFont())));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        document.close();
        //添加文本水印
        FileInputStream input1 = new FileInputStream(file);
        FileOutputStream output2 = new FileOutputStream(new File(DEST));
        iTextPDFUtil.stringWaterMark(input1, output2, "有点小帅", 4, 5, 0.2f,45, 26,BaseColor.BLACK);//文字水印
//        iTextPDFUtil.imageWaterMark(input1, output2, IMG, 0.2f);
    }

}