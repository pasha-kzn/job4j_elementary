package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int a, int b, int c) {
        return a > max(b, c) ? a : max(b, c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, b) > max(c, d) ? max(a, b) : max(c, d);
    }

    public static void main(String[] args) {
        System.out.println("Наибольшее число - " + max(3, 4));
    }
}
