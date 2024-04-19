package medium;

public class SimulatetheGameRockPaperScissors {

	public static void main(String[] args) {

		System.out.println(gameWinnerFinder("Scissors", "Rock"));
	}

	public static String gameWinnerFinder(String word1, String word2) {

		if (word1 == null || word2 == null || word1.isEmpty() || word2.isEmpty()) {

			return "Undefined";
		}

		if (word1 == word2) {

			return "TIE";
		}

		if ((word1 == "Rock" && word2 == "Scissors") || (word1 == "Paper" && word2 == "Rock")
				|| (word1 == "Scissors" && word2 == "Paper")) {

			return "Player 1 wins";
		}

		if ((word1 == "Rock" && word2 == "Paper") || (word1 == "Scissors" && word2 == "Rock")
				|| (word1 == "Paper" && word2 == "Scissors")) {

			return "Player 2 wins";
		}

		return "Undefined";
	}
}
