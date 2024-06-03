package medium;

public class ExtendtheVowels {

	public static void main(String[] args) {
		System.out.println(vowelRepeater("Loves", 4));
	}

	public static String vowelRepeater(String name, int number) {
		if (name == null || number <= 0) {
			return "Invalid";
		}

		String result = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {

				for (int j = 0; j < number; j++) {
					result = result + name.charAt(i);
				}
			}

			else {
				result = result + name.charAt(i);
			}
		}

		return result;
	}
}