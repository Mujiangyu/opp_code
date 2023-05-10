package com.niit;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone("huawei",4999,"black");
        Phone p1 = new Phone("xiaomi",3999,"white");
        Phone p2 = new Phone("oppo",2999,"blue");

        Phone[] arr = new Phone[3];
        arr[0] = p;
        arr[1] = p1;
        arr[2] = p2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i].getPrice() + sum;
        }
        System.out.println("三部手机的平均价格是：" + (sum / arr.length));
    }
}
