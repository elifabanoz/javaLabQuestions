package lab4.q1;

import java.util.Arrays;
import java.util.Scanner;

public class CitySorter {

	public static void main(String[] args) {
		String[] strArr= {"ANKARA", "ISTANBUL"};
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a city name:");
			String cities= scan.nextLine().trim().toUpperCase();
			
			if(cities.equals("STOP"))
			{
				break;
			}
			String[] strArr2= new String[strArr.length +1];
			int i=0;
			while(i<strArr.length && strArr[i].compareTo(cities)<0)
			{
				strArr2[i]=strArr[i];
				i++;
			}
			strArr2[i]=cities;
			while(i<strArr.length)
			{
				strArr2[i+1]=strArr[i];
				i++;
			}
			strArr= strArr2;
			System.out.println(Arrays.toString(strArr));
		}
		scan.close();
	}

}
