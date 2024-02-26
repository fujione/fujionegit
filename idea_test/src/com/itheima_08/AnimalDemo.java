package com.itheima_08;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator animalOperator = new AnimalOperator();
        Cat cat = new Cat();
        animalOperator.useAnimal(cat);

        Dog dog = new Dog();
        animalOperator.useAnimal(dog);
    }
}
