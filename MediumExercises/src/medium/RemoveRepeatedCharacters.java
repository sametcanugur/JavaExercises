package medium;

public class RemoveRepeatedCharacters {

	public static void main(String[] args) {
		System.out.println(characterRemover("call 911"));
	}

	public static String characterRemover(String word) {
		if (word.isEmpty()) {
			return "";
		}

		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			boolean check = false;

			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j) && i != j && i > j) {
					check = true;
					break;
				}
			}

			if (check == false) {
				newWord = newWord + word.charAt(i);
			}
		}

		return newWord;
	}
}