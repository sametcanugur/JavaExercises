package medium;

public class Functioninator8000 {

	public static void main(String[] args) {

		System.out.println(vowelChecker("EvilClone"));
	}

	public static String vowelChecker(String text) {

		if (text == null || text.isEmpty()) {

			return "Undefined";
		}

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < vowels.length; i++) {

			if (text.charAt(text.length() - 1) == vowels[i]) {

				return text + "-inator" + " " + text.length() + "000";
			}
		}

		return text + "inator" + " " + text.length() + "000";
	}
}
