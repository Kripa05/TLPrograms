package week1.day3;

public class ArraySumOfDigits {

	public static void main(String[] args) {
		
		int[] numbers = {5,7,9,11,15};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("Sum of the given numbers is: " + sum);
	}
}
