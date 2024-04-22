package medium;

public class PentagonalNumber {

	public static void main(String[] args) {

		System.out.println(dotCounter(4));
	}

	public static int dotCounter(int input) {

		int result = 1;
		for (int i = 1; i < input; i++) {

			result = result + (5 * i);
		}

		return result;
	}
}
