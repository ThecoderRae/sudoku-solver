package org.sibe;

public class SudokuSolver {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };
    }


    /**
     * This method determines whether a given number exists in a specified row oaram number The integer to search for.
     * @param row The index of the row to search within.
     * @return {@code true} if the number is found, otherwise {@code false}.
     */
    public static Boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }


    /**
     * This method determines whether a given number exists in a specified column of a 2D array.
     *f a 2D array.
     *
     * @param board  The 2D array to search in.
     * @param number The integer to search for.
     * @param column The index of the column to search within.
     * @return {@code true} if the number is found, otherwise {@code false}.
     */
    private static Boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }


    /**
     * This method determines whether a given number exists in a 3x3 box of a 2D array.
     *
     * @param board  The 2D array to search in.
     * @param number The integer to search for.
     * @param row The index of the row to search within.
     * @param column The index of the column to search within.
     * @return {@code true} if the number is found, otherwise {@code false}.
     */
    private static Boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        return null;
    }

}