package com.niit;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("huawei",001,1999.98,1000);
        Goods g2 = new Goods("保温杯",002,199,1000);
        Goods g3 = new Goods("枸杞",003,19,1000);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods good = arr[i];
            System.out.println(good.getId()+", "+good.getName()+", "+good.getPrice()+", "+good.getRemain());
        }
    }
}
