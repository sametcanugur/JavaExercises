package medium;

public class ReturntheHighestandLowestNumbers {

	public static void main(String[] args) {

		System.out.println(numberSorter("1 2 -3 4 5"));
	}

	public static String numberSorter(String number) {

		if (number == null || number.isEmpty()) {

			return "Undefined";
		}

		String[] stringArray = number.split(" ");
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < stringArray.length; i++) {

			intArray[i] = Integer.valueOf(stringArray[i]);
		}

		for (int j = 0; j < intArray.length; j++) {

			for (int k = 0; k < intArray.length - 1; k++) {

				int numberHolder = 0;
				if (intArray[k] > intArray[k + 1]) {

					numberHolder = intArray[k];
					intArray[k] = intArray[k + 1];
					intArray[k + 1] = numberHolder;
				}
			}
		}

		return String.valueOf(intArray[intArray.length - 1]) + " " + String.valueOf(intArray[0]);
	}
}
