package medium;

public class VideoLengthinSeconds {

	public static void main(String[] args) {

		System.out.println(minutesToSecondConvertor("13:56"));
	}

	public static int minutesToSecondConvertor(String minute) {

		String[] inputArray = minute.split(":");
		if (minute == null || minute.isEmpty() || Integer.valueOf(inputArray[1]) >= 60) {

			return -1;
		}

		return (Integer.valueOf(inputArray[0]) * 60) + Integer.valueOf(inputArray[1]);
	}
}
