package medium;

import java.util.Arrays;

public class FactorizeNumber {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(factorsOfNumberFinder(17)));
	}

	public static int[] factorsOfNumberFinder(int number) {

		int count = 0;
		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {

				count++;
			}
		}

		int[] resultArray = new int[count];
		int k = 0;
		for (int j = 1; j <= number; j++) {

			if (number % j == 0) {

				resultArray[k] = j;
				k++;
			}
		}

		return resultArray;
	}
}