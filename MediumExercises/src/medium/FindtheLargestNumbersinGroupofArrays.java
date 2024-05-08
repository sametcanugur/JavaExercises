package medium;

import java.util.Arrays;

public class FindtheLargestNumbersinGroupofArrays {

	public static void main(String[] args) {

		double[][] array = { { 0.4321, 0.7634, 0.652 }, { -32, -2, -65 }, { -54, 7, -43 } };
		System.out.println(Arrays.toString(largestNumberFinder(array)));
	}

	public static double[] largestNumberFinder(double[][] array) {

		double[] emptyArray = {};
		if (array == null || array.length == 0) {

			return emptyArray;
		}

		double numberHolder = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				for (int k = 0; k < array[i].length - 1; k++) {

					if (array[i][k] < array[i][k + 1]) {

						numberHolder = array[i][k];
						array[i][k] = array[i][k + 1];
						array[i][k + 1] = numberHolder;
					}
				}
			}
		}

		double[] resultArray = new double[array.length];
		for (int m = 0; m < resultArray.length; m++) {

			resultArray[m] = array[m][0];
		}

		return resultArray;
	}
}