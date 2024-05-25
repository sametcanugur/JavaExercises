package medium;

public class CapitalizeLastLetter {

	public static void main(String[] args) {
		System.out.println(capitalMakerToLastLetter("My Name Is Edabit"));
	}

	public static String capitalMakerToLastLetter(String text) {
		if (text == null) {
			return "Undefined";
		}
		
		String[] array = text.split(" ");
		String result = "";

		for (int i = 0; i < array.length; i++) {

			String[] splitArray = array[i].split("");

			for (int j = 0; j < array[i].length(); j++) {
				if (j == array[i].length() - 1) {
					result = result + splitArray[j].toUpperCase();
				}

				else {
					result = result + splitArray[j];
				}
			}

			result = result + " ";
		}

		return result;
	}
}