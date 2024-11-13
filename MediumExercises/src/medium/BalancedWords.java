package medium;

public class BalancedWords {

	public static void main(String[] args) {
		System.out.println(wordBalanceChecker("brake"));
	}

	public static boolean wordBalanceChecker(String text) {
		if (text.equals(null) || text.length() < 2) {
			return false;
		}

		int k = text.length() - 1;
		if (text.length() % 2 == 0) {
			int result1 = 0;
			int result2 = 0;

			for (int i = 0; i < text.length() / 2; i++) {
				int holder1 = text.charAt(i);
				int holder2 = text.charAt(k);
				result1 = result1 + (holder1 - 96);
				result2 = result2 + (holder2 - 96);
				k--;
			}

			if (result1 == result2) {
				return true;
			} else {
				return false;
			}
		}

		int result3 = 0;
		int result4 = 0;

		for (int j = 0; j < (text.length() - 1) / 2; j++) {
			int holder3 = text.charAt(j);
			int holder4 = text.charAt(k);
			result3 = result3 + (holder3 - 96);
			result4 = result4 + (holder4 - 96);
			k--;
		}

		if (result3 == result4) {
			return true;
		} else {
			return false;
		}
	}
}