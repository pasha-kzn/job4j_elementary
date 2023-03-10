package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {
        public static String validate(String password) {
            int upperCount = 0;
            int lowerCount = 0;
            int digitCount = 0;
            int specialCount = 0;
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        for (char p : password.toCharArray()) {
            if (isUpperCase(p)) {
                upperCount++;
            } else if (isLowerCase(p)) {
                lowerCount++;
            } else if (isDigit(p)) {
                digitCount++;
            } else if (!isDigit(p) && !isLetter(p)) {
                specialCount++;
            }
        }
        if (upperCount == 0) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (lowerCount == 0) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (digitCount == 0) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (specialCount == 0) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (containsSubstrings(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    public static boolean containsSubstrings(String password) {
        String[] subStr = {"qwerty", "12345", "password", "admin", "user"};
        for (String s : subStr) {
            if (password.toLowerCase().contains(s)) {
                return true;
            }
        }
        return false;
    }
}