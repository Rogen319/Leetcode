package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import problemSet.MoveZero;

public class TestMoveZero {

	private static MoveZero moveZero = new MoveZero();
	@Test
	public void testMoveZeroes() {
		int[] nums = {12,0,5,8,0,4,7,69,102,0};
		int[] expected = {12,5,8,4,7,69,102,0,0,0};
		moveZero.moveZeroes(nums);
		assertArrayEquals(expected, nums);
	}

}
