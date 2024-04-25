package medium;

import java.util.Arrays;

public class ReturntheObjectsKeysandValues {

	public static void main(String[] args) {

		String[] array = { "Zeyzey", "Apple", "Appl", "App", "Appler", "Men", "Baba", "Mend", "Ceyhan", "Menderes" };
		System.out.println(Arrays.toString(alphabeticallySorter(array)));
	}

	public static String[] alphabeticallySorter(String[] inputArray) {

		String[] emptyArray = {};
		if (inputArray == null || inputArray == emptyArray) {

			return emptyArray;
		}

		for (int i = 0; i < inputArray.length; i++) {

			int k = 0;
			for (int j = 0; j < inputArray.length - 1; j++) {

				int asciiValue1 = inputArray[j].charAt(k);
				int asciiValue2 = inputArray[j + 1].charAt(k);
				String stringHolder = "";

				if (asciiValue1 > asciiValue2) {

					stringHolder = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = stringHolder;
					k = 0;
				}

				if (asciiValue1 == asciiValue2) {

					if (k == inputArray[j + 1].length() - 1) {

						stringHolder = inputArray[j];
						inputArray[j] = inputArray[j + 1];
						inputArray[j + 1] = stringHolder;
						k = 0;
					}

					else if (k == inputArray[j].length() - 1) {

						k = 0;

					} else {

						k++;
						j--;
					}
				}

				if (asciiValue1 < asciiValue2) {

					k = 0;
				}
			}
		}

		return inputArray;
	}
}