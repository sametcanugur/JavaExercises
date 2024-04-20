package medium;

public class PerfectNumber {

	public static void main(String[] args) {

		System.out.println(perfectNumberChecker(496));
	}

	public static boolean perfectNumberChecker(int number) {

		boolean check = true;
		for (int i = 2; i < number; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j != 0) {

					check = true;
				} else {

					check = false;
					break;
				}
			}

			if (check == true) {

				if ((Math.pow(2, i) - 1) * (Math.pow(2, i - 1)) == number) {

					return true;
				}
			}
		}

		return false;
	}
}
