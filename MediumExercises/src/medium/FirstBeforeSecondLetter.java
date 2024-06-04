package medium;

public class FirstBeforeSecondLetter {

	public static void main(String[] args) {
		System.out.println(checkingLetterSort("precarious kangaroos", "k", "a"));
	}

	public static boolean checkingLetterSort(String text, String firstLetter, String secondLetter) {
		if (text == null || firstLetter == null || secondLetter == null) {
			return false;
		}

		String[] textArray = text.split("");
		int firstLetterValue = 0;
		int secondLetterValue = 0;

		for (int i = 0; i < textArray.length; i++) {

			if (textArray[i].equals(firstLetter)) {
				firstLetterValue = i + 1;
			}

			if (textArray[i].equals(secondLetter)) {
				secondLetterValue = i + 1;
			}

			if (firstLetterValue > secondLetterValue && (firstLetterValue != 0 && secondLetterValue != 0)) {
				return false;
			}

			if ((i == text.length() - 1) && (firstLetterValue < secondLetterValue)
					&& (firstLetterValue != 0 || secondLetterValue != 0)) {
				return true;
			}
		}

		return true;
	}
}