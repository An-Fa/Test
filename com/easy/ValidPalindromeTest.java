package com.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPalindromeTest {

	@Test
	public void test() {
		ValidPalindrome vp = new ValidPalindrome();
		assertTrue(vp.isPalindrome(""));
	}

	@Test
	public void test2() {
		ValidPalindrome vp = new ValidPalindrome();
		assertTrue(vp.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	@Test
	public void test3() {
		ValidPalindrome vp = new ValidPalindrome();
		assertFalse(vp.isPalindrome("race a car"));
	}
	
	@Test
	public void test4() {
		ValidPalindrome vp = new ValidPalindrome();
		assertTrue(vp.isPalindrome(" "));
	}
	
	@Test
	public void test5() {
		ValidPalindrome vp = new ValidPalindrome();
		assertFalse(vp.isPalindrome("0P"));
	}
}
