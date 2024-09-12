package medium;

public class IstheInputFactorialofInteger {

	public static void main(String[] args) {
		System.out.println(factorialCheck(120));
	}

	public static boolean factorialCheck(int number) {
		int product = 1;
		for (int i = 1; i <= number; i++) {
			product = product * i;

			if (product == number) {
				return true;
			}
		}

		return false;
	}
}