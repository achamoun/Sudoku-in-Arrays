package main;

/**
 * 
 * @author aboud
 * 
 *         methods to build the rows, columns and blocks of a sudoku represented
 *         in a one dimensional array. the sudoku is with 9x9 grid and 3x3 blocks.
 * 
 */
public class OneDimensionalArraySudokuEvaluator extends SudokuEvaluator {

	public boolean evaluateSudoku(int[] sudokuArray) {

		if (evaluateRows(buildRows(sudokuArray)) && evaluateColumns(buildColumns(sudokuArray))
				&& evaluateBlocks(buildBlocks(sudokuArray)))
			return true;
		return false;
	}

	/**
	 * this method builds the rows of the 9x9 sudoku.
	 * 
	 * @param sudokuArray
	 * @return sudoku rows
	 */
	public int[][] buildRows(int[] sudokuArray) {

		int[][] rows = new int[9][9];

		for (int i = 0; i < sudokuArray.length; i++) {
			rows[i / 9][i % 9] = sudokuArray[i];
		}

		return rows;

	}

	/**
	 * this method builds the columns of the 9x9 sudoku.
	 * 
	 * @param sudokuArray
	 * @return sudoku coloumns
	 */
	public int[][] buildColumns(int[] sudokuArray) {

		int[][] columns = new int[9][9];

		for (int i = 0; i < sudokuArray.length; i++) {
			columns[i % 9][i / 9] = sudokuArray[i];
		}

		return columns;
	}

	/**
	 * this method builds the 3x3 blocks of the sudoku
	 * 
	 * @param sudokuArray
	 * @return
	 */
	public int[][] buildBlocks(int[] sudokuArray) {

		int[][] blocks = new int[9][9];

		for (int i = 0; i < sudokuArray.length; i++) {
			blocks[((i % 9) / 3) + (((i / 9) / 3) * 3)][(i % 3) + (((i / 9) % 3) * 3)] = sudokuArray[i];
		}

		return blocks;
	}
}
