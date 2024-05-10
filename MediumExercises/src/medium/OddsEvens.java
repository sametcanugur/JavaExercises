package medium;

public class OddsEvens {

	public static void main(String[] args) {

		System.out.println(oddEvenChecker(54870));
	}

	public static String oddEvenChecker(int number) {

		String converted = String.valueOf(number);
		String[] splitArray = converted.split("");
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < splitArray.length; i++) {

			if (Integer.valueOf(splitArray[i]) % 2 == 0) {

				evenSum = evenSum + Integer.valueOf(splitArray[i]);
			} else {

				oddSum = oddSum + Integer.valueOf(splitArray[i]);
			}
		}

		if (oddSum > evenSum) {

			return "odd";
		}

		if (evenSum > oddSum) {

			return "even";
		}

		return "equal";
	}
}