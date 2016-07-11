package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import problemSet.AddByBitOperator;

public class TestAddByBitOperator {
	
	private static AddByBitOperator addByBitOperator = new AddByBitOperator();

	@Test
	public void testAddByBitOperator() {
		int ans = addByBitOperator.addByBitOperator(5, 7);
		assertEquals(12, ans);
		
		ans = addByBitOperator.multiply(5, 6);
		assertEquals(30, ans);
	}

}
