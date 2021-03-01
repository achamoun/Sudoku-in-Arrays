package main;

/**
 * 
 * @author aboud
 * 
 *         methods to evaluate a sudoku represented in a one dimensional array.
 *         the methods are meant to evaluate a sudoku with 9x9 grid and 3x3
 *         blocks.
 * 
 */
public class OneDimensionalArraySudokuEvaluator {

	public boolean evaluateSudoku(int[] sudokuArray) {
		if (evaluateRows(sudokuArray) && evaluateColoumns(sudokuArray) && evaluateBlocks(sudokuArray))
			return true;
		return false;
	}

	/**
	 * this method builds the rows of the sudoku. each 9 array entries make a row of
	 * the 9x9 sudoku.
	 * 
	 * @param sudokuArray
	 * @return boolean
	 */
	private boolean evaluateRows(int[] sudokuArray) {

		int[] row = new int[9];
		for (int i = 0; i < sudokuArray.length; i++) {
			int divisionResult = 0;

			if (i / 9 == divisionResult) {
				int index = i % 9;
				row[index] = sudokuArray[i];
				if (index == 8 && !evaluateColoumn(row)) {
					return false;
				}
			}
			divisionResult++;
		}

		return true;
	}

	private boolean evaluateColoumns(int[] sudokuArray) {
		return false;
	}

	private boolean evaluateBlocks(int[] sudokuArray) {
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
