package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println("Наибольшее число - " + max(3, 4));
    }
}
