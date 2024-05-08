package medium;

public class MaximumDistance {

	public static void main(String[] args) {

		System.out.println(maxDistanceCalculator(55.5, 5.5, 5, false));
	}

	public static double maxDistanceCalculator(double fuel, double fuelUsage, int passenger,

			boolean airConditionStatus) {

		if (airConditionStatus == true) {

			return (fuel * 100) / ((((fuelUsage * (100 + (passenger * 5))) / 100) * 110) / 100);
		}

		return (fuel * 100) / ((((fuelUsage * (100 + (passenger * 5))) / 100)));
	}
}