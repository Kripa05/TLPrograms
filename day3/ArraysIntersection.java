package week1.day3;

public class ArraysIntersection {

	public static void main(String[] args) {
		int[] number1 = {2,4,6,8,10,12};
		int[] number2 = {0,2,8,12,24,48};
		
		for(int i=0; i<number1.length; i++) {
			for (int j=0; j<number2.length; j++) {
				if(number1[i] == number2[j]) {
					System.out.println(number2[j]);
				}
			}
		}
	}
}
