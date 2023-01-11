package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,5,5,4,6,5,8,9,10,2,4,8};
		
		int missingNumber = 0;
		
		TreeSet<Integer> numbersTreeSet = new TreeSet<Integer>();
		
		for(Integer each:numbers) {
		
			numbersTreeSet.add(each);
		}
		System.out.println(numbersTreeSet);
		
		List<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.addAll(numbersTreeSet);
		
		for (int i = 0; i < numbersList.size(); i++) {
			if (i+1 != numbersList.get(i)) {
				missingNumber = i+1;
				System.out.println("The Missing Number is: " + missingNumber);
				break;
			}
		}
		
		
		
		
		
		
	}

}
