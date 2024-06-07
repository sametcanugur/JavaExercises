package medium;

import java.util.Arrays;

public class PurgeandOrganize {

	public static void main(String[] args) {
		int[] array = { 9, 1, 4, 4, 9, 6, 3, 6, 1, 6 };
		System.out.println(Arrays.toString(arrayArranger(array)));
	}

	public static int[] arrayArranger(int[] inputArray) {
		int[] emptyArray = {};
		if (inputArray.length == 0) {
			return emptyArray;
		}

		int numberHolder = 0;
		for (int i = 0; i < inputArray.length; i++) {

			for (int j = 0; j < inputArray.length - 1; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					numberHolder = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = numberHolder;
				}
			}
		}

		String induplicate = String.valueOf(inputArray[0]);
		for (int k = 0; k < inputArray.length; k++) {

			for (int m = 0; m < k; m++) {
				if (inputArray[k] == inputArray[m]) {
					break;
				}

				if (m == k - 1) {
					induplicate = induplicate + String.valueOf(inputArray[k]);
				}
			}
		}

		int[] resultArray = new int[induplicate.length()];
		String[] splitArray = induplicate.split("");

		for (int n = 0; n < resultArray.length; n++) {
			resultArray[n] = Integer.valueOf(splitArray[n]);
		}

		return resultArray;
	}
}