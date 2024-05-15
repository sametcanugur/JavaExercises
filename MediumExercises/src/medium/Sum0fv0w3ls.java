package medium;

public class Sum0fv0w3ls {

	public static void main(String[] args) {
		System.out.println(vowelsNumberCounter("I love edabit!"));
	}

	public static int vowelsNumberCounter(String text) {
		if (text == null) {
			return -1;
		}
		
		String newText = text.toUpperCase();
		int vowelSum = 0;
		
		for (int i = 0; i < newText.length(); i++) {
			if (newText.charAt(i) == 'A') {
				vowelSum = vowelSum + 4;
			}

			if (newText.charAt(i) == 'E') {
				vowelSum = vowelSum + 3;
			}

			if (newText.charAt(i) == 'İ') {
				vowelSum = vowelSum + 1;
			}

			if (newText.charAt(i) == 'I') {
				vowelSum = vowelSum + 1;
			}
		}

		return vowelSum;
	}
}