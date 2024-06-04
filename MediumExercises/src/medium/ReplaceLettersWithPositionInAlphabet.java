package medium;

public class ReplaceLettersWithPositionInAlphabet {

	public static void main(String[] args) {
		System.out.println(replacingLettersToNumber("Wow, does that work?"));
	}

	public static String replacingLettersToNumber(String sentence) {
		if (sentence == null) {
			return "Invalid";
		}

		String result = "";
		String lowerCase = sentence.toLowerCase();
		char[] lowerCaseArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < lowerCase.length(); i++) {

			for (int j = 0; j < lowerCaseArray.length; j++) {
				if (lowerCase.charAt(i) == lowerCaseArray[j]) {
					result = result + (j + 1) + " ";
				}
			}
		}

		return result;
	}
}