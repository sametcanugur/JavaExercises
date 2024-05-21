package medium;

public class AutomorphicNumbers {

	public static void main(String[] args) {
		System.out.println(automorphicNbumberCheck(76));
	}

	public static boolean automorphicNbumberCheck(int number) {
		if (number < 0) {
			return false;
		}

		String convertedNumber = String.valueOf(number);
		int multiplied = number * number;

		String convertedMultiplied = String.valueOf(multiplied);
		String result = "";

		for (int i = convertedMultiplied.length() - convertedNumber.length(); i < convertedMultiplied.length(); i++) {
			result = result + convertedMultiplied.charAt(i);
		}

		if (result.equals(convertedNumber)) {
			return true;
		}

		return false;
	}
}