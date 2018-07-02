package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {

	public static boolean intArraySorted(int[] sorted) {
		for (int i = 0; i < sorted.length - 1; i++) {
			if (sorted[i] > sorted[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean doubleArraySorted(double[] unsorted) {
		for (int i = 0; i < unsorted.length - 1; i++) {
			if (unsorted[i] > unsorted[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean charArraySorted(char[] sorted) {
		for (int i = 0; i < sorted.length - 1; i++) {
			if (sorted[i] > sorted[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean stringArraySorted(String[] unsorted) {
		for (int i = 0; i < unsorted.length - 1; i++) {
			if (unsorted[i].compareTo(unsorted[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}

}
