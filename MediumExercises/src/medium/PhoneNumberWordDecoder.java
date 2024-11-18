package medium;

public class PhoneNumberWordDecoder {

	public static void main(String[] args) {
		System.out.println(letterConverter("(325)444-TEST"));
	}

	public static String letterConverter(String text) {
		if (text == null) {
			return "Invalid Format";
		}

		// check whether text length is 12 or 13
		if (text.length() != 12) {
			if (text.length() != 13) {
				return "Invalid Format";
			}
		}

		// check whether text starts number or "("
		int numberHolder1 = text.charAt(0);
		if (numberHolder1 < 65 && numberHolder1 > 90) {

			if (numberHolder1 != 40) {
				return "Invalid Format";
			}
		}

		// check if text starts number, whether obey rules
		int numberHolder2 = text.charAt(0);
		if ((numberHolder2 > 64 && numberHolder2 < 91) || (numberHolder2 > 47 && numberHolder2 < 58)) {

			for (int i = 0; i < text.length(); i++) {
				numberHolder2 = text.charAt(i);

				if (i == 3 || i == 7) {

					if (numberHolder2 != 45) {
						return "Invalid Format";
					}
				} else {

					if ((numberHolder2 > 64 && numberHolder2 < 91) || (numberHolder2 > 47 && numberHolder2 < 58)) {

					} else {
						return "Invalid Format";
					}
				}
			}
		}

		// check if text starts "(" whether obey rules
		else {

			for (int j = 1; j < text.length(); j++) {
				numberHolder2 = text.charAt(j);

				if (j == 4 && numberHolder2 != 41) {
					return "Invalid Format";
				}

				if (j == 8 && numberHolder2 != 45) {
					return "Invalid Format";
				}

				if (j != 4 && j != 8) {

					if ((numberHolder2 > 64 && numberHolder2 < 91) || (numberHolder2 > 47 && numberHolder2 < 58)) {
					} else {
						return "Invalid Format";
					}
				}
			}
		}

		String result = "";
		for (int k = 0; k < text.length(); k++) {

			if (text.charAt(k) == 'A' || text.charAt(k) == 'B' || text.charAt(k) == 'C') {
				result = result + '2';
			}

			else if (text.charAt(k) == 'D' || text.charAt(k) == 'E' || text.charAt(k) == 'F') {
				result = result + '3';
			}

			else if (text.charAt(k) == 'G' || text.charAt(k) == 'H' || text.charAt(k) == 'I') {
				result = result + '4';
			}

			else if (text.charAt(k) == 'J' || text.charAt(k) == 'K' || text.charAt(k) == 'L') {
				result = result + '5';
			}

			else if (text.charAt(k) == 'M' || text.charAt(k) == 'N' || text.charAt(k) == 'O') {
				result = result + '6';
			}

			else if (text.charAt(k) == 'P' || text.charAt(k) == 'Q' || text.charAt(k) == 'R' || text.charAt(k) == 'S') {
				result = result + '7';
			}

			else if (text.charAt(k) == 'T' || text.charAt(k) == 'U' || text.charAt(k) == 'V') {
				result = result + '8';
			}

			else if (text.charAt(k) == 'W' || text.charAt(k) == 'X' || text.charAt(k) == 'Y' || text.charAt(k) == 'Z') {
				result = result + '9';
			} else {
				result = result + text.charAt(k);
			}
		}

		return result;
	}
}