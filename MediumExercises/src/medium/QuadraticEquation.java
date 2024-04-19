package medium;

public class QuadraticEquation {

	public static void main(String[] args) {

		System.out.println(rootFinder(2, -7, 3));
	}

	public static int rootFinder(double a, double b, double c) {
		double squareRoot = (b * b - (4 * a * c));
		double calculation = (-b + Math.sqrt(squareRoot)) / (2 * a);
		String converted = String.valueOf(calculation);
		String result = "";
		for (int i = 0; i < converted.length(); i++) {
			if (converted.charAt(i) != '.') {
				result = result + converted.charAt(i);
			} else {
				return Integer.valueOf(result);
			}
		}
		return 0;
	}
}
