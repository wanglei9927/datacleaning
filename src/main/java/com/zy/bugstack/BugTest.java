package com.zy.bugstack;

import org.junit.Test;

public class BugTest {

    @Test
    public void test(){
        B b = new B();
        b.scan();  //我的输出结果是什么？
    }
    static class A {
        public void scan(){
            doScan();
        }
        protected void doScan(){
            System.out.println("A.doScan");
        }
    }
    static class B extends A {
        @Override
        protected void doScan() {
            System.out.println("B.doScan");
        }
    }
}
