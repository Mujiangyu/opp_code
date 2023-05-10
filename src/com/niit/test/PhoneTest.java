package com.niit.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "xiaomi";
        p.price = 1999;

        //打印成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用类中的方法
        p.call();
        p.playGame();
    }
}
