package com.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteColumnstoMakeSortedTest {

	@Test
	public void test() {
		DeleteColumnstoMakeSorted dc = new DeleteColumnstoMakeSorted();
		String[] s = new String[] {"cba","daf","ghi"};
		assertEquals(1, dc.minDeletionSize(s));
	}

	@Test
	public void test2() {
		DeleteColumnstoMakeSorted dc = new DeleteColumnstoMakeSorted();
		String[] s = new String[] {"a","b"};
		assertEquals(0, dc.minDeletionSize(s));
	}
	
	@Test
	public void test3() {
		DeleteColumnstoMakeSorted dc = new DeleteColumnstoMakeSorted();
		String[] s = new String[] {"zyx","wvu","tsr"};
		assertEquals(3, dc.minDeletionSize(s));
	}
	
}
