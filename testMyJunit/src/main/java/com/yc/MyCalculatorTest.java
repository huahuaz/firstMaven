package com.yc;

import com.yc.junit.*;
import d0331.Calculator;

public class MyCalculatorTest {
    private Calculator cal;

    @MyBeforeClass
    public static void bc(){
        System.out.println("beforeClass");
    }

    @MyBefore
    public void setUp() throws Exception {
        System.out.println("before");
        cal = new Calculator();
    }

    @MyAfter
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @MyAfterClass
    public static void ac(){
        System.out.println("afterClass");
    }

    @MyTest
    public void add() {
        System.out.println("add测试");
    }

    @MyTest
    public void sub() {
        System.out.println("sub测试");
    }
}