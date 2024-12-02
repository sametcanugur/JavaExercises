package medium;

public class BackspaceAttack {

	public static void main(String[] args) {
		System.out.println(stringDeleter("he##l#hel#llo"));
	}

	public static String stringDeleter(String text) {
		String newText = "";
		int a = 0;

		for (int i = text.length() - 1; i >= 0; i--) {
			if (text.charAt(i) != '#') {
				newText = newText + text.charAt(i);
			}

			if (text.charAt(i) == '#') {
				a++;
			}

			if (i != 0 && text.charAt(i - 1) != '#') {
				i = i - a;
				a = 0;

				if (i == 0) {
					break;
				}
			}
		}

		String result = "";
		for (int j = newText.length() - 1; j >= 0; j--) {
			result = result + newText.charAt(j);
		}

		return result;
	}
}