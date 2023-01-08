package week1.day3;

public class ArrayChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String str = "coimbatore";
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i%2 == 0) {
				System.out.print(Character.toUpperCase(ch));
			}
			else {
				System.out.print(Character.toLowerCase(ch));
			}
		}
	}
}
