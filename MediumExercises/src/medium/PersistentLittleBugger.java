package medium;

public class PersistentLittleBugger {

	public static void main(String[] args) {
		System.out.println(multiplicativePersistenceFinder(999));
	}

	public static int multiplicativePersistenceFinder(int input) {
		String[] array = String.valueOf(input).split("");

		if (array.length == 1 || input < 0) {
			return 0;
		}

		for (int i = 1;; i++) {

			int result = 1;
			for (int j = 0; j < array.length; j++) {
				result = result * Integer.valueOf(array[j]);
			}

			array = String.valueOf(result).split("");
			if (array.length == 1) {
				return i;
			}
		}
	}
}