package medium;

public class PandigitalNumbers {

	public static void main(String[] args) {
		System.out.println(numberConfirmer(1122334455667780899L));
	}

	public static boolean numberConfirmer(long number) {
		String[] stringArray = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String numberToString = String.valueOf(number);
		String[] splitArray = numberToString.split("");
		boolean check = true;

		for (int i = 0; i < stringArray.length; i++) {

			for (int j = 0; j < splitArray.length; j++) {
				if (stringArray[i].equals(splitArray[j])) {
					check = true;
					break;
				}

				else {
					check = false;
				}
			}
			
			if (check == false) {
				return false;
			}
		}
		
		return true;
	}
}