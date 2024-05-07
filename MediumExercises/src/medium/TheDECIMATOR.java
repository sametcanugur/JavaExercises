package medium;

public class TheDECIMATOR {

	public static void main(String[] args) {

		System.out.println(characterRemover("1234567890"));
	}

	public static String characterRemover(String text) {

		if (text.length() < 2) {

			return "Undefined";
		}

		double calculated = text.length() / 10;
		String result = "";
		String[] stringArray = String.valueOf(calculated).split("\\.");

		if (text.length() % 10 != 0) {

			stringArray[0] = String.valueOf((Integer.valueOf(stringArray[0]) + 1));
		}

		for (int i = 0; i < text.length() - Integer.valueOf(stringArray[0]); i++) {

			result = result + text.charAt(i);
		}

		return result;
	}
}