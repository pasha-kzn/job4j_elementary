package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean b = true;
        char[] array = name.toCharArray();
        if (name.isEmpty()) {
            b = false;
        }
        for (char ch : array) {
            if ((!isSpecialSymbol(ch) | !isUpperLatinLetter(ch) | !isLowerLatinLetter(ch) | !isDigit(ch)) && !isLowerLatinLetter(array[0])) {
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
