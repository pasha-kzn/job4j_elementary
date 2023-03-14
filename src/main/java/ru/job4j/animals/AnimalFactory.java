package ru.job4j.animals;

public class AnimalFactory {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Monkey monkey = new Monkey();
        System.out.println(cat.name);
        System.out.println(dog);
        System.out.println(monkey);
    }
}
