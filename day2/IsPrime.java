package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int number = 47;
		int flag = 0;
		for (int i= 2; i< number; i++) {
			
			if (number%i == 0) {
				flag++;
				break;
			}
			
		}
		
		if (flag == 0) {
			System.out.println(number + " is a Prime Number");
		} else if (flag != 0) {
				System.out.println(number + " is not a Prime Number");
			}
		
	}
}
