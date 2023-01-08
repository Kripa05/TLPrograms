package week1.day3;

public class ArrayPrintDuplicates {

	public static void main(String[] args) {

		  int[] numbers = new int[] {5,7,5,6,3,5,7}; 
		  int count = 0; 
		  
		  System.out.print("Duplicates are: "); 
		  for (int i = 0; i < numbers.length; i++) { 
			  for (int j = i+1; j < numbers.length; j++) {
			  if (numbers[i] == numbers[j]) { 
				  System.out.print(numbers[i] + ","); 
				  } 
			  } 
			  }
	}
}
