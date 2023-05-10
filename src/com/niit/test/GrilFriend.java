package com.niit.test;

import java.awt.geom.Ellipse2D;

public class GrilFriend {
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        if (age >= 18 && age <=30) {
            this.age = age;//this.age 表示的是成员变量中的age，而没有加this的age表示对是set方法中传递的变量，二者是不一样的
        }else {             //变量一般采取就近原则，即变量一般采用离他最近的变量
            System.out.println("非法输入");
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //针对每一个私有化成员变量，都要提供set和get方法
}
