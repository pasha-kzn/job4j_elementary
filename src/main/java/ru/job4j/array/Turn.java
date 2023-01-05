package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            SwitchArray.swap(array, i, array.length - i - 1);
            if (i >= array.length / 2 - 1) {
                break;
            }
        }
        return array;
    }
}
