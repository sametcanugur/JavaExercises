package medium;

public class SolveLinearEquation {

	public static void main(String[] args) {
		System.out.println(unknownFinderInLinearEquation("x + 300 = 100"));
	}

	public static int unknownFinderInLinearEquation(String equation) {
		if (equation == null || equation.isEmpty()) {
			return -1;
		}

		String[] splitArray = equation.split(" ");

		if (splitArray[1].equals("+")) {
			return Integer.valueOf(splitArray[4]) - Integer.valueOf(splitArray[2]);
		}

		else {
			return Integer.valueOf(splitArray[4]) + Integer.valueOf(splitArray[2]);
		}
	}
}