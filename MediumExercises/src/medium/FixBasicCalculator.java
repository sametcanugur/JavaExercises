package medium;

public class FixBasicCalculator {

	public static void main(String[] args) {

		System.out.println(basicCalculator(12, '/', 3));
	}

	public static Object basicCalculator(int number1, char operator, int number2) {

		if ((operator != '+' && operator != '-' && operator != '*' && operator != '/')
				|| (operator == '/' && number2 == 0)) {

			return null;
		}

		if (operator == '+') {

			return number1 + number2;
		}

		if (operator == '-') {

			return number1 - number2;
		}

		if (operator == '*') {

			return number1 * number2;
		}

		if (operator == '/') {

			return number1 / number2;
		}

		return 0;
	}
}
