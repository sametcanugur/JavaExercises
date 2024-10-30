package medium;

public class ProductOfRemainingElements {

	public static void main(String[] args) {
		int[] array = { -1, -10, 1, -2, 20 };
		System.out.println(checkingProduct(array));
	}

	public static boolean checkingProduct(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int product = 1;

			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					product = product * array[j];
				}
			}

			if (product == array[i]) {
				return true;
			}
		}

		return false;
	}
}