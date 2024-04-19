package medium;

public class RecursionArraySum {

	public static void main(String[] args) {
		
		int[] array= {1, 2, 3, 4};
		System.out.println(sumOfArray(array));
	}

	public static int sumOfArray(int[] array) {
		int n=array.length;
		int sum=array[n];
		
		for(int i=1; i<array.length; i++) {
			sum=sum+array[n-i];
		}
		return sumOfArray(array)+sumOfArray(array)-1;
	}
}
