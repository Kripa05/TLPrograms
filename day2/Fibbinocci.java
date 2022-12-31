package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println("Fibbinocci Series:");
		System.out.println(num1);
		
		for (int i = 1; i <= 9; i++) {
			sum = num1 + num2;
			System.out.println (sum);
			num1 = num2;
			num2 = sum;
		}
	}
}
