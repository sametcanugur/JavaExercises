package medium;

public class FindPrimorial {

	public static void main(String[] args) {
		System.out.println(findingPrimeNumber(8));
	}

	public static int findingPrimeNumber(int n) {
		if (n == 0) {
			return -1;
		}

		if (n == 1) {
			return 2;
		}

		int multiplied = 2;
		int counter = 1;

		for (int i = 3;; i++) {

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}

				if (j == i - 1) {
					multiplied = multiplied * i;
					counter++;
				}
			}

			if (counter == n) {
				return multiplied;
			}
		}
	}
}