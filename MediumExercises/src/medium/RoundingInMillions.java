package medium;

import java.util.Arrays;

public class RoundingInMillions {

	public static void main(String[] args) {
		Object[][] array = { { "Nice", 942208 }, { "Abu Dhabi", 99580010 }, { "Naples", 560 },
				{ "Vatican City", 199260010 } };
		System.out.println(Arrays.deepToString(nearMillionMaker(array)));
	}

	public static Object[][] nearMillionMaker(Object[][] array) {
		for (int i = 0; i < array.length; i++) {
			int number = (int) array[i][1];
			String StringNumber = String.valueOf(number);
			String[] StringArray = StringNumber.split("");

			if (number < 500000 && number >= 1000000000) {
				array[i][1] = 0;
			}

			if (number >= 500000 && number <= 1000000) {
				array[i][1] = 1000000;
			}

			if (number > 1000000 && number < 10000000) {
				if (Integer.valueOf(StringArray[1]) >= 5) {
					array[i][1] = (Integer.valueOf(StringArray[0]) + 1) * 1000000;
				}

				else {
					array[i][1] = Integer.valueOf(StringArray[0]) * 1000000;
				}
			}

			if (number > 10000000 && number < 100000000) {
				String split = StringArray[0] + StringArray[1];

				if (Integer.valueOf(StringArray[2]) >= 5) {
					array[i][1] = (Integer.valueOf(split) + 1) * 1000000;
				}

				else {
					array[i][1] = Integer.valueOf(split) * 1000000;
				}
			}

			if (number > 100000000) {
				String split = StringArray[0] + StringArray[1] + StringArray[2];

				if (Integer.valueOf(StringArray[3]) >= 5) {
					array[i][1] = (Integer.valueOf(split) + 1) * 1000000;
				}

				else {
					array[i][1] = Integer.valueOf(split) * 1000000;
				}
			}
		}

		return array;
	}
}