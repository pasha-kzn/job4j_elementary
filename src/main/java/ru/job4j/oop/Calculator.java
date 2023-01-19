package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int n) {
        return sum(n) + multiply(n) + minus(n) + divide(n);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println(result);
        result = minus(10);
        System.out.println(result);
        result = calculator.divide(5);
        System.out.println(result);
        result = calculator.sumAllOperation(5);
        System.out.println(result);
    }
}
