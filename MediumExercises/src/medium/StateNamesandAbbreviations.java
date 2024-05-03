package medium;

import java.util.Arrays;

public class StateNamesandAbbreviations {

	public static void main(String[] args) {

		String[] array = { "Arizona", "CA", "NY", "Nevada" };
		System.out.println(Arrays.toString(stateNameFilterer(array, "full")));
	}

	public static String[] stateNameFilterer(String[] array, String stater) {

		String[] emptyArray = {};
		if (array == null) {

			return emptyArray;
		}

		String result = "";
		for (int i = 0; i < array.length; i++) {

			if (stater.equals("abb") && array[i].length() == 2) {

				result = result + array[i] + " ";
			}

			if (stater.equals("full") && array[i].length() > 2) {

				result = result + array[i] + " ";
			}
		}

		String[] resultArray = result.split(" ");
		return resultArray;
	}
}
