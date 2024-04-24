package medium;

public class LCMofTwoNumbers {

	public static void main(String[] args) {

		System.out.println(leastCommonMultipleFinder(132, 256));
	}

	public static int leastCommonMultipleFinder(int number1, int number2) {

		int lcm = 1;
		for (int i = 2;; i++) {

			boolean check1 = false;
			boolean check2 = false;

			if (number1 % i == 0) {

				number1 = number1 / i;
				check1 = true;
			}

			if (number2 % i == 0) {

				number2 = number2 / i;
				check2 = true;
			}

			if (check1 == true || check2 == true) {

				lcm = lcm * i;
				i = i - 1;
			}

			if (number1 == 1 && number2 == 1) {

				break;
			}
		}

		return lcm;
	}
}
