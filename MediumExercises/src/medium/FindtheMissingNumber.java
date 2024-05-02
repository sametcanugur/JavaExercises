package medium;

public class FindtheMissingNumber {

	public static void main(String[] args) {

		int[] inputArray = { 10, 5, 1, 2, 4, 6, 8, 3, 9 };
		System.out.println(numberCheckerInRange(inputArray));
	}

	public static int numberCheckerInRange(int[] inputArray) {

		if (inputArray == null) {

			return -1;
		}

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < inputArray.length; j++) {

				if (array[i] == inputArray[j]) {

					break;
				}

				if (j == inputArray.length - 1) {

					return array[i];
				}
			}
		}

		return -1;
	}
}
