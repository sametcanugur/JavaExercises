package medium;

public class BasicArithmeticOperations {

	public static void main(String[] args) {

		System.out.println(calculator("343", "2a", "divide"));
	}

	public static int calculator(String number1, String number2, String operator) {

		if (number1 == null || number2 == null || operator == null || number1.isEmpty() || number2.isEmpty()
				|| operator.isEmpty()) {

			return -1;
		}

		for (int i = 0; i < number1.length(); i++) {

			int numberHolder1 = number1.charAt(i);
			if (numberHolder1 < 48 || numberHolder1 > 57) {

				return -1;
			}
		}

		for (int j = 0; j < number2.length(); j++) {

			int numberHolder2 = number2.charAt(j);
			if (numberHolder2 < 48 || numberHolder2 > 57) {
				
				return -1;
			}
		}

		int convertedNumber1 = Integer.valueOf(number1);
		int convertedNumber2 = Integer.valueOf(number2);
		if ((number2.equals("0") && operator.equals("divide")) || (!operator.equals("divide") && !operator.equals("add")
				&& !operator.equals("subtract") && !operator.equals("multiply"))) {

			if (convertedNumber1 < convertedNumber2) {

				return convertedNumber1;
			}

			else {

				return convertedNumber2;
			}
		}

		if (operator.equals("divide")) {

			return convertedNumber1 / convertedNumber2;
		}

		if (operator.equals("add")) {

			return convertedNumber1 + convertedNumber2;
		}

		if (operator.equals("subtract")) {

			return convertedNumber1 - convertedNumber2;
		}

		if (operator.equals("multiply")) {

			return convertedNumber1 * convertedNumber2;
		}

		return -1;
	}
}
