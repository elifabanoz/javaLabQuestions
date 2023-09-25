package lab4.q1;

import java.util.Arrays;

public class Sorter {

	public static int[] merge( int[] arr1, int [] arr2) {
		int[] merged= new int[arr1.length + arr2.length];
		int i=0;
		int a=0;
		int b=0;
		while(i<arr1.length && a<arr2.length)
		{
			if (arr1[i]<arr2[a]) {
				merged[b++]=arr1[i++];
				
			}else {
				merged[b++]= arr2[a++];
			}
		}
		while (i<arr1.length)
		{
			merged[b++]= arr1[i++];
		}
		while(b<arr2.length)
		{
			merged[b++]=arr2[a++];
		}
		return merged;
	}
	
	public static int getMax(int [] sortedArray)
	{
		int x= sortedArray[sortedArray.length-1];
		return x;
	}
	
	public static int getMin(int [] sortedArray) 
	{
		int y= sortedArray[0];
		return y;
	}
	}