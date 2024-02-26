package com.itheima_03;

public class Student extends fu{

    private String number;
    private String name;
    private String age;
    private String address;
    private int ages = 8;

    public Student() {
        System.out.println("子类中无参构造方法");

    }

    public Student(int a){
        System.out.println("子类中有参构造方法");
    }

    public Student(String number, String name, String age, String address) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void show (){
        System.out.println(this.ages);
    }
}
