package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollections {
	
	public static void main(String[] args) {
		
		String[] values = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		int length = values.length;
		Set<String> set = new TreeSet<String>(); 
		
		for (int i = 0; i < length; i++) {
			set.add(values[i]);
		}
		System.out.println(set);
		
		List<String> arrayList = new ArrayList<String>(set);
		
		for (int i = arrayList.size()-1; i >= 0; i--) {
			System.out.print(arrayList.get(i) + " ");
		}
	}

}
