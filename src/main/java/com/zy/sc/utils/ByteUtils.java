package com.zy.sc.utils;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Locale;

public class ByteUtils {
    // byte转十六进制字符串
    public static String bytes2HexString(byte[] bytes) {
        String ret = "";
        for (byte aByte : bytes) {
            String hex = Integer.toHexString(aByte & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            ret += hex.toUpperCase(Locale.CHINA);
        }
        return ret;
    }

    /** * 将16进制的字符串转换为字节数组 *
     * @param message * @return 字节数组 */
    public static byte[] getHexBytes(String message) {
        int len = message.length() / 2;
        char[] chars = message.toCharArray();
        String[] hexStr = new String[len];
        byte[] bytes = new byte[len];
        for (int i = 0, j = 0; j < len; i += 2, j++) {
            hexStr[j] = "" + chars[i] + chars[i + 1];
            bytes[j] = (byte) Integer.parseInt(hexStr[j], 16);
        }
        return bytes;
    }

    public static String byteArrayToStr(byte[] byteArray) {
        if (byteArray == null||byteArray.length==0) {
            return null;
        }
        String Str ="";
        if(byteArray.length%2==0){
            //为偶数的  合并成角度
            for (int i=0;i<byteArray.length/2;i++){
                Str+=getCorner(new byte[]{byteArray[i*2],byteArray[i*2+1]})+ ",";
            }
        }else{
            //为奇数，不计算角度
            for (byte b:byteArray
                    ) {
                byte[] b2 = new byte[]{b};
                Str+=binary(b2,10) + ",";
            }
        }
        return Str.substring(0,Str.length()-1);
    }

    /**
     * 将byte[]转为各种进制的字符串
     * @param bytes byte[]
     * @param radix 基数可以转换进制的范围，从Character.MIN_RADIX到Character.MAX_RADIX，超出范围后变为10进制
     * @return 转换后的字符串
     */
    public static String binary(byte[] bytes, int radix){
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数
    }

    /**
     * 计算出角度
     * @param bytes
     * @return
     */
    public static String getCorner(byte[] bytes){
        short a1=byteToShort(bytes);
        byte s[]=new byte[2];
        s[0]=(byte)(a1&0xff);
        s[1]=(byte)(a1>>>8);

        int a = a1;
//        int a=s[1]*256+s[0];
//        int a=s[0];
        double d = (double)a/10;
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(d)+"";
    }

    /**
     * 注释：字节数组到short的转换！
     *
     * @param b
     * @return
     */
    public static short byteToShort(byte[] b) {
        short s = 0;
        short s0 = (short) (b[1] & 0xff);// 最低位
        short s1 = (short) (b[0] & 0xff);//
        s1 <<= 8;
        s = (short) (s0 | s1);
        return s;
    }
}
