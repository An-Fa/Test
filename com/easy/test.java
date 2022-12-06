package com.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		ValidPalindrome vp = new ValidPalindrome();
		assertTrue(vp.isPalindrome(""));
	}

}
