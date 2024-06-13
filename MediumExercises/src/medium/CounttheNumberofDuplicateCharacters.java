package medium;

public class CounttheNumberofDuplicateCharacters {

	public static void main(String[] args) {
		System.out.println(duplicateCharacterCounter("Hello World friend"));
	}

	public static int duplicateCharacterCounter(String text) {
		if (text == null) {
			return -1;
		}

		int sum = 0;
		for (int i = 0; i < text.length(); i++) {

			for (int j = i; j < text.length(); j++) {

				if (text.charAt(i) == ' ') {
					break;
				}

				if (text.charAt(i) == text.charAt(j) && i != j) {
					sum++;
					break;
				}
			}
		}

		return sum;
	}
}