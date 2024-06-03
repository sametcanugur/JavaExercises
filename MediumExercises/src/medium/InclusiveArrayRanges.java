package medium;

import java.util.Arrays;

public class InclusiveArrayRanges {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(printingNumbersInRange(4, 8)));
	}

	public static int[] printingNumbersInRange(int startNumber, int endNumber) {
		if (startNumber > endNumber) {
			int[] initialArray = { startNumber };
			return initialArray;
		}

		int[] secondArray = new int[(endNumber + 1) - startNumber];
		int counter = 0;

		for (int i = startNumber; i <= endNumber; i++) {
			secondArray[counter] = i;
			counter++;
		}

		return secondArray;
	}
}