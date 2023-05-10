package com.niit;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] stu = new Student[3];

        Student stu1 = new Student(1,"hangman",20);
        Student stu2 = new Student(2,"lisi",21);
        Student stu3 = new Student(3,"wang",22);

        stu[0] = stu1;
        stu[1] = stu2;
        stu[2] = stu3;
        //通过id删除学生的信息
        int index = getIndex(stu,1);
//        System.out.println(index);

        if(index >= 0){
            //找到索引，可以删除
            stu[index] = null;
            print(stu);
        }else {
            //未找到学生信息，提示删除失败
            System.out.println("当前id不存在，删除失败");
        }
    }

    public static void delete(){
    }

    public static int getIndex(Student[] arr, int id){
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
