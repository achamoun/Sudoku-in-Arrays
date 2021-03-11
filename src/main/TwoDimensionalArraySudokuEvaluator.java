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

	/**
	 * this method builds the rows of a 9x9 sudoku.
	 * 
	 * @param sudokuArray
	 * @return
	 */
	public int[][] buildRows(int[][] sudokuArray) {

		int[][] rows = new int[9][9];

		for (int i = 0; i < sudokuArray.length; i++) {
			for (int y = 0; y < sudokuArray.length; y++) {

				rows[y][i] = sudokuArray[i][y];
			}
		}
		return rows;
	}

	/**
	 * the columns of the 9x9 sudoku are already respresnted in the parameter.
	 * 
	 * @param sudokuArray
	 * @return
	 */
	public int[][] buildColumns(int[][] sudokuArray) {

		int[][] columns = new int[9][9];

		for (int i = 0; i < sudokuArray.length; i++) {
			for (int y = 0; y < sudokuArray.length; y++) {

				columns[i][y] = sudokuArray[i][y];
			}
		}

		return columns;
	}

	/**
	 * this method build the 3x3 blocks of the sudoku in arrays.
	 * 
	 * @param sudokuArray
	 * @return
	 */
	public int[][] buildBlocks(int[][] sudokuArray) {

		int[][] blocks = new int[9][9];

		for (int i = 0; i < sudokuArray.length; i++) {
			for (int y = 0; y < sudokuArray.length; y++) {

				blocks[((y / 3) * 3) + (i / 3)][((y % 3) * 3) + (i % 3)] = sudokuArray[i][y];
			}
		}

		return blocks;
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
