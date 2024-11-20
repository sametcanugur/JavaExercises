package medium;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println(temperatureConvertor("19*F"));
	}

	public static String temperatureConvertor(String text) {
		if (text == null || text.length() < 3) {
			return "Error";
		}

		String[] splitArray = text.split("");
		if (!splitArray[splitArray.length - 2].equals("*")) {
			return "Error";
		}

		boolean check1 = true;
		if (!splitArray[splitArray.length - 1].equals("C")) {
			check1 = false;
		}

		boolean check2 = true;
		if (!splitArray[splitArray.length - 1].equals("F")) {
			check2 = false;
		}

		if (check1 == false && check2 == false) {
			return "Error";
		}

		int result = 0;
		String[] number = text.split("\\*");

		if (splitArray[splitArray.length - 1].equals("C")) {
			result = (Integer.valueOf(number[0]) * 9 / 5) + 32;
			return String.valueOf(result) + "*" + "F";
		}

		result = (Integer.valueOf(number[0]) - 32) * 5 / 9;
		return String.valueOf(result) + "*" + "C";
	}
}