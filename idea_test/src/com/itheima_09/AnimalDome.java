package com.itheima_09;

public class AnimalDome {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.setAge(33);
        animal.setName("jiafei");
        System.out.println(animal.getAge()+" "+animal.getName());
        animal.eat();

        animal = new Cat("加菲",33);
        System.out.println(animal.getAge()+" "+animal.getName());
        animal.eat();
    }
}
