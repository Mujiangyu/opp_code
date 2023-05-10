package com.niit;

public class StudentTest3 {
    public static void main(String[] args) {
        Student[] stu = new Student[3];

        Student stu1 = new Student(1,"hangman",20);
        Student stu2 = new Student(2,"lisi",21);
        Student stu3 = new Student(3,"wang",22);

        stu[0] = stu1;
        stu[1] = stu2;
        stu[2] = stu3;

        int index = search(stu,2);
        if(index >= 0){
            stu[index].setAge(stu[index].getAge()+1);
            print(stu);
        }else {
            System.out.println("该学生不存在，无法操作");
        }

    }

    public static int search(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(id == sid){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void print(Student[] stu){
        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                System.out.println(stu[i].getId()+", "+stu[i].getName()+", "+stu[i].getAge());
            }
        }
    }
}
