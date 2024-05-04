package medium;

public class SameNumberofUniqueElements {

	public static void main(String[] args) {

		int[] array1 = { 1, 3, 4, 4, 4 };
		int[] array2 = { 2, 5, 7 };
		System.out.println(uniqueElementChecker(array1, array2));
	}

	public static boolean uniqueElementChecker(int[] array1, int[] array2) {

		int[] emptyArray = {};
		if (array1 == null || array2 == null || array1 == emptyArray || array2 == emptyArray) {

			return false;
		}

		boolean check1 = true;
		int count1 = 1;

		for (int i = 1; i < array1.length; i++) {

			for (int j = 0; j < i; j++) {

				if (array1[i] == array1[j]) {

					check1 = false;
					break;
				}

				else {

					check1 = true;
				}
			}

			if (check1 == true) {

				count1++;
			}
		}

		boolean check2 = true;
		int count2 = 1;

		for (int k = 1; k < array2.length; k++) {

			for (int m = 0; m < k; m++) {

				if (array2[k] == array2[m]) {

					check2 = false;
					break;
				}

				else {

					check2 = true;
				}
			}

			if (check2 == true) {

				count2++;
			}
		}

		if (count1 == count2) {

			return true;
		}

		return false;
	}
}
