package medium;

public class CupSwapping {

	public static void main(String[] args) {
		String[] array = { "BA", "AC", "CA", "BC" };
		System.out.println(ballFindGame(array));
	}

	public static String ballFindGame(String[] array) {
		if (array[0].charAt(0) != 'B') {
			if (array[0].charAt(1) != 'B') {
				return "B";
			}
		}

		String result = "";
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].charAt(0) == array[i + 1].charAt(1)) {
				result = String.valueOf(array[i + 1].charAt(0));
			}
		}

		if (result.equals("")) {
			return "B";
		}

		return result;
	}
}