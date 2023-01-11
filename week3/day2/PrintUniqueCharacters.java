package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacters {
	
	public static void main(String[] args) {
		String companyName = "google";
		String str = "";
		char[] charArray = companyName.toCharArray();
		
		//Set<Character> uniqueCharacters = new HashSet<Character>();
		
		Set<Character> uniqueCharacters = new LinkedHashSet<Character>();
		
		for(int i=0; i<companyName.length(); i++) {
			uniqueCharacters.add(charArray[i]);
		}
		
		System.out.println(uniqueCharacters);
		
		for (Character each:uniqueCharacters) {
			str=str+each;
		}
		
		System.out.println(str);
	}

}
