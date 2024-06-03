package medium;

public class ReverseOrderOfWordsWith5LettersOrMore {

	public static void main(String[] args) {
		System.out.println(wordReverser("This is a typical sentence."));
	}

	public static String wordReverser(String text) {
		if (text == null) {
			return "Undefined";
		}

		String[] splitArray = text.split(" ");
		String result = "";

		for (int i = 0; i < splitArray.length; i++) {

			if (splitArray[i].length() >= 5) {
				for (int j = splitArray[i].length() - 1; j >= 0; j--) {
					result = result + splitArray[i].charAt(j);
				}
			}

			else {
				result = result + splitArray[i];
			}

			result = result + " ";
		}

		return result;
	}
}