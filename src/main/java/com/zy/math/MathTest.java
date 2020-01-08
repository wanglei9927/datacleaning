package com.zy.math;

import org.junit.Test;

public class MathTest {


   /**
    * 右移一位相当于除以2
    */
   @Test
   public void test1(){

      int i = 4;

      System.out.println(i>>1);

   }

   /**
    * java 中如何进行 进制转换
    * Integer 中存在 10进制转其他进制的方法
    */
   @Test
   public void test2(){

      int n =18;

      System.out.println(n+"的八进制是:"+Integer.toBinaryString(n));
      System.out.println(n+"的二进制是:"+Integer.toOctalString(n));
      System.out.println(n+"的十六进制是:"+Integer.toHexString(n));
      System.out.println(n+"的三进制是:"+Integer.toString(n,3));


      //十六进制转成十进制
      Integer.valueOf("FFFF",16).toString();
      //八进制转成十进制
      Integer.valueOf("876",8).toString();
      //二进制转十进制
      Integer.valueOf("0101",2).toString();

   }

   @Test
   public void test3(){


      System.out.println(9>>1);
      System.out.println(Integer.valueOf("100",2).toString());
      System.out.println(Integer.valueOf("1001",2).toString());
   }
}
