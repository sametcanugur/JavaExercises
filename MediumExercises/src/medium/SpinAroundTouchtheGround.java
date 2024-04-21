package medium;

public class SpinAroundTouchtheGround {

	public static void main(String[] args) {

		String[] array = { "left", "left", "left", "left" };
		System.out.println(spinCounter(array));
	}

	public static double spinCounter(String[] array) {

		if (array == null) {

			return -1;
		}

		double sum = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i].equals("right")) {

				sum = sum + 0.25;
			}

			if (array[i].equals("left")) {

				sum = sum + (-0.25);
			}
		}

		if (sum < 0) {

			sum = sum * -1;
		}

		return sum;
	}
}
