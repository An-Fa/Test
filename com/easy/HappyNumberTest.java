package com.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void test() {
		HappyNumber num = new HappyNumber();
		assertTrue(num.isHappy(19));
	}

}
