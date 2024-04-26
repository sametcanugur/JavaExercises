package medium;

public class GCDandLCM {

	public static void main(String[] args) {

		System.out.println(gcdFinder(18, 54));
	}

	public static int gcdFinder(int number1, int number2) {

		if (number1 <= 0 || number2 <= 0) {

			return -1;
		}

		int[] array = { number1, number2 };
		int numberHolder = 0;
		int greatesDivisor1 = 0;
		int greatesDivisor2 = 0;
		int result = 0;

		for (int i = 0; i < 1; i++) {

			if (array[i] > array[i + 1]) {

				numberHolder = array[i];
				array[i] = array[i + 1];
				array[i + 1] = numberHolder;
			}
		}

		for (int j = 1; j <= array[0]; j++) {

			boolean check1 = false;
			boolean check2 = false;

			if (array[0] % j == 0) {

				greatesDivisor1 = j;
				check1 = true;
			}

			if (array[1] % j == 0) {

				greatesDivisor2 = j;
				check2 = true;
			}

			if (greatesDivisor1 == greatesDivisor2 && check1 == true && check2 == true) {

				result = j;
			}
		}

		return result;
	}
}
