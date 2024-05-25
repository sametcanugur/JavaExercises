package medium;

public class ReturnSumofTwoSmallestNumbers {

	public static void main(String[] args) {
		int[] array = { 879, 953, 694, -847, 342, 221, -91, -723, 791, -587 };
		System.out.println(sumOfTwoSmallestNumber(array));
	}

	public static int sumOfTwoSmallestNumber(int[] array) {
		if (array == null) {
			return -1;
		}

		int numberHolder = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					numberHolder = array[j];
					array[j] = array[j + 1];
					array[j + 1] = numberHolder;
				}
			}
		}

		int sum = 0;
		int loopCount = 0;

		for (int k = 0; k < array.length; k++) {
			if (array[k] >= 0) {
				loopCount++;
				sum = sum + array[k];
			}

			if (loopCount == 2) {
				return sum;
			}
		}

		return sum;
	}
}