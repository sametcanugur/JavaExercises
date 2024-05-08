package medium;

public class OddishvsEvenish {

	public static void main(String[] args) {

		System.out.println(oddishOrEvenish(4433));
	}

	public static String oddishOrEvenish(int number) {

		int sum = 0;
		String converted = String.valueOf(number);
		String[] array = converted.split("");

		for (int i = 0; i < array.length; i++) {

			sum = sum + Integer.valueOf(array[i]);
		}

		if (sum % 2 == 0) {

			return "Evenish";
		}

		return "Oddish";
	}
}