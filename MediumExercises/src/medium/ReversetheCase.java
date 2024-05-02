package medium;

public class ReversetheCase {

	public static void main(String[] args) {

		System.out.println(caseReverser("sPoNtAnEoUs"));
	}

	public static String caseReverser(String text) {

		if (text == null) {

			return "Undefined";
		}

		String[] array = text.split("");
		String result = "";

		for (int i = 0; i < array.length; i++) {

			if (array[i].equals(array[i].toUpperCase())) {

				result = result + array[i].toLowerCase();
			} else {

				result = result + array[i].toUpperCase();
			}
		}

		return result;
	}
}
