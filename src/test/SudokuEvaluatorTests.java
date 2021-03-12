package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.SudokuEvaluator;

public class SudokuEvaluatorTests {

	SudokuEvaluator validator = new SudokuEvaluator();

	@Test
	void findEqualValuesTest() {
		assertTrue(validator.isNoNumberMultipleTimes(new int[] { 1, 3, 5, 6, 7, 8, 9, 0 }));
		assertTrue(validator.isNoNumberMultipleTimes(new int[] { 8 }));
		assertFalse(validator.isNoNumberMultipleTimes(new int[] { 1, 3, 5, 6, 5, 8, 9, 0 }));
		assertFalse(validator.isNoNumberMultipleTimes(new int[] { 1, 3, 5, 6, 5, 8, 9, 1 }));
		assertFalse(validator.isNoNumberMultipleTimes(new int[] { 1, 3, 5, 6, 5, 8, 9, 9 }));

	}
}
