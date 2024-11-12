package medium;

public class UnmixMyStrings {

	public static void main(String[] args) {
		System.out.println(unmixerString("abcdefghijk"));
	}

	public static String unmixerString(String text) {
		if (text.equals(null)) {
			return "Invalid";
		}

		if (text.length() <= 1) {
			return text;
		}

		String finalText = "";
		for (int i = 0; i < text.length(); i++) {
			finalText = finalText + text.charAt(i + 1) + text.charAt(i);
			i++;

			if (i == text.length() - 2) {
				finalText = finalText + text.charAt(text.length() - 1);
				break;
			}
		}

		return finalText;
	}
}