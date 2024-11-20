package medium;

public class NoYelling {

	public static void main(String[] args) {
		System.out.println(endingPunctuationChanger("I just!!! can!!! not!!! believe!!! it!!!"));
	}

	public static String endingPunctuationChanger(String text) {
		if (text == null) {
			return "Invalid";
		}

		String result = "";
		int i = 0;
		if ((text.length() > 1) && (text.charAt(text.length() - 1) == '?' && text.charAt(text.length() - 2) == '?')
				|| (text.charAt(text.length() - 1) == '!' && text.charAt(text.length() - 2) == '!')) {

			char holder = text.charAt(text.length() - 1);
			for (i = text.length() - 1; i > 0; i--) {
				if (text.charAt(i) == holder && text.charAt(i - 1) != holder) {
					break;
				}
			}

			for (int j = 0; j < i + 1; j++) {
				result = result + text.charAt(j);
			}
		} else {
			return text;
		}
		
		return result;
	}
}