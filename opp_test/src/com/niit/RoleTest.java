package com.niit;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("青山",100,'男');
        Role r2 = new Role("会会",100,'女');
        //展示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();
        int count = 0;
        while (true) {

            System.out.println("第 " + (count+ 1)+ " 回合");
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + " KO了 " + r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + " KO了 " + r1.getName());
                break;
            }
            count++;
        }


    }
}
