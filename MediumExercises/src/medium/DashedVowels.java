package medium;

public class DashedVowels {

	public static void main(String[] args) {
		System.out.println(dashAdder("Fight for your right to party!"));
	}

	public static String dashAdder(String text) {
		if (text == null) {
			return "Invalid";
		}

		String result = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
					|| text.charAt(i) == 'u' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I'
					|| text.charAt(i) == 'İ' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
				result = result + "-" + text.charAt(i) + "-";
			}

			else {
				result = result + text.charAt(i);
			}
		}

		return result;
	}
}