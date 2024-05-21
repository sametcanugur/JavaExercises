package medium;

public class PuzzlePieces {

	public static void main(String[] args) {
		int[] array1 = { 1, 8, 5, 0, -1, 7 };
		int[] array2 = { 0, -7, -4, 1, 2, -6 };
		System.out.println(comparisonOfArraysIndexsSum(array1, array2));
	}

	public static boolean comparisonOfArraysIndexsSum(int[] firstArray, int[] secondArray) {
		if (firstArray.length != secondArray.length || (firstArray.length == 1 && secondArray.length == 1)) {
			return false;
		}

		int indexSum1 = 0;
		int indexSum2 = 0;
		for (int i = 0; i < firstArray.length - 1; i++) {
			indexSum1 = firstArray[i] + secondArray[i];
			indexSum2 = firstArray[i + 1] + secondArray[i + 1];

			if (indexSum1 != indexSum2) {
				return false;
			}
		}

		return true;
	}
}