package medium;

import java.util.Arrays;

public class ZipItIfYouCan {

	public static void main(String[] args) {
		String[][] array = { { "Ana", "Amy", "Lisa" }, { "Bob", "Josh", "Tim" } };
		System.out.println(Arrays.deepToString(zipMaker(array)));
	}

	public static String[][] zipMaker(String[][] array) {
		if (array == null || array[0].length != array[1].length) {
			return null;
		}

		String[][] resultArray = new String[array[0].length][2];
		int k = 0;
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < 2; j++) {
				resultArray[i][j] = array[j][k];
			}

			k++;
		}

		return resultArray;
	}
}
