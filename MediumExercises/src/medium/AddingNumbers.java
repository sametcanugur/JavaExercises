package medium;

public class AddingNumbers {

	public static void main(String[] args) {

		System.out.print(numberAdder("111", "111"));
	}

	public static String numberAdder(String number1, String number2) {

		if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {

			return "Invalid Operation";
		}

		return String.valueOf(Integer.valueOf(number1) + Integer.valueOf(number2));
	}
}
