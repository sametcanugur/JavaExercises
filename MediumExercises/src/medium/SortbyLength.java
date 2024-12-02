package medium;

public class SortbyLength {

	public static void main(String[] args) {
		System.out.println(textEditerBylength("Hello my friend"));
	}

	public static String textEditerBylength(String sentence) {
		if (sentence == null) {
			return "Invalid";
		}

		String[] splitArray = sentence.split(" ");
		String wordHolder = "";

		for (int i = 0; i < splitArray.length; i++) {
			for (int j = 0; j < splitArray.length - 1; j++) {
				if (splitArray[j].length() > splitArray[j + 1].length()) {
					wordHolder = splitArray[j];
					splitArray[j] = splitArray[j + 1];
					splitArray[j + 1] = wordHolder;
				}
			}
		}

		String result = "";
		for (int k = 0; k < splitArray.length; k++) {
			result = result + splitArray[k] + " ";
		}

		return result;
	}
}