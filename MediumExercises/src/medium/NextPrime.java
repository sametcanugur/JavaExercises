package medium;

public class NextPrime {

	public static void main(String[] args) {
		System.out.println(primeNumberFinder(20));
	}

	public static int primeNumberFinder(int number) {
		if (number < 0) {
			return -1;
		}

		if (number < 3) {
			return 2;
		}

		boolean check1 = true;
		for (int i = 2;; i++) {

			boolean check2 = false;
			if (number % i == 0) {
				check1 = false;
			}

			if (i == number - 1 && check1 == true) {
				return number;
			}

			if (i > number) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					}

					if (j == i - 1) {
						check2 = true;
					}
				}

				if (check2 == true) {
					return i;
				}
			}
		}
	}
}