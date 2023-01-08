package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        while (money > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (money >= coins[i]) {
                    rsl[size] = coins[i];
                    size++;
                    money -= coins[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
