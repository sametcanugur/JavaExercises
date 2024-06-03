package medium;

public class OppositeHouse {

	public static void main(String[] args) {
		System.out.println(houseNumberFinder(5, 46));
	}

	public static int houseNumberFinder(int houseNumber, int lengthOfStreet) {
		int[] oddArray = new int[lengthOfStreet];
		int[] evenArray = new int[lengthOfStreet];

		int j = 0;
		int k = lengthOfStreet - 1;

		for (int i = 1; i <= lengthOfStreet * 2; i++) {
			if (i % 2 != 0) {
				oddArray[j] = i;
				j++;
			}

			else {
				evenArray[k] = i;
				k--;
			}
		}

		for (int m = 0; m < oddArray.length; m++) {
			if (oddArray[m] == houseNumber) {
				return evenArray[m];
			}

			if (evenArray[m] == houseNumber) {
				return oddArray[m];
			}
		}

		return -1;
	}
}