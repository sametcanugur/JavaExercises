package medium;

import java.util.Arrays;

public class EliminateOddNumbers {

	public static void main(String[] args) {

		int[] array = { 718, 991, 449, 644, 380, 440 };
		System.out.println(Arrays.toString(oddNumberEliminater(array)));
	}

	public static int[] oddNumberEliminater(int[] inputArray) {

		int[] emptyArray = {};
		if (inputArray == null || inputArray.length == 0) {

			return emptyArray;
		}

		int evenCounter = 0;
		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] % 2 == 0) {

				evenCounter++;
			}
		}

		if (evenCounter == 0) {

			return emptyArray;
		}

		int[] resultArray = new int[evenCounter];
		int k = 0;
		for (int j = 0; j < inputArray.length; j++) {

			if (inputArray[j] % 2 == 0) {

				resultArray[k] = inputArray[j];
				k++;
			}
		}

		return resultArray;
	}
}