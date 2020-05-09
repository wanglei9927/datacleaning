package com.zy.collection;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class ArrayListTest {


    /***
     * arrayList 源码分析
     * 参考：https://github.com/Snailclimb/JavaGuide/blob/master/docs/java/collection/ArrayList-Grow.md
     */
    @Test
    public void test1() {

        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        //arraycopy()方法实现数组自己复制自己
        //elementData:源数组;index:源数组中的起始位置;elementData：目标数组；index + 1：目标数组中的起始位置； size - index：要复制的数组元素的数量；
        System.arraycopy(a, 1, a, 4, 3);

        //a[2] = 99;
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


    @Test
    public void test2(){

        List<String> list= Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
    }
}
