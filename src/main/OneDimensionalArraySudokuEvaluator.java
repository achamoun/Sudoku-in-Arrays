package main;


/**
 * 
 * @author aboud
 *	
 * methods to evaluate a sudoku represented in a one dimensional array.
 * the methods are meant to evaluate a sudoku with 9x9 grid and 3x3 blocks. 
 *	
 */
public class OneDimensionalArraySudokuEvaluator {

	public boolean evaluateSudoku(int[] sudokuArray) {
		if (evaluateRows(sudokuArray) && evaluateColoumns(sudokuArray) && evaluateBlocks(sudokuArray))
			return true;
		return false;
	}

	private boolean evaluateRows(int[] sudokuArrays) {
		return false;
	}

	private boolean evaluateColoumns(int[] sudokuArrays) {
		return false;
	}

	private boolean evaluateBlocks(int[] sudokuArrays) {
		return false;
	}

	private boolean evaluateRow(int[] row) {
		return false;
	}

	private boolean evaluateColoumn(int[] coloumn) {
		return false;
	}

	private boolean evaluateBlock(int[] block) {
		return false;
	}
}
