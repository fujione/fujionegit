package com.itheima_03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest01 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你的选择");
                String s = sc.nextLine();
                if (s.equals("1")) {
                    addStudent(students);
                    break;
                } else if (s.equals("2")) {
                    deleteStudent(students);
                    break;
                } else if (s.equals("3")) {
                    updateStudent(students);
                    break;
                } else if (s.equals("4")) {
                    findStudent(students);
                    break;
                } else if (s.equals("5")) {
                    System.out.println("谢谢使用");
                    return;
                } else {
                    System.out.println("无该选项，请重新输入");
                }
            }
        }
    }

    public static void addStudent(ArrayList<Student> students) {
        Student temps = new Student();
        System.out.println("请输入学号");
        Scanner scanner = new Scanner(System.in);
        temps.setNumber(scanner.nextLine());
        while (isUsed(students,temps.getNumber())) {
            System.out.println("该学号已存在，请重新输入！");
            temps.setNumber(scanner.nextLine());
        }
        System.out.println("请输入姓名");
        temps.setName(scanner.nextLine());
        System.out.println("请输入年龄");
        temps.setAge(scanner.nextLine());
        System.out.println("请输入学生居住地");
        temps.setAddress(scanner.nextLine());
        students.add(temps);
        System.out.println("添加学生成功");

    }

    public static void deleteStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要删除学生的学号");
            String s = scanner.nextLine();
            for (Student temps : students) {
                if (temps.getNumber().equals(s)) {
                    students.remove(temps);
                    System.out.println("删除学生成功");
                    return;
                }
            }
            System.out.println("不存在该学号！");
        }
    }

    public static void findStudent(ArrayList<Student> students) {
        if(students.size()==0){
            System.out.println("暂无学生信息，请先添加");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (Student temps : students) {
            System.out.println(temps.getNumber() + "\t" + temps.getName() + "\t" + temps.getAge() + "\t" + temps.getAddress());
        }
    }

    public static void updateStudent(ArrayList<Student> students){
        System.out.println("请输入要修改信息的学生学号");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        for (Student temps:students){
            if (temps.getNumber().equals(number)){
                System.out.println("请输入学生新姓名");
                temps.setName(scanner.nextLine());
                System.out.println("请输入学生新年龄");
                temps.setAge(scanner.nextLine());
                System.out.println("请输入学生新居住地");
                temps.setAddress(scanner.nextLine());
                System.out.println("修改学生信息成功");
                return;
            }
        }
        System.out.println("不存在该学号！");
    }

    public static boolean isUsed(ArrayList<Student> students,String id) {
//        if (students.size() > 0) {
            for (Student temps : students) {
                if (temps.getNumber().equals(id)) {
                    return true;
                }
            }
            return false;
//        } else {
//            return false;
//        }
    }
}
