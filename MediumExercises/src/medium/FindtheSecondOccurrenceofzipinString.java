package medium;

public class FindtheSecondOccurrenceofzipinString {

	public static void main(String[] args) {

		System.out.println(zipChecker("all zip files are zipped"));
	}

	public static int zipChecker(String sentence) {

		if (sentence == null) {

			return -1;
		}

		int valueCheck = 0;
		for (int i = 0; i < sentence.length() - 2; i++) {

			if (sentence.charAt(i) == 'z' && sentence.charAt(i + 1) == 'i' && sentence.charAt(i + 2) == 'p') {

				valueCheck++;
			}

			if (valueCheck == 2) {

				return i;
			}
		}

		return -1;
	}
}
