package main;

/**
 * 
 * @author aboud methods to evaluate a sudoku represented in two dimensional
 *         array. the sudoku is a 9x9 and the blocks are 3x3
 * 
 */
public class TwoDimensionalArraySudokuEvaluator {

	public boolean evaluateSudoku(int[][] sudokuArray) {

		if (evaluateRows(buildRows(sudokuArray)) && evaluateColumns(buildColumns(sudokuArray))
				&& evaluateBlocks(buildBlocks(sudokuArray)))
			return true;
		return false;
	}

	public int[][] buildBlocks(int[][] sudokuArray) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[][] buildColumns(int[][] sudokuArray) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[][] buildRows(int[][] sudokuArray) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean evaluateRows(int[][] buildRows) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean evaluateBlocks(int[][] buildBlocks) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean evaluateColumns(int[][] buildColumns) {
		// TODO Auto-generated method stub
		return false;
	}
}
