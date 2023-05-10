package com.niit;

public class Goods {
    private String name;
    private int id;
    private double price;
    private int remain;

    public Goods() {
    }

    public Goods(String name, int id, double price, int remain) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.remain = remain;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return remain
     */
    public int getRemain() {
        return remain;
    }

    /**
     * 设置
     * @param remain
     */
    public void setRemain(int remain) {
        this.remain = remain;
    }
}
