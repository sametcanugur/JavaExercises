package medium;

public class CrowdedCarriageCapacity {

	public static void main(String[] args) {

		int[] array = { 50, 20, 80, 90, 100, 60, 30, 50, 80, 60 };
		System.out.println(carriagesCapacityFinder(1000, array));
	}

	public static int carriagesCapacityFinder(int capacity, int[] inputArray) {

		int eachCapacity = capacity / inputArray.length;
		int limit = eachCapacity / 2;

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] <= limit) {

				return i;
			}
		}

		return -1;
	}
}
