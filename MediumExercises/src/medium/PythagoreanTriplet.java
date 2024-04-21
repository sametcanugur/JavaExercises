package medium;

public class PythagoreanTriplet {

	public static void main(String[] args) {

		System.out.println(equalityCheckingOnPythagoreanTriplet(72, 54, 90));
	}

	public static boolean equalityCheckingOnPythagoreanTriplet(int number1, int number2, int number3) {

		int[] array = { number1, number2, number3 };
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

		if ((array[0] * array[0]) + (array[1] * array[1]) == (array[2] * array[2])) {

			return true;
		}

		return false;
	}
}
