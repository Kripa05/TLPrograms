package week1.day3;

public class PalindromeNumbers {

	 public static void main(String[] args) {
		
		 int number = 54451;
		 int temp = 0;
		 int reminder = 0;
		 int sum = 0;
		 
		 
		 temp = number;
		 while (number > 0) {
			 reminder = number%10;
			 sum = (sum*10) + reminder;
			 number = number/10;
		 }
		 
		 if(temp == sum) {
			 System.out.println("Palindrome");
		 } else {
			 System.out.println("Not Palindrome");
		 }
		 
	}
}
