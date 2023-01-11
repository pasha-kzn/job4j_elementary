package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean b = true;
        char[] array = name.toCharArray();
        if (name.isEmpty() || !isLowerLatinLetter(array[0])) {
            b = false;
        }
        for (int i = 1; i < array.length; i++) {
            if (isSpecialSymbol(array[i]) && isUpperLatinLetter(array[i]) && isLowerLatinLetter(array[i]) && !isDigit(array[i])) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
