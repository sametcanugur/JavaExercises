package medium;

public class RegExValidatePIN {

	public static void main(String[] args) {
		System.out.println(pinCheck("121317"));
	}

	public static boolean pinCheck(String pin) {
		if (pin.length() == 4 || pin.length() == 6) {
		} else {
			return false;
		}

		for (int i = 0; i < pin.length(); i++) {
			boolean check = false;
			if (pin.charAt(i) == '0' || pin.charAt(i) == '1' || pin.charAt(i) == '2' || pin.charAt(i) == '3'
					|| pin.charAt(i) == '4' || pin.charAt(i) == '5' || pin.charAt(i) == '6' || pin.charAt(i) == '7'
					|| pin.charAt(i) == '8' || pin.charAt(i) == '9') {
			} else {
				return check;
			}
		}
		return true;
	}
}