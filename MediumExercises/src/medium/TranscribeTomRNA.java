package medium;

public class TranscribeTomRNA {

	public static void main(String[] args) {

		System.out.println(stringConverter("ATTAGCGCGATATACGCGTAC"));
	}

	public static String stringConverter(String text) {

		if (text == null) {

			return "Undefined";
		}

		String result = "";
		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == 'A') {

				result = result + 'U';
			} else if (text.charAt(i) == 'T') {

				result = result + 'A';
			} else if (text.charAt(i) == 'G') {

				result = result + 'C';
			} else if (text.charAt(i) == 'C') {

				result = result + 'G';
			} else {

				result = result + text.charAt(i);
			}
		}

		return result;
	}
}
