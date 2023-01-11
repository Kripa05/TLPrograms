package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
	
		Set<String> removeDuplicates = new LinkedHashSet<String>();
		for (String each: words) {
			removeDuplicates.add(each);
		}
		
		//System.out.println(removeDuplicates);
		
		String finalString = removeDuplicates.toString().replace(",", " ").replace("[", "").replace("]","");
		System.out.println(finalString);
		
	}
	
}
