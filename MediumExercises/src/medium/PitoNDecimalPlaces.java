package medium;

public class PitoNDecimalPlaces {

	public static void main(String[] args) {

		System.out.println(decimalAdder(11));
	}

	public static double decimalAdder(int n) {

		if (n >= 15 || n < 0) {

			return -1;
		}

		double pi = Math.PI;
		String intToString = String.valueOf(pi);
		String[] firstArray = intToString.split("\\.");
		String[] secondArray = firstArray[1].split("");
		int[] intArray = new int[secondArray.length];

		for (int i = 0; i < secondArray.length; i++) {

			intArray[i] = Integer.valueOf(secondArray[i]);
		}

		String stringResult = "";
		for (int j = 0; j < n; j++) {

			if (j == n - 1) {

				if (intArray[j + 1] >= 5 && intArray[j] != 9) {

					intArray[j] = intArray[j] + 1;
					stringResult = stringResult + String.valueOf(intArray[j]);
					break;
				}
			}

			stringResult = stringResult + String.valueOf(intArray[j]);
		}

		stringResult = firstArray[0] + "." + stringResult;
		return Double.valueOf(stringResult);
	}
}