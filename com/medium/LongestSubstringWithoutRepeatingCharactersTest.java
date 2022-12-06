package com.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

	@Test
	public void test() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring("pwwkew");
		assertEquals(3, ans);
	}
	
	@Test
	public void test2() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring("abcabcbb");
		assertEquals(3, ans);
	}
	
	@Test
	public void test3() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring("");
		assertEquals(0, ans);
	}
	
	@Test
	public void test4() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring(" ");
		assertEquals(1, ans);
	}
	
	@Test
	public void test5() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring("1");
		assertEquals(1, ans);
	}
	
	@Test
	public void test6() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring("au");
		assertEquals(2, ans);
	}
	
	@Test
	public void test7() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring("aab");
		assertEquals(2, ans);
	}
	
	@Test
	public void test8() {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		int ans = test.lengthOfLongestSubstring("dvdf");
		assertEquals(3, ans);
	}

}
