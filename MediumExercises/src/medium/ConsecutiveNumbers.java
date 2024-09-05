package medium;

public class ConsecutiveNumbers {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 3, 2 };
		System.out.println(checkConsecutivity(array));
	}

	public static boolean checkConsecutivity(int[] array) {
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

		for (int k = 0; k < array.length - 1; k++) {
			if (array[k] + 1 != array[k + 1]) {
				return false;
			}
		}

		return true;
	}
}