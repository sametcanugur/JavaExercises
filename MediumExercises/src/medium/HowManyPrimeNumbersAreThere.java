package medium;

public class HowManyPrimeNumbersAreThere {

	public static void main(String[] args) {
		System.out.println(primeFinder(30));
	}

	public static int primeFinder(int number) {
		int primeCounter = 0;

		for (int i = 2; i < number; i++) {
			boolean check = false;

			for (int j = 2; j < number; j++) {
				if (i % j == 0 && i != j) {
					check = false;
					break;
				} else {
					check = true;
				}
			}

			if (check == true) {
				primeCounter++;
			}
		}

		return primeCounter;
	}
}