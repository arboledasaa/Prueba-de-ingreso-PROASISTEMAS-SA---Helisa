package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		assertEquals(0, Solution.minimumSwaps(new int[] {}));
		assertEquals(0, Solution.minimumSwaps(new int[] { 1 }));
		assertEquals(3, Solution.minimumSwaps(new int[] { 4, 3, 1, 2 }));
		assertEquals(3, Solution.minimumSwaps(new int[] { 2, 3, 4, 1, 5 }));
		assertEquals(3, Solution.minimumSwaps(new int[] { 1, 3, 5, 2, 4, 6, 7 }));
		assertEquals(9, Solution.minimumSwaps(new int[] { 3, 7, 6, 9, 1, 8, 10, 4, 2, 5 }));
		assertEquals(46,
				Solution.minimumSwaps(new int[] { 2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14,
						33, 50, 21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35,
						20, 17, 45, 43, 25, 19 }));
	}

}
