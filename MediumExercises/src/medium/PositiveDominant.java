package medium;

public class PositiveDominant {

	public static void main(String[] args) {
		int[] array = { 0, -4, -1 };
		System.out.println(dominantNumberChecker(array));
	}

	public static boolean dominantNumberChecker(int[] array) {
		int positiveCounter = 0;
		int negativeCounter = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < i + 1; j++) {
				if (array[i] == array[j] && i != j) {
					break;
				}

				if (array[i] > 0) {
					if (i == 0 || i == j) {
						positiveCounter++;
						break;
					}
				}

				if (array[i] < 0) {
					if (i == 0 || i == j) {
						negativeCounter++;
						break;
					}
				}
			}
		}

		if (positiveCounter > negativeCounter) {
			return true;
		}

		return false;
	}
}