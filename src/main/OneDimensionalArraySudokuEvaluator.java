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

	private boolean evaluateRows(int[][] rows) {

		for (int i = 0; i < rows.length; i++) {
			if (!findEqualValues(rows[i]))
				return false;
		}
		return true;
	}

	private boolean evaluateColumns(int[][] columns) {

		for (int i = 0; i < columns.length; i++) {
			if (!findEqualValues(columns[i]))
				return false;
		}
		return true;
	}

	private boolean evaluateBlocks(int[][] blocks) {

		for (int i = 0; i < blocks.length; i++) {
			if (!findEqualValues(blocks[i]))
				return false;
		}

		return true;
	}

	/**
	 * this method will be recursively called 
	 * to find out equal values in the array
	 * 
	 * @param arr
	 * @return
	 */
	public boolean findEqualValues(int[] arr) {

		if (arr.length == 1)
			return true;
		int[] restArray = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			if (arr[0] == arr[i]) {
				return false;
			} else {
				restArray[i - 1] = arr[i];
			}
		}
		return findEqualValues(restArray);
	}
}
