package medium;

public class HighestDigit {

	public static void main(String[] args) {

		System.out.println(highestDigitFinder(377401));
	}

	public static int highestDigitFinder(int number) {

		String stringConverted = String.valueOf(number);
		String[] stringArray = stringConverted.split("");
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < intArray.length; i++) {

			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		int numberHolder = 0;
		for (int j = 0; j < intArray.length; j++) {

			for (int k = 0; k < intArray.length - 1; k++) {

				if (intArray[k] > intArray[k + 1]) {

					numberHolder = intArray[k];
					intArray[k] = intArray[k + 1];
					intArray[k + 1] = numberHolder;
				}

			}
		}

		return intArray[intArray.length - 1];
	}
}
