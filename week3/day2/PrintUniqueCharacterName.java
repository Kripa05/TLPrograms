package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacterName {
	
	public static void main(String[] args) {
		
		String name = "varsha";
		
		char[] nameCharArray = name.toCharArray();
		Set<Character> nameSet = new HashSet<Character>();
		
		for(int i = 0; i < nameCharArray.length; i++) {
			boolean add = nameSet.add(nameCharArray[i]);
			if (!add) {
				System.out.println(nameCharArray[i]);
				nameSet.remove(nameCharArray[i]);
			}
		}
		System.out.println(nameSet);
	}

}
