package medium;

public class Switcharoo {

	public static void main(String[] args) {

		System.out.println(sentenceArranger("Cat, dog, and mouse."));
	}

	public static String sentenceArranger(String text) {

		if (text == null) {
			return "Undefined";

		}
		if (text.length() < 2) {

			return "Incompatible.";
		}

		if (text.charAt(0) == text.charAt(text.length() - 1)) {

			return "Two's a pair.";
		}

		String result = String.valueOf(text.charAt(text.length() - 1));
		for (int i = 1; i < text.length()-1; i++) {

			result = result + text.charAt(i);
		}

		return result + text.charAt(0);
	}
}
