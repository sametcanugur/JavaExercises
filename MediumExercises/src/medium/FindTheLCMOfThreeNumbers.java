package medium;

public class FindTheLCMOfThreeNumbers {

	public static void main(String[] args) {
		int[] array = { 19, 47, 43 };
		System.out.println(lcmFinder(array));
	}

	public static int lcmFinder(int[] array) {
		if (array.length != 3 || array[0] <= 0 || array[1] <= 0 || array[2] <= 0) {
			return -1;
		}

		int numberHolder = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					numberHolder = array[j];
					array[j] = array[j + 1];
					array[j + 1] = numberHolder;
				}
			}
		}

		String primes = "";
		for (int k = 2; k <= array[0]; k++) {
			boolean primeCheck = false;

			for (int m = 2; m < array[0]; m++) {
				if (k % m == 0 && k != m) {
					primeCheck = false;
					break;
				} else {
					primeCheck = true;
				}
			}

			if (primeCheck == true) {
				primes = primes + k + " ";
			}
		}

		int result = 1;
		String[] primeArray = primes.split(" ");

		for (int a = 0; a < primeArray.length; a++) {
			int counter = 0;

			for (int b = 0; b < array.length; b++) {
				if (array[b] % Integer.valueOf(primeArray[a]) == 0) {
					counter++;
					array[b] = array[b] / Integer.valueOf(primeArray[a]);
				}
			}

			if (counter > 0) {
				result = result * Integer.valueOf(primeArray[a]);
				a--;
			}
		}

		return result;
	}
}