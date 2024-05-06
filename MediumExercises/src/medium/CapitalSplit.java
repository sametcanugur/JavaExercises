package medium;

public class CapitalSplit {

	public static void main(String[] args) {

		System.out.println(capitalLetterChecker("stayIndoors"));
	}

	public static String capitalLetterChecker(String text) {

		if (text == null) {

			return "Undefined";
		}

		String[] textArray = text.split("");
		String result = "";

		for (int i = 0; i < textArray.length; i++) {

			if (textArray[i].equals(textArray[i].toUpperCase())) {

				if (textArray[i].equals("I")) {

					textArray[i] = "İ";
				}

				result = result + " " + textArray[i].toLowerCase();
			}

			else {

				result = result + textArray[i];
			}
		}

		return result;
	}
}
