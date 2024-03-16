package logicbase;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {2,3,6,8,4,5,8};
		int len = arr.length;

		int secondHighest = Integer.MIN_VALUE;
		int Highest = Integer.MIN_VALUE;

		for (int i = 0; i < len; i++) {
			if (arr[i] > Highest) {
				secondHighest = Highest;
				Highest = arr[i];
			}
			if (arr[i] < Highest && arr[i] > secondHighest) {
				secondHighest=arr[i];
			}
		}
		System.out.println(secondHighest);
	}

}
