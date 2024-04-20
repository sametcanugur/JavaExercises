package medium;

public class IstheStringinOrder {

	public static void main(String[] args) {

		System.out.println(orderChecker("abccd"));
	}

	public static boolean orderChecker(String text) {

		if (text == null || text.isEmpty()) {

			return false;
		}

		char[] charArray = text.toCharArray();
		boolean check = true;
		for (int i = 1; i < charArray.length; i++) {

			int numberHolder1 = charArray[i];
			int numberHolder2 = charArray[i - 1];
			if (numberHolder1 - 1 == numberHolder2 || numberHolder1 == numberHolder2) {

				check = true;
			} else {
				
				return false;
			}
		}
		
		return check;
	}
}
