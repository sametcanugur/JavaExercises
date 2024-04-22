package medium;

import java.lang.reflect.Array;

public class TotalVolumeofAllBoxes {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 1 }, { 2, 3, 2 }, { 6, 6, 7 } };
		System.out.println(volumeCalculatorOfBoxes(array));
	}

	public static int volumeCalculatorOfBoxes(int[][] inputArray) {

		int sum = 0;
		for (int i = 0; i < Array.getLength(inputArray); i++) {

			int volume = 1;
			for (int j = 0; j < inputArray[i].length; j++) {

				volume = volume * inputArray[i][j];
			}

			sum = sum + volume;
		}

		return sum;
	}
}
