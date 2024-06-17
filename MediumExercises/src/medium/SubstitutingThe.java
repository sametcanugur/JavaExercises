package medium;

public class SubstitutingThe {

	public static void main(String[] args) {
		System.out.println(wordReplacer("the boy ran at the wall"));
	}

	public static String wordReplacer(String sentence) {
		if (sentence == null) {
			return "Invalid";
		}

		String[] splitArray = sentence.split(" ");
		if (splitArray[splitArray.length - 1].equals("the")) {
			return "Invalid";
		}

		String result = "";
		for (int i = 0; i < splitArray.length; i++) {
			if (splitArray[i].equals("the")) {
				if (splitArray[i + 1].charAt(0) == 'a' || splitArray[i + 1].charAt(0) == 'e'
						|| splitArray[i + 1].charAt(0) == 'i' || splitArray[i + 1].charAt(0) == 'o'
						|| splitArray[i + 1].charAt(0) == 'u') {
					result = result + "an ";
				}

				else {
					result = result + "a ";
				}
			}

			else {
				result = result + splitArray[i] + " ";
			}
		}
		
		return result;
	}
}