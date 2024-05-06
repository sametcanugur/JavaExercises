package medium;

public class SameParity {

	public static void main(String[] args) {

		System.out.println(parityCheck(243));
	}

	public static boolean parityCheck(int number) {

		if (number < 0) {

			return false;
		}

		String intToString = String.valueOf(number);
		String[] array = intToString.split("");
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + Integer.valueOf(array[i]);
		}

		if ((number % 2 == 0 && sum % 2 == 0) || number % 2 != 0 && sum % 2 != 0) {

			return true;
		}

		return false;
	}
}
