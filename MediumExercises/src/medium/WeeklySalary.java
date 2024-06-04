package medium;

public class WeeklySalary {

	public static void main(String[] args) {
		int[] array = { 0, 0, 0, 0, 0, 12, 0 };
		System.out.println(salaryCalculator(array));
	}

	public static int salaryCalculator(int[] array) {
		int salary = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= 8 && i < 5) {
				salary = salary + (array[i] * 10);
			}

			if (array[i] > 8 && i < 5) {
				salary = salary + (8 * 10) + ((array[i] - 8) * 15);
			}

			if (array[i] <= 8 && i > 4) {
				salary = salary + (array[i] * 20);
			}

			if (array[i] > 8 && i > 4) {
				salary = salary + (8 * 20) + ((array[i] - 8) * 30);
			}
		}

		return salary;
	}
}