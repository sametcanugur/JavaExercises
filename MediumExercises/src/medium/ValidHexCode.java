package medium;

public class ValidHexCode {

	public static void main(String[] args) {

		System.out.println(hexCodeChecker("#CD5C&C"));
	}

	public static boolean hexCodeChecker(String text) {

		if (text == null || text.charAt(0) != '#' || text.length() != 7 || text.isEmpty()) {

			return false;
		}

		for (int i = 1; i < text.length(); i++) {

			int numberHolder = text.charAt(i);
			if (numberHolder < 48 || (numberHolder > 57 && numberHolder < 65)
					|| (numberHolder > 70 && numberHolder < 97) || numberHolder > 102) {

				return false;
			}
		}

		return true;
	}
}
