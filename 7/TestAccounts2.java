package labb;
import java.util.Scanner;

public class TestAccounts2 {

	public static void main(String[] args) {
		String name;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter name for first account:");
		name=scan.nextLine();
		Account acc1= new Account(100,name, 1000);
		System.out.println("First account " +acc1);
		
		System.out.println("Enter name for second account:");
		name=scan.nextLine();
		Account acc2= new Account(100,name, 1100);
		System.out.println("\nSecond account" +acc2);
		
		System.out.println("Enter name for third account:");
		name=scan.nextLine();
		Account acc3= new Account(100,name, 1500);
		System.out.println("\nThird account" +acc3);
		
		
		System.out.println("Trying to condolidate second and third accounts");
		Account  conc= Account.consolidate(acc2, acc3);
		
		if(conc==null) {
			System.out.println("sorry,consolidation failed.");
		}else {
			System.out.println("Result account is");
			System.out.println(conc);
		}

	}

}
