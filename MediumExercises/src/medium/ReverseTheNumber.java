package medium;

public class ReverseTheNumber {

	public static void main(String[] args) {

		System.out.println(numberReverser(-122157));
	}

	public static String numberReverser(int inputNumber) {

		if (inputNumber < 0) {

			inputNumber = inputNumber * -1;
		}

		String convertedToString = String.valueOf(inputNumber);
		String result = "";
		for (int i = convertedToString.length() - 1; i >= 0; i--) {

			result = result + convertedToString.charAt(i);
		}

		return result;
	}
}
