package medium;

import java.util.Arrays;

public class ArrayOfMultiples {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(arrayOfMultiplesCreator(12, 10)));
	}

	public static int[] arrayOfMultiplesCreator(int number, int length) {

		String elementsOfArray = "";
		for (int i = 1;; i++) {

			elementsOfArray = elementsOfArray + (number * i) + ",";
			if (number * i == number * length) {

				break;
			}
		}

		String[] stringArray = elementsOfArray.split(",");
		int[] resultArray = new int[stringArray.length];
		for (int j = 0; j < stringArray.length; j++) {

			resultArray[j] = Integer.valueOf(stringArray[j]);
		}

		return resultArray;
	}
}
