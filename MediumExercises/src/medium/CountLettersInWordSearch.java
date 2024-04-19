package medium;

public class CountLettersInWordSearch {

	public static void main(String[] args) {

		String[][] array = { { "D", "E", "Y", "H", "A", "D" }, { "C", "B", "Z", "Y", "J", "K" },
				{ "D", "B", "C", "A", "M", "N" }, { "F", "G", "G", "R", "S", "R" }, { "V", "X", "H", "A", "S", "S" } };
		System.out.println(letterCounter(array, "H"));
	}

	public static int letterCounter(String[][] inputArray, String letter) {

		if (inputArray == null) {

			return -1;
		}

		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {

			for (int j = 0; j < inputArray[i].length; j++) {

				if (inputArray[i][j] == "H") {
					counter++;
				}
			}
		}

		return counter;
	}
}
