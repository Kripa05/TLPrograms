package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String example = "PayPal India"; 
		char[] exampleArray = example.toCharArray();
		System.out.println(exampleArray);
		
		Set<Character> hashSet = new HashSet<Character>();
		Set<Character> duplicateHashSet = new HashSet<Character>();
		
		for (int i = 0; i < exampleArray.length; i++) {
			
			if(!hashSet.contains(exampleArray[i])) {
				hashSet.add(exampleArray[i]);
			} else {
				duplicateHashSet.add(exampleArray[i]);
			}
		}
		System.out.println(hashSet);
		System.out.println(duplicateHashSet);
		
		ArrayList<Character> arrayList = new ArrayList<Character>(hashSet);
		ArrayList<Character> duplicateArrayList = new ArrayList<Character>(duplicateHashSet);
		
		
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < duplicateArrayList.size(); j++) {
				if (arrayList.get(i).equals(duplicateArrayList.get(j))) {
					arrayList.remove(i);
				}
			}
			
		}
		System.out.println(arrayList);
		
		
		
		for (int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).equals(' ')) {
				arrayList.remove(i);
			}
		}
		System.out.println(arrayList);	
	}

}
