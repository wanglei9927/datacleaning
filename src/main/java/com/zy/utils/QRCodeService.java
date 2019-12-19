package com.zy.utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * 生成二维码
 * @author wanglei
 *
 */
public class QRCodeService {
	
	private static final boolean NEEDCOMPRESS = false;  
	  
    private static String LOGO_URL;  
    // LOGO宽度  
    private static final int WIDTH = 60;  
    // LOGO高度  
    private static final int HEIGHT = 60;  
  
    static{  
        LOGO_URL = "/Users/wanglei/vip.png";// 测试图片路径地址  
    }  

    private static final String CHARSET = "UTF-8";

    public File encode(String contents, int width, int height, File qrFile) {
        //生成条形码时的一些配置
        Map<EncodeHintType, Object> hints = new HashMap<>();
        // 指定纠错等级,纠错级别（L 7%、M 15%、Q 25%、H 30%）
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        // 内容所使用字符集编码
        hints.put(EncodeHintType.CHARACTER_SET, CHARSET);

        BitMatrix bitMatrix;
        try {
            OutputStream out = new FileOutputStream(qrFile);
            // 生成二维码
            bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints);
            
            MatrixToImageWriter.writeToStream(bitMatrix, "png", out);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qrFile;
    }

    public File encodeWithLogo(File qrFile, File logoFile, File newQrFile) {
        OutputStream os = null ;
        try {
            Image image2 = ImageIO.read(qrFile) ;
            int width = image2.getWidth(null) ;
            int height = image2.getHeight(null) ;
            BufferedImage bufferImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB) ;
            //BufferedImage bufferImage =ImageIO.read(image) ;
            Graphics2D g2 = bufferImage.createGraphics();
            g2.drawImage(image2, 0, 0, width, height, null) ;
            int matrixWidth = bufferImage.getWidth();
            int matrixHeigh = bufferImage.getHeight();

            //读取Logo图片
            BufferedImage logo= ImageIO.read(logoFile);
            //开始绘制图片
            g2.drawImage(logo,matrixWidth/5*2,matrixHeigh/5*2, matrixWidth/5, matrixHeigh/5, null);//绘制
            BasicStroke stroke = new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
            g2.setStroke(stroke);// 设置笔画对象
            //指定弧度的圆角矩形
            RoundRectangle2D.Float round = new RoundRectangle2D.Float(matrixWidth/5*2, matrixHeigh/5*2, matrixWidth/5, matrixHeigh/5,20,20);
            g2.setColor(Color.white);
            g2.draw(round);// 绘制圆弧矩形

            //设置logo 有一道灰色边框
            BasicStroke stroke2 = new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
            g2.setStroke(stroke2);// 设置笔画对象
            RoundRectangle2D.Float round2 = new RoundRectangle2D.Float(matrixWidth/5*2+2, matrixHeigh/5*2+2, matrixWidth/5-4, matrixHeigh/5-4,20,20);
            g2.setColor(new Color(128,128,128));
            g2.draw(round2);// 绘制圆弧矩形

            g2.dispose();

            bufferImage.flush() ;
            os = new FileOutputStream(newQrFile) ;
            JPEGImageEncoder en = JPEGCodec.createJPEGEncoder(os) ;
            en.encode(bufferImage) ;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return newQrFile ;
    }

    /**
     * ZXing解码
     * @param qrFile
     * @return
     */
    public String decode(File qrFile) {
        BufferedImage image = null;
        Result result = null;
        try {
            image = ImageIO.read(qrFile);
            if (image == null) {
                System.out.println("the decode image may be not exit.");
            }
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            Map<DecodeHintType, Object> hints = new HashMap<>();
            hints.put(DecodeHintType.CHARACTER_SET, CHARSET);

            result = new MultiFormatReader().decode(bitmap, hints);
            return result.getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.getText() ;
    }
    
    
    
    public static ByteArrayOutputStream createQRCode(String data, int width, int height, String isPicture) {
    	  
  
        ByteArrayOutputStream bos = null;  
  
        MultiFormatWriter formatWriter = new MultiFormatWriter();  
  
        Hashtable<EncodeHintType, Object> param = new Hashtable<EncodeHintType, Object>();  
        param.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.Q);  
        param.put(EncodeHintType.CHARACTER_SET, "utf-8");  
        param.put(EncodeHintType.MARGIN, 0);  
  
        try{  
            BitMatrix bitMatrix = formatWriter  
                    .encode(data, BarcodeFormat.QR_CODE, width, height, param);  
            // 1.1去白边  
            int[] rec = bitMatrix.getEnclosingRectangle();  
            int resWidth = rec[2] + 1;  
            int resHeight = rec[3] + 1;  
            BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);  
            resMatrix.clear();  
            for (int i = 0; i < resWidth; i++){  
                for (int j = 0; j < resHeight; j++){  
                    if (bitMatrix.get(i + rec[0], j + rec[1])){  
                        resMatrix.set(i, j);  
                    }  
                }  
            }  
            int width1 = resMatrix.getWidth();  
            int height1 = resMatrix.getHeight();  
            BufferedImage qrcode = new BufferedImage(width1, height1, BufferedImage.TYPE_INT_RGB);  
            for (int x = 0; x < width1; x++){  
                for (int y = 0; y < height1; y++){  
                    qrcode.setRGB(x, y, resMatrix.get(x, y) == true ? Color.BLACK.getRGB() : Color.WHITE  
                            .getRGB());  
                }  
            }  
            // 添加logo图片  
            if (StringUtils.isNotEmpty(LOGO_URL) && StringUtils.isNotEmpty(isPicture)){  
                insertImage(width1, qrcode, LOGO_URL, NEEDCOMPRESS);  
            }  
            bos = new ByteArrayOutputStream();  
            ImageIO.write(qrcode, "png", bos);  
            
            return bos;
  
        } catch (Exception e){ 
            throw new RuntimeException(e);  
        } finally{  
            if (bos != null){  
                try{  
                    bos.close();  
                } catch (IOException e){  
                }  
            }  
        }  
  
    }  
    
    private static void insertImage(int QRCODE_SIZE, BufferedImage source, String imgPath,  
            boolean needCompress) throws Exception {  
        File file = new File(imgPath);  
        if (!file.exists()){  
            System.err.println("" + imgPath + "   该文件不存在！");  
            return;  
        }  
        Image src = ImageIO.read(new File(imgPath));  
        int width = src.getWidth(null);  
        int height = src.getHeight(null);  
        if (needCompress){ // 压缩LOGO  
            if (width > WIDTH){  
                width = WIDTH;  
            }  
            if (height > HEIGHT){  
                height = HEIGHT;  
            }  
            Image image = src.getScaledInstance(width, height, Image.SCALE_SMOOTH);  
            BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);  
            Graphics g = tag.getGraphics();  
            g.drawImage(image, 0, 0, null); // 绘制缩小后的图  
            g.dispose();  
            src = image;  
        }  
        // 插入LOGO  
        Graphics2D graph = source.createGraphics();  
        int x = (QRCODE_SIZE - width) / 2;  
        int y = (QRCODE_SIZE - height) / 2;  
        graph.drawImage(src, x, y, width, height, null);  
        // Shape shape = new RoundRectangle2D.Float(x, y, width, width, 6, 6);  
        graph.setStroke(new BasicStroke(3f));  
        // graph.draw(shape); 去除图片白边  
        graph.dispose();  
    }  
}
