package com.itheima_10;

public abstract class Animal {
    private int age = 33;
    private final String city = "北京";

    public Animal(){

    };

    public Animal(int age){
        this.age = age;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("睡觉");
    }

    public void show(){
        age = 30;
        System.out.println(age);
        System.out.println(city);
    }
}
