package medium;

public class BasicEMailValidation {

	public static void main(String[] args) {

		System.out.println(mailFormatChecker("hello@edabit.com"));
	}

	public static boolean mailFormatChecker(String text) {

		if (text == null || text.length() < 7 || text.charAt(0) == '@' || text.charAt(text.length() - 1) == '@'
				|| text.charAt(text.length() - 1) == '.') {

			return false;
		}

		boolean check1 = false;
		boolean check2 = false;
		for (int i = 0; i < text.length() - 1; i++) {

			if (text.charAt(i) == '@') {

				check1 = true;
			}

			if (text.charAt(i) == '.') {

				check2 = true;
			}

			if (text.charAt(i) == '@' && text.charAt(i + 1) == '.') {

				return false;
			}

			if (i == text.length() - 2 && (check1 == false || check2 == false)) {

				return false;
			}
		}

		boolean resultCheck = false;
		for (int j = 0; j < text.length() - 3; j++) {

			if (text.charAt(j) == '.' && text.charAt(j + 1) == 'c' && text.charAt(j + 2) == 'o'
					&& text.charAt(j + 3) == 'm' && text.charAt(j + 3) == text.charAt(text.length() - 1)) {

				resultCheck = true;
			}
		}

		return resultCheck;
	}
}