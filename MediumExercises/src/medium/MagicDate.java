package medium;

public class MagicDate {

	public static void main(String[] args) {

		System.out.println(magicDateChecker("9 2 2018"));
	}

	public static boolean magicDateChecker(String date) {

		if (date == null || date.isEmpty()) {

			return false;
		}

		String[] array = date.split(" ");
		int intMultiplied = Integer.valueOf(array[0]) * Integer.valueOf(array[1]);
		String StrMultiplied = String.valueOf(intMultiplied);

		int k = 0;
		for (int i = array[2].length() - StrMultiplied.length(); i < array[2].length(); i++) {

			boolean check = false;
			if (array[2].charAt(i) == StrMultiplied.charAt(k)) {

				check = true;
			}

			k++;
			if (check == false) {

				return false;
			}
		}

		return true;
	}
}
