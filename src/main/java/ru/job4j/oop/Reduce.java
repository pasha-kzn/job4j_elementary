package ru.job4j.max;

public class Reduce {
    private int[] arrayClass;

    public void to(int[] array) {
        arrayClass = array;
    }

    public void print() {
        for (int index = 0; index < arrayClass.length; index++) {
            System.out.println(arrayClass[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}