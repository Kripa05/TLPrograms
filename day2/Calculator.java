package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println("Sum of three numbers is:" + calculator.addNumbers(5, 7, 9));
		
		System.out.println("Product of two numbers is:" + calculator.multiplyNumbers(7,10));
		
		calculator.divideNumbers(40, 5);
		
	}
	
	public int addNumbers(int num1, int num2, int num3) {
		
		int sum = num1+num2 +num3;
		
		return sum;
	}
	
	public int multiplyNumbers(int num1, int num2) {
		int product = num1*num2;
		return product;
	}
	
	public void divideNumbers(int num1, int num2) {
		int quotient =  num1/num2;
		System.out.println("Quotient of two numbers is:" + quotient);
	}
	
}
