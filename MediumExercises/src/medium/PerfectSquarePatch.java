package medium;

import java.util.Arrays;

public class PerfectSquarePatch {

	public static void main(String[] args) {

		System.out.println(Arrays.deepToString(squareCreator(3)));
	}

	public static int[][] squareCreator(int number) {

		int[][] resultArray = new int[number][number];
		for (int i = 0; i < number; i++) {

			for (int j = 0; j < number; j++) {

				resultArray[i][j] = number;
			}
		}

		return resultArray;
	}
}
