package medium;

public class CompoundingLetters {

	public static void main(String[] args) {
		System.out.println(letterCompounder("RqaEzty"));
	}

	public static String letterCompounder(String text) {
		if (text == null) {
			return "Undefined";
		}

		String[] splitArray = text.split("");
		String result = "";

		for (int i = 0; i < splitArray.length; i++) {

			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					result = result + splitArray[i].toUpperCase();
				}

				else {
					result = result + splitArray[i].toLowerCase();
				}
			}

			if (i != splitArray.length - 1) {
				result = result + "-";
			}
		}

		return result;
	}
}