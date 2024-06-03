package medium;

public class SmallestNDigitNumber {

	public static void main(String[] args) {
		System.out.println(smallestNumberFinder(2, 3));
	}

	public static double smallestNumberFinder(int digit, int multiple) {
		for (double i = Math.pow(10, digit - 1);; i++) {
			if (i % multiple == 0) {
				return i;
			}
		}
	}
}