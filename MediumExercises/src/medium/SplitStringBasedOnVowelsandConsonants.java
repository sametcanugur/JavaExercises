package medium;

public class SplitStringBasedOnVowelsandConsonants {

	public static void main(String[] args) {

		System.out.println(vowelFinder("What's the time?"));
	}

	public static String vowelFinder(String text) {

		if (text == null) {

			return "Undefined";
		}

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String vowelResult = "";
		String noVowelResult = "";

		for (int i = 0; i < text.length(); i++) {

			for (int j = 0; j < vowels.length; j++) {

				if (text.charAt(i) == vowels[j]) {

					vowelResult = vowelResult + vowels[j];
					break;
				}

				if (j == vowels.length - 1) {

					noVowelResult = noVowelResult + text.charAt(i);
				}
			}
		}

		return vowelResult + noVowelResult;
	}
}
