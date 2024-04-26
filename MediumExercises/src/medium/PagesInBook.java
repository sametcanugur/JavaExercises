package medium;

public class PagesInBook {

	public static void main(String[] args) {

		System.out.println(checkingPagesValidity(9453));
	}

	public static boolean checkingPagesValidity(int number) {

		int sum = 0;
		for (int i = 0;; i++) {

			sum = sum + i;
			if (sum == number) {

				return true;
			}

			if (sum > number) {

				return false;
			}
		}
	}
}
