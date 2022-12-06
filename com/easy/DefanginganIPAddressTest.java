package com.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefanginganIPAddressTest {

	@Test
	public void test() {
		String input = "address = \"1.1.1.1\"";
		System.out.println(DefanginganIPAddress.defangIPaddr(input));
		assertEquals("\"1[.]1[.]1[.]1\"", DefanginganIPAddress.defangIPaddr(input));
	}

}
