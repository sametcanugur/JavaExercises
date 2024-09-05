package medium;

public class LargestGap {

	public static void main(String[] args) {
		int[] array = { 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 };
		System.out.println(largestDifferenceFinder(array));
	}

	public static int largestDifferenceFinder(int[] array) {
		for (int i = 0; i < array.length; i++) {

			int numberHolder = 0;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					numberHolder = array[j];
					array[j] = array[j + 1];
					array[j + 1] = numberHolder;
				}
			}
		}

		int[] gapArray = new int[array.length - 1];
		for (int k = 0; k < gapArray.length; k++) {
			gapArray[k] = array[k + 1] - array[k];
		}

		for (int m = 0; m < gapArray.length; m++) {

			int numberHolder2 = 0;
			for (int n = 0; n < gapArray.length - 1; n++) {
				if (gapArray[n] < gapArray[n + 1]) {
					numberHolder2 = gapArray[n];
					gapArray[n] = gapArray[n + 1];
					gapArray[n + 1] = numberHolder2;
				}
			}
		}

		return gapArray[0];
	}
}