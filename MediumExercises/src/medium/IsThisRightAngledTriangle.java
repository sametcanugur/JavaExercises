package medium;

public class IsThisRightAngledTriangle {

	public static void main(String[] args) {

		System.out.println(checkingRightAngledTriangle(145, 100, 105));
	}

	public static boolean checkingRightAngledTriangle(int x, int y, int z) {

		int[] array = { x, y, z };
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

		if ((array[0] * array[0]) + (array[1] * array[1]) == array[2] * array[2]) {

			return true;
		}

		return false;
	}
}
