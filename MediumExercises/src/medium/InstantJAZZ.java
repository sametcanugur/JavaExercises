package medium;

import java.util.Arrays;

public class InstantJAZZ {

	public static void main(String[] args) {

		String[] array = { "Dm", "G", "E", "A" };
		System.out.println(Arrays.toString(numberAdder(array)));
	}

	public static String[] numberAdder(String[] array) {

		String[] emptyArray = {};
		if (array == null) {

			return emptyArray;
		}

		String resultText = "";
		for (int i = 0; i < array.length; i++) {

			if (array[i].charAt(array[i].length() - 1) != '7') {

				resultText = resultText + array[i] + "7" + " ";
			} else {

				resultText = resultText + array[i] + " ";
			}
		}

		return resultText.split(" ");
	}
}
