package medium;

public class IntegerDigitsCount {

	public static void main(String[] args) {

		System.out.println(digitCounter(-124666));
	}

	public static int digitCounter(int number) {

		String convertedNumber = String.valueOf(number);
		int count = 0;
		for (int i = 0; i < convertedNumber.length(); i++) {
			
			int numberHolder = convertedNumber.charAt(i);
			if (numberHolder >= 48 && numberHolder <= 57) {
				
				count++;
			}
		}
		
		return count;
	}
}
