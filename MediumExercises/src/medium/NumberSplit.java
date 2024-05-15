package medium;

import java.util.Arrays;

public class NumberSplit {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(numberSplitter(25)));
	}

	public static int[] numberSplitter(int number) {
		int[] array = new int[2];
		if (number % 2 != 0) {
			array[0] = (number - 1) / 2;
			array[1] = array[0] + 1;
			return array;
		}
		
		array[0] = number / 2;
		array[1] = number / 2;
		return array;
	}
}
