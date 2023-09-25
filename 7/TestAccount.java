package labb;
import java.util.Scanner;
public class TestAccount {

	public static void main(String[] args) {
	String name;
	double balance;
	long acctNum;
	Account acct;
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Enter account holder's first name");
	name= scan.nextLine();
	
	Account acc1= new Account(name);
	System.out.println("Account for" + name + ":");
	System.out.println(acc1);
	
	System.out.println("\nEnter initial balance");
	balance=scan.nextDouble();
	
	Account acc2= new Account(balance,name);
	System.out.println("Account for" + name + ":");
	System.out.println(acc2);
	
	System.out.println("\nEnter account number");
	acctNum=scan.nextLong();
	
	Account acc3= new Account(balance,name,acctNum);
	System.out.println("Account for" + name + ":");
	System.out.println(acc3);
	
	acc3.deposit(100);
	System.out.println("\nDepositing 100 into account, balance is now");
	System.out.println(acc3.getBalance());
	
	acc3.withdraw(25,2);
	System.out.println("\nWithdrawing $25 with $2 fee, balance is now");
	System.out.println(acc3.getBalance());
	
	
	

	}

}
