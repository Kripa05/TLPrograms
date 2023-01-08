package week1.day3;

import java.util.Arrays;

public class ArrayMinMaxValue {

	public static void main(String[] args) {
		int[] nums={45,567,67,8787,5657,23,19};
		int length = nums.length;
		int index = length-1;
		Arrays.sort(nums);
		System.out.println("Minimum Value of the Array is: " + nums[0]);
		System.out.println("Maximun Value of the Array is: " + nums[index]);
		System.out.println("The Second largest Number is: " + nums[index-1]);
		
	}
	
}
