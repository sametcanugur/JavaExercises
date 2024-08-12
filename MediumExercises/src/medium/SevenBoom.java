package medium;

public class SevenBoom {

	public static void main(String[] args) {
		int[] array = { 2, 55, 60, 97, 86 };
		System.out.println(numberChecker(array));
	}

	public static String numberChecker(int[] array) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < String.valueOf(array[i]).length(); j++) {
				if (String.valueOf(array[i]).charAt(j) == '7') {
					return "Boom!";
				}
			}
		}

		return "there is no 7 in the array";
	}
}