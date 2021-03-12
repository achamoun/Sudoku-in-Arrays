package main;

public class SudokuEvaluator {

	public SudokuEvaluator() {
		super();
	}

	protected boolean evaluateRows(int[][] rows) {
	
		for (int i = 0; i < rows.length; i++) {
			if (!findEqualValues(rows[i]))
				return false;
		}
		return true;
	}

	protected boolean evaluateColumns(int[][] columns) {
	
		for (int i = 0; i < columns.length; i++) {
			if (!findEqualValues(columns[i]))
				return false;
		}
		return true;
	}

	protected boolean evaluateBlocks(int[][] blocks) {
	
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