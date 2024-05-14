package medium;

public class RecursionCountVowels {

	public static void main(String[] args) {

		System.out.println(vowelCounterRecursively("apple"));
	}

	public static int vowelCounterRecursively(String text) {
		if (text.equals("")) {
			return 0;
		}

		if (text.charAt(0) == 'a' || text.charAt(0) == 'e' || text.charAt(0) == 'i' || text.charAt(0) == 'o'
				|| text.charAt(0) == 'u') {
			return 1 + vowelCounterRecursively(text.substring(1));
		}

		return vowelCounterRecursively(text.substring(1));
	}
}
