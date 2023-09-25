package labb;
import java.util.Random;

public class Account
{
	private double balance;
	private String name;
	private long acctNum;
	

public String getname() {
	return name;
}

public long getacctNum() {
	return acctNum;
}

public void withdraw(double amount){
	if (balance >= amount)
		balance -= amount;
	else
		System.out.println("Insufficient funds");
}
public void deposit(double amount){
	balance += amount;
}
public double getBalance(){
	return balance;
}
public String toString(){
	return "Name:" + name + "\nAccount Number: " + acctNum +
			"\nBalance: " + balance;
}

public Account(double initBal, String owner, long number) {
	this.balance=initBal;
	this.name=owner;
	this.acctNum=number;
}

public Account (double initBal, String owner) {
	this.balance=initBal;
	this.name=owner;
	this.acctNum=genAccNum();
}

public Account (String owner) {
	this.name=owner;
	this.balance=0;
	this.acctNum=genAccNum();
}

private long genAccNum() {
	Random random= new Random();
	return random.nextLong();
}

public void withdraw(double amount, double fee) {
	if (balance >= amount+ fee) {
		balance -= (amount+fee);
		}
	else {
		System.out.println("Insufficient funds");}
}

public static Account consolidate(Account acc1, Account acc2) {
	if(!acc1.name.equals(acc2.name)) {
		System.out.println("Sorry, two account with the different names cannot be consolidated.");
		return null;
	}
	
	if(acc1.acctNum==acc2.acctNum) {
		System.out.println("Sorry, two account with the same account number cannot be consolidated");
		return null;
}
	double newbalance= acc1.balance+acc2.balance;
	long newAcctNum= acc1.acctNum + acc2.acctNum;
	String newname=acc1.name;
	Account newAcc= new Account(newbalance,newname,newAcctNum);
	return newAcc;
}

}