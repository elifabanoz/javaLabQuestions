package lab4.q1;

import java.util.Arrays;

public class MergeSortTester {
	
	public static void main (String[] args)
	{
		int[] arr1= {1,2,4,7,8,11};
		int[] arr2= {3,6,8,9,10,11,12,14};
		int[] merged= Sorter.merge(arr1,arr2);
		int max= Sorter.getMax(merged);
		int min= Sorter.getMin(merged);
		
		System.out.println("New array:" + Arrays.toString(merged));
		System.out.println("Max value is " +max);
		System.out.println("Min value is" + min);
}



}
