package week1.day3;

import java.util.Arrays;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {

		int[] list = { 2, 4, 6, 8, 2, 4, 2, 8 };
		int arraySize = list.length;
		int count;
		int index = 0;
		int i, j;
		int[] listWithoutDuplicates = new int[arraySize];

		for (i = 0; i < arraySize; i++) {
			count = 0;

			for (j = i + 1; j < arraySize; j++) {
				if (list[i] == list[j]) {
					count = count + 1;
					break;
				}

			}
			
			  if (count == 0) { listWithoutDuplicates[index] = list[i]; index++; }
		}
			  
			  for (i = 0; i < index; i++) { list[i] = listWithoutDuplicates[i]; }
			  
			  for (i = 0; i < index; i++) { System.out.println("After removing duplicates "
			  + list[i]); }
			 
		}

}
