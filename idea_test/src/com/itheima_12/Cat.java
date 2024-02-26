package com.itheima_12;

public class Cat implements Jumpping{

    private int age;
    public String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Cat jumpping");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;

        return name != null ? name.equals(cat.name) : cat.name == null;
    }
}
