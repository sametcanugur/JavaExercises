package medium;

public class HistogramFunction {

	public static void main(String[] args) {
		int[] array = { 1, 3, 4 };
		System.out.println(histogramFunctionCreator(array, "#"));
	}

	public static String histogramFunctionCreator(int[] array, String character) {
		if (array == null || character == null || character.equals("") || array.length == 0) {
			return "Invalid";
		}

		String result = "";
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i]; j++) {
				result = result + character;
			}

			if (i != array.length - 1) {
				result = result + "\n";
			}
		}

		return result;
	}
}