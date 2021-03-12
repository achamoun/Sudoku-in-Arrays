package main;

public class SudokuEvaluator {

	public SudokuEvaluator() {
		super();
	}

	protected boolean evaluateRows(int[][] rows) {

		for (int i = 0; i < rows.length; i++) {
			if (!isNoNumberMultipleTimes(rows[i]))
				return false;
		}
		return true;
	}

	protected boolean evaluateColumns(int[][] columns) {

		for (int i = 0; i < columns.length; i++) {
			if (!isNoNumberMultipleTimes(columns[i]))
				return false;
		}
		return true;
	}

	protected boolean evaluateBlocks(int[][] blocks) {

		for (int i = 0; i < blocks.length; i++) {
			if (!isNoNumberMultipleTimes(blocks[i]))
				return false;
		}

		return true;
	}

	/**
	 * this method will be recursively called to find out equal values in the array.
	 * it returns true only if each number in the array arr appears only one time in the
	 * array. otherwise it returns false.
	 * 
	 * @param arr
	 * @return
	 */
	public boolean isNoNumberMultipleTimes(int[] arr) {

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
		return isNoNumberMultipleTimes(restArray);
	}

}