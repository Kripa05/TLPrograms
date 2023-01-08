package week1.day3;

public class ArrayMissingElements {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,5,4,7};
		int length = numbers.length + 1;
		int sumOfGivenNumbers = 0;
		
		// Formula (n*(n+1))/2
		int totalSum = (length*(length+1))/2;
		
		
		for (int i =0; i < numbers.length; i++) {
			sumOfGivenNumbers+= numbers[i];
		}
		
		int missingNumber = totalSum - sumOfGivenNumbers;
		System.out.println("The missing number is: " + missingNumber);
	}
	
}
