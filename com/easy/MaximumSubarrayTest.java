package com.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSubarrayTest {

	@Test
	public void test() {
		int[] input = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray subarray = new MaximumSubarray();
		
		assertEquals(6, subarray.maxSubArray(input));
	}

}
