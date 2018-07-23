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
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
