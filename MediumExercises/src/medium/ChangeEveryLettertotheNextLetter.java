package medium;

public class ChangeEveryLettertotheNextLetter {

	public static void main(String[] args) {

		System.out.println(letterChanger("welcome"));
	}

	public static String letterChanger(String text) {

		if (text == null) {

			return "Undefined";
		}

		String result = "";
		for (int i = 0; i < text.length(); i++) {

			int numberHolder = 0;
			if (text.charAt(i) != 'z') {

				numberHolder = text.charAt(i);
				char charHolder = (char) (numberHolder + 1);
				result = result + charHolder;
			}
		}

		return result;
	}
}
