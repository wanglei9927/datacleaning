package com.zy.sc.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BleDataUtils {


    public static String toRadians(String  i)
    {
        String[] list = i.split(",");
        String result = "";
        for (int k=0;k<list.length;k++) {
            float angel = Float.valueOf(list[k])/2;
//            result += (float) (Math.PI * angel / 180)+",";
            result += new BigDecimal(Math.tan(Math.PI* angel/180)*2).setScale(4, RoundingMode.HALF_UP)+",";
        }

        if(!("").equals(result)){
            result = result.substring(0,result.length()-1);
        }
        return  result;
    }

//    //画曲线
//    public static void drawLine{
//
//
//
//    :Integer;
//    x0,y0,x1,y1,xd,sideLeft,sideRight:Real;
//    num,rem,err,cnt,max:Integer;
//    xp,yp:array[0..5]of Real;
//    d1:Real;
//    str1:string;
//    {
//    //清空曲线区域
//    Form1.img1.Refresh;
//    markPosition();                                   //计算标记点的显示位置
//    //画图准备 曲线
//    form1.Canvas.Pen.Color:=clBlack;                  //黑色
//    form1.Canvas.Pen.Width:=3;                        //线宽3
//    form1.Canvas.Pen.Style:=psSolid;                  //实线
//    //画出数据曲线 胸椎
//    flag :=0;
//    x0:= form1.img1.Left +238;                        //坐标
//    y0:= form1.img1.Top +84;
//    x1:=x0;
//    y1:=y0;
//    xd:=x1;
//    sideLeft :=x0-198;
//    sideRight:=x0+198;
//    num :=0;    //120/148
//    rem :=120;  //120%148
//    err :=0;
//    j :=0;
//    multi :=2;																		    //倍率
//  for i := 0 to 147 do                              //显示点数
//    {
//    cnt := num;                                     //处理余数
//    err := err +rem;
//    if err >=148 then
//            {
//    cnt:=cnt +1;
//    err:=err-148;
//    };
//    if cnt>0 then
//            {
//    ang:=0;
//    max:=j+cnt;
//    temp :=j;
//      for j := temp to max-1 do
//    {
//    ang := ang +angledata[j];
//    };
//    ang:=Round(ang/cnt);                        //局部数据平均
//      if ang>600 then
//            {
//    ang :=600;
//    };
//      if ang<-600 then
//            {
//    ang :=-600;
//    };
//    d1:=Pi*ang/10/180;                           //角度转弧度
//    d1:= tan(d1);                                 //正切值
//    d1:= d1*multi;                                //倍率
//    x1:=x0 +d1;                                   //xy坐标
//    y1:=y0 +multi;
//      if flag=0 then                                //起点坐标
//            {
//    flag:=1;
//        form1.Canvas.MoveTo(Round(x0),Round(y0));   //光标移动到此处
//    };
//    xd:=x1;
//      if xd<sideLeft then                           //显示区域限制
//    {
//    xd:=sideLeft;
//    }
//      else
//              if xd>sideRight then
//    {
//    xd:=sideRight;
//    };
//      form1.Canvas.LineTo(Round(xd),Round(y1));     //画线
//    multi :=2;																		//倍率
//    }
//    else
//    {
//    multi :=4;																			//倍率
//    };
//    for k := 0 to 5 do                              //判断位置相同
//    {
//      if pos[k]=i then
//    {
//    xp[k]:=xd;
//    yp[k]:=y1;
//    };
//    };
//    if cnt>0 then                                   //更新
//            {
//    x0:=x1;
//    y0:=y1;
//    };
//    };
//    //画出数据曲线 腰椎
//    num :=0;    //50/80
//    rem :=50;   //50%80
//    err :=0;
//  for i := 148 to 227 do                                 //显示点数
//    {
//    cnt := num;                                       //处理余数
//    err := err +rem;
//    if err >=80 then
//            {
//    cnt:=cnt +1;
//    err:=err-80;
//    };
//    ang:=0;
//    max:=j+cnt;
//    temp :=j;
//    for j := temp to max-1 do
//    {
//    ang := ang +angledata[j];
//    };
//    if cnt>0 then
//            {
//    ang:=Round(ang/cnt);                        //局部数据平均
//      if ang>600 then
//            {
//    ang :=600;
//    };
//      if ang<-600 then
//            {
//    ang :=-600;
//    };
//    d1:=Pi*ang/10/180;                          //角度转弧度
//    d1:= tan(d1);                               //正切值
//    d1:= d1*multi;                              //倍率
//    x1:=x0 +d1;                                    //xy坐标
//    y1:=y0 +multi;
//    xd:=x1;
//      if xd<sideLeft then                           //显示区域限制
//    {
//    xd:=sideLeft;
//    }
//      else
//              if xd>sideRight then
//    {
//    xd:=sideRight;
//    };
//      form1.Canvas.LineTo(Round(xd),Round(y1));     //画线
//    multi :=2;																		//倍率
//    }
//    else
//    {
//    multi :=4;																			//倍率
//    };
//    for k := 0 to 5 do                              //判断位置相同
//    {
//      if pos[k]=i then
//    {
//    xp[k]:=xd;
//    yp[k]:=y1;
//    };
//    };
//    if cnt>0 then                                   //更新
//            {
//    x0:=x1;
//    y0:=y1;
//    };
//    };
//    }
}
