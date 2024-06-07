package medium;

public class ParityBitValidation {

	public static void main(String[] args) {
		System.out.println(checking1AtString("11000001"));
	}

	public static boolean checking1AtString(String text) {
		if (text == null || text.isEmpty()) {
			return false;
		}

		int counter = 0;
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i) == '1') {
				counter++;
			}
		}

		if (counter % 2 == 0) {

			if (text.charAt(text.length() - 1) == '0') {
				return true;
			}

			else {
				return false;
			}
		}

		if (counter % 2 != 0) {

			if (text.charAt(text.length() - 1) == '1') {
				return true;
			}

			else {
				return false;
			}
		}

		return true;
	}
}