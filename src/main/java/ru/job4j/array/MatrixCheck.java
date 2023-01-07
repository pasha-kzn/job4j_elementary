package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 1; i < board[row].length; i++) {
            if (board[row][i] != board[row][0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
