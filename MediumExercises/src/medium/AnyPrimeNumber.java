package medium;

public class AnyPrimeNumber {

	public static void main(String[] args) {

		System.out.println(primeNumberCheckerInRange(10, 15));
	}

	public static boolean primeNumberCheckerInRange(int number1, int number2) {

		if (number2 == 0 || number2 == 1 || number2 == 2 || number1 > number2) {

			return false;
		}

		for (int i = number1; i <= number2; i++) {

			boolean check = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					check = false;
					break;
				}
			}

			if (check == true) {

				return true;
			}
		}

		return false;
	}
}
