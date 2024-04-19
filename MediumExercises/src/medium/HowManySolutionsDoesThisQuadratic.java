package medium;

public class HowManySolutionsDoesThisQuadratic {

	public static void main(String[] args) {

		System.out.println(quadraticSolutionsFinder(1, 0, 1));
	}

	public static int quadraticSolutionsFinder(int a, int b, int c) {

		int discriminant = (b * b) - (4 * a * c);
		if (discriminant == 0) {

			return 1;
		}

		if (discriminant > 0) {

			return 2;
		}

		return 0;
	}
}
