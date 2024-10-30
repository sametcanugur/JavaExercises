package medium;

public class NumberedCards {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4, 5 }, { 9, 8, 7, 6, 5 } };
		System.out.println(compareNumbersInArrays(array));
	}

	public static boolean compareNumbersInArrays(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array[0].length - 1; j++) {
				int numberHolder1 = 0;

				if (array[0][j] < array[0][j + 1]) {
					numberHolder1 = array[0][j];
					array[0][j] = array[0][j + 1];
					array[0][j + 1] = numberHolder1;
				}
			}
		}

		for (int m = 0; m < array[1].length; m++) {
			for (int k = 0; k < array[1].length - 1; k++) {
				int numberHolder2 = 0;

				if (array[1][k] < array[1][k + 1]) {
					numberHolder2 = array[1][k];
					array[1][k] = array[1][k + 1];
					array[1][k + 1] = numberHolder2;
				}
			}
		}

		String array0 = String.valueOf(array[0][0]) + String.valueOf(array[0][1]);
		int result1 = Integer.valueOf(array0);
		String array1 = String.valueOf(array[1][0]) + String.valueOf(array[1][1]);
		int result2 = Integer.valueOf(array1);

		if (result1 > result2) {
			return true;
		}

		else {
			return false;
		}
	}
}