package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        SwitchArray.swap(array, i, index);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] uncompressed = input;
        String[] compressed = compress(input);
        System.out.println("Uncompressed");
        for (int index = 0; index < uncompressed.length; index++) {
            System.out.print(uncompressed[index] + " ");
        }
        System.out.println();
        System.out.println("Compressed");
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
        System.out.println();
        System.out.println(input);
        System.out.println(uncompressed);
        System.out.println(compressed);
    }
}
