package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.TwoDimensionalArraySudokuEvaluator;

/**
 * 
 * @author aboud
 * 
 *         Tests for the evaluator of the sudoku represented in a two
 *         dimensional array. The sudokuTrue array is in
 *         https://en.wikipedia.org/wiki/Sudoku
 */
public class TwoDimensionalArraySudokuEvaluatorTests {

	TwoDimensionalArraySudokuEvaluator validator = new TwoDimensionalArraySudokuEvaluator();

	int[][] sudokuTrue = { { 5, 6, 1, 8, 4, 7, 9, 2, 3 }, { 3, 7, 9, 5, 2, 1, 6, 8, 4 }, { 4, 2, 8, 9, 6, 3, 1, 7, 5 },
			{ 6, 1, 3, 7, 8, 9, 5, 4, 2 }, { 7, 9, 4, 6, 5, 2, 3, 1, 8 }, { 8, 5, 2, 1, 3, 4, 7, 9, 6 },
			{ 9, 3, 5, 4, 7, 8, 2, 6, 1 }, { 1, 4, 6, 2, 9, 5, 8, 3, 7 }, { 2, 8, 7, 3, 1, 6, 4, 5, 9 } };

	int[][] sudokuFalseColumn = { { 5, 6, 5, 8, 4, 7, 9, 2, 3 }, { 3, 7, 9, 5, 2, 1, 6, 8, 4 },
			{ 4, 2, 8, 9, 6, 3, 1, 7, 5 }, { 6, 1, 3, 7, 8, 9, 5, 4, 2 }, { 7, 9, 4, 6, 5, 2, 3, 1, 8 },
			{ 8, 5, 2, 1, 3, 4, 7, 9, 6 }, { 9, 3, 5, 4, 7, 8, 2, 6, 1 }, { 1, 4, 6, 2, 9, 5, 8, 3, 7 },
			{ 2, 8, 7, 3, 1, 6, 4, 5, 9 } };

	int[][] sudokuFalseLine = { { 5, 6, 1, 8, 4, 7, 9, 2, 3 }, { 5, 7, 9, 5, 2, 1, 6, 8, 4 },
			{ 4, 2, 8, 9, 6, 3, 1, 7, 5 }, { 6, 1, 3, 7, 8, 9, 5, 4, 2 }, { 7, 9, 4, 6, 5, 2, 3, 1, 8 },
			{ 8, 5, 2, 1, 3, 4, 7, 9, 6 }, { 9, 3, 5, 4, 7, 8, 2, 6, 1 }, { 1, 4, 6, 2, 9, 5, 8, 3, 7 },
			{ 2, 8, 7, 3, 1, 6, 4, 5, 9 } };

	int[][] sudokuFalseBlock = { { 5, 6, 1, 8, 4, 7, 9, 2, 3 }, { 3, 7, 9, 5, 2, 1, 6, 8, 4 },
			{ 4, 5, 8, 9, 6, 3, 1, 7, 5 }, { 6, 1, 3, 7, 8, 9, 5, 4, 2 }, { 7, 9, 4, 6, 5, 2, 3, 1, 8 },
			{ 8, 5, 2, 1, 3, 4, 7, 9, 6 }, { 9, 3, 5, 4, 7, 8, 2, 6, 1 }, { 1, 4, 6, 2, 9, 5, 8, 3, 7 },
			{ 2, 8, 7, 3, 1, 6, 4, 5, 9 } };

	@Test
	void evaluateSudokuTest() {
		assertTrue(validator.evaluateSudoku(sudokuTrue));
		assertFalse(validator.evaluateSudoku(sudokuFalseBlock));
		assertFalse(validator.evaluateSudoku(sudokuFalseColumn));
		assertFalse(validator.evaluateSudoku(sudokuFalseLine));

	}
}
