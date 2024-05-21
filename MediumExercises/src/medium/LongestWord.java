package medium;

public class LongestWord {

	public static void main(String[] args) {

		System.out.println(longestWordFinder("Forgetfulness is by all means powerless!"));
	}

	public static String longestWordFinder(String sentence) {
		if (sentence == null) {
			return "Undefined";
		}

		String[] array = sentence.split(" ");
		String result = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			if (result.length() < array[i + 1].length()) {
				result = array[i + 1];
			}
		}

		return result;
	}
}
