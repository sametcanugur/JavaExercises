package medium;

import java.util.Arrays;

public class PositiveCountNegativeSum {

	public static void main(String[] args) {

		int[] array = { 91, -4, 80, -73, -28 };
		System.out.println(Arrays.toString(positiveAndNegativeNumberFinder(array)));
	}

	public static int[] positiveAndNegativeNumberFinder(int[] array) {

		int[] emptyArray = {};
		if (array.length == 0) {

			return emptyArray;
		}

		int positiveCount = 0;
		int sumOfNegatives = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0) {

				positiveCount++;
			}

			else {

				sumOfNegatives = sumOfNegatives + array[i];
			}
		}

		int[] resultArray = { positiveCount, sumOfNegatives };
		return resultArray;
	}
}