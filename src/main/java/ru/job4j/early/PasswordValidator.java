package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!hasUppercaseLetter(password.toCharArray())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLowercaseLetter(password.toCharArray())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasDigit(password.toCharArray())) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecialCharacter(password.toCharArray())) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (containsSubstrings(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    public static boolean hasUppercaseLetter(char[] pass) {
        for (char p : pass) {
            if (isUpperCase(p)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowercaseLetter(char[] pass) {
        for (char p : pass) {
            if (isLowerCase(p)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDigit(char[] pass) {
        for (char p : pass) {
            if (isDigit(p)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialCharacter(char[] pass) {
        for (char p : pass) {
            if (!isDigit(p) && !isLetter(p)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSubstrings(String password) {
        int rsl;
        String[] subStr = {"qwerty", "12345", "password", "admin", "user"};
        for (int i = 0; i < subStr.length; i++) {
            rsl = password.toLowerCase().indexOf(subStr[i]);
            if (rsl != -1) {
                return true;
            }
        }
        return false;
    }
}