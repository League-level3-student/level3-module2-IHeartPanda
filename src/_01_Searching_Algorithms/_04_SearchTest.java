package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		String[] testLinear = new String[5];
		testLinear[0] = "first";
		testLinear[1] = "second";
		testLinear[2] = "third";
		testLinear[3] = "fourth";
		testLinear[4] = "fifth";
		assertEquals(2, _00_LinearSearch.linearSearch(testLinear, "third"));
		assertEquals(0, _00_LinearSearch.linearSearch(testLinear, "first"));
		assertEquals(4, _00_LinearSearch.linearSearch(testLinear, "fifth"));
}

	@Test
	void testBinarySearch() {
		int[] testBinary = new int[5];
		testBinary[0] = 0; 
		testBinary[1] = 1;
		testBinary[2] = 2;
		testBinary[3] = 3;
		testBinary[4] = 4;
		assertEquals(2, _01_BinarySearch.binarySearch(testBinary, 0, 4, 2));
		assertEquals(-1, _01_BinarySearch.binarySearch(testBinary, 0, 4, 15));
		assertEquals(3, _01_BinarySearch.binarySearch(testBinary, 0, 4, 3));
	}
	
	@Test
	void testInterpolationSearch() {
		int[] testInter = new int[5];
		testInter[0] = 0;
		testInter[1] = 1;
		testInter[2] = 2;
		testInter[3] = 3;
		testInter[4] = 4;
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(testInter, 2));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(testInter, 10));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(testInter, 4));
		
	}
	
	@Test
	void testExponentialSearch() {
		int[] testExpon = new int[5];
		testExpon[0] = 0;
		testExpon[1] = 1;
		testExpon[2] = 2;
		testExpon[3] = 3;
		testExpon[4] = 4;
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(testExpon, 0));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(testExpon, 10));
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(testExpon, 3));
	}
}
