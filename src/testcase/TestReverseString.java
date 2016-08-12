package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import problemSet.ReverseString_RightVersion;

public class TestReverseString {

	ReverseString_RightVersion reverseString  = new ReverseString_RightVersion();
	@Test
	public void test() {
		String s = "hello, world";
		String result = reverseString.reverseString(s);
		assertEquals("dlrow ,olleh", result);
	}

}
