package medium;

public class RectangleinCircle {

	public static void main(String[] args) {

		System.out.println(rectangularFittedOrNot(4, 7, 4));
	}

	public static boolean rectangularFittedOrNot(int width, int height, int radius) {

		if ((width * width) + (height * height) <= (2 * radius) * (2 * radius)) {

			return true;
		}

		return false;
	}
}
