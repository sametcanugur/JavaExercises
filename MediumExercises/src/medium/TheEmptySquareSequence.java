package medium;

public class TheEmptySquareSequence {

	public static void main(String[] args) {
		
		System.out.println(emptySquareCounter(5));
	}

	public static int emptySquareCounter(int number) {
		
		int result=0;
		for(int i=1; i<=number; i++) {
			result=result+(2*(i-1))*4;
		}
		return result;
	}
}
