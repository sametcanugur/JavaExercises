package medium;

public class HarshadNumber {

	public static void main(String[] args) {
		System.out.println(divisibilityCheck(89));
	}

	public static boolean divisibilityCheck(int number) {
		if (number <= 0) {
			return false;
		}

		String converted = String.valueOf(number);
		String[] array = converted.split("");
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + Integer.valueOf(array[i]);
		}

		if (number % sum == 0) {
			return true;
		}

		return false;
	}
}
