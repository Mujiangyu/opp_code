package com.niit;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[3];

        Student stu1 = new Student(1,"hangman",20);
        Student stu2 = new Student(2,"lisi",21);
        Student stu3 = new Student(3,"wang",22);

        stu[0] = stu1;
        stu[1] = stu2;
        stu[2] = stu3;
        Student stu4 = new Student(4,"zhaoliu",23);
        //再添加一个学生对象，并在添加时验证学号的唯一性
        //把stu4添加到数组中

        //唯一性判断
        boolean flag = contains(stu,stu4.getId());
        if(flag){
            //已存在，不能添加
            System.out.println("学生id出现重复，请修改后在进行添加");
        }else {
            //id不存在，可以进行添加
            //1.若数组已满， ---创建一个新的数组，新数组的长度时stu[]的长度+1 将原来数组中的对象 和新添加的学生对象 存入到新数组中
            //2.若数组未满， ---直接添加
            //返回数组中的元素个数，从而进一步判断数组是否已满
            int count = getCount(stu);
            if(count ==stu.length){
                //数组存满
                //创建一个新的数组 长度 = 老数组长度 + 1
                //把老数组和新的对象添加到新数组中
                Student[] newArr = createArr(stu);
                //把要添加的对象加入到新的数组中去
                newArr[count] = stu4;
                //添加完毕后打印学生信息
                //数组存满和未存满所遍历的数组是不一样的，所以需要定义一个新的函数
                print(newArr);
            }else {
                //数组未存满
                stu[count] = stu4;
                //添加完毕后打印学生信息
                print(stu);
            }
        }

    }
    public static void print(Student[] stu){
        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                System.out.println(stu[i].getId()+", "+stu[i].getName()+", "+stu[i].getAge());
            }
        }
    }

    public static Student[] createArr(Student[] stu){
        Student[] arr = new Student[stu.length + 1];

        for (int i = 0; i < stu.length; i++) {
            //吧老数组中的元素添加到新数组中
            arr[i] = stu[i];
        }
        return arr;
    }

    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = arr[i].getId();
                if (id == sid) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] stu){
        int count = 0;
        for (int i = 0; i < stu.length; i++) {
            if(stu[i] != null){
                count++;
            }
        }
        return count;
    }
}
