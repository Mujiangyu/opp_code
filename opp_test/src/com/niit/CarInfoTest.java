package com.niit;

import java.util.Scanner;

public class CarInfoTest {
    public static void main(String[] args) {
        CarInfo[] arr = new CarInfo[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建三个汽车对象，并手动输入变量，存入到数组中
            CarInfo c = new CarInfo();
            String brand = sc.next();
            c.setBrand(brand);
            int price = sc.nextInt();
            c.setPrice(price);
            String color = sc.next();
            c.setColour(color);

            arr[i] = c;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            CarInfo car = arr[i];
            System.out.println(car.getBrand()+","+car.getColour()+", "+car.getPrice());
        }
    }
}
