package com.niit;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] girl = new GirlFriend[4];
        GirlFriend girl1 = new GirlFriend("小美",18,'女',"看电影");
        GirlFriend girl2 = new GirlFriend("小丽",20,'女',"逛街");
        GirlFriend girl3 = new GirlFriend("小莎",23,'女',"旅游");
        GirlFriend girl4 = new GirlFriend("小红",22,'女',"听音乐");

        girl[0] = girl1;
        girl[1] = girl2;
        girl[2] = girl3;
        girl[3] = girl4;

        int sum = 0;
        for (int i = 0; i < girl.length; i++) {
            sum = sum + girl[i].getAge();
        }
        int avg = sum / girl.length;
        System.out.println(avg);

        int count = 0;
        for (int j = 0; j < girl.length; j++) {
            if(girl[j].getAge() < avg){
                System.out.println(girl[j].getName()+", " + girl[j].getAge() + ", " + girl[j].getGender()+ ", "+girl[j].getHobby());
                count++;
            }
        }
        System.out.println(count);
    }
}
