package com.easy;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SingleNumberTest {

	@Test
	public void test() {
		SingleNumber singelNum = new SingleNumber();
		ArrayList<Integer> numsList = new ArrayList<Integer>();
		numsList.add(2);
		numsList.add(1);
		numsList.add(2);
		int[] nums = numsList.stream().mapToInt(Integer::intValue).toArray();
		assertEquals(1, singelNum.singleNumber(nums));
	}

	@Test
	public void test2() {
		SingleNumber singelNum = new SingleNumber();
		ArrayList<Integer> numsList = new ArrayList<Integer>();
		numsList.add(4);
		numsList.add(1);
		numsList.add(2);
		numsList.add(1);
		numsList.add(2);
		int[] nums = numsList.stream().mapToInt(Integer::intValue).toArray();
		assertEquals(4, singelNum.singleNumber(nums));
	}
	
}
