package com.itheima_06;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        teacher.setName("老李");
        teacher.setAge(39);
        System.out.println(teacher.getName()+","+teacher.getAge());
        teacher.teach();

        Teacher teacher1 = new Teacher("老王",33);
        System.out.println(teacher1.getName()+","+teacher1.getAge());
        teacher1.teach();
    }


}
