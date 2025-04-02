package org.sibe;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.sibe.SudokuSolver.isNumberInRow;

public class SudokuSolverTests {

    int[][] testBoard = {
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


    @Test
    void testIsNumberInRowPositive() {
        boolean isInRow = isNumberInRow(testBoard, 7, 0);
        assertTrue(isInRow, "Seven should be in the first row");
    }


    @Test
    void testIsNumberInRowNegative() {
        boolean isInRow = isNumberInRow(testBoard, 7, 2);
        assertFalse(isInRow, "Seven should not be in the third row");
    }
}
