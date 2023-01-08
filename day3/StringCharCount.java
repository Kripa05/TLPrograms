package week1.day3;

public class StringCharCount {

	public static void main(String[] args) {
		String str = "Testleaf";
		int count = 0;
		char[] charArray = str.toCharArray();
		for (int i =0; i<charArray.length; i++) {
			if (charArray[i] == 'e') {
				count++;
			}
		}
		System.out.println("The Occurence of 'e' in the String Testleaf is: " + count);
	}
}
