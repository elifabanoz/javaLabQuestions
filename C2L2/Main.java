package lab2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	static LinkedList <Reservation> reservation = new LinkedList<>();
	 
	 public static void reserve(String personName, String flightNumber) {
		 Reservation reservations = new Reservation(personName, flightNumber);
		 reservation.add(reservations);
	 }
	 
	 public static void cancel(String personName, String flightNumber) {
		for(Reservation ticket: reservation) {
			if(ticket.personName.equals(personName)&& ticket.flightNumber.equals(flightNumber)) {
				reservation.remove(ticket);
				System.out.println("Flight is removed successfully");
				return;
			}
		}
		System.out.println("No flight found " +personName);
	 }
	 
	 public static boolean check(String personName, String flightNumber) {
		 for(Reservation ticket: reservation) {
			 if(ticket.personName.equals(personName)&& ticket.flightNumber.equals(flightNumber)) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public static void list() {
		 System.out.println("The flights: ");
		 for(Reservation ticket : reservation) {
			 System.out.println("Person name: " + ticket.personName  + "\n Flight number " +ticket.flightNumber);
		 }if(reservation.isEmpty()) {
			 System.out.println("There are no reservations");
		 }
	 }
	 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number from the menu:");
		while(true) {
			System.out.println("1.Reserve a ticket ");
			System.out.println("2.Cancel reservation ");
			System.out.println("3.Check reservation ");
			System.out.println("4.List all reservations ");
			System.out.println("5.Exit ");
			int num = scan.nextInt();
			scan.nextLine();
			
			switch(num) {
			case 1:
				System.out.print("Enter the flight number: ");
				String flightNumber= scan.next();
				System.out.println("Enter the person name: ");
				String personName = scan.next();
				reserve(personName, flightNumber);
				System.out.println("Reservation is added successfully ");
				break;
				
			case 2:
				System.out.print("Enter the flight number: ");
				String flightNumber2= scan.next();
				System.out.println("Enter the person name: ");
  			    String personName2 = scan.next();
  			    cancel(personName2, flightNumber2);

				break;
				
			case 3:
			    System.out.print("Enter the flight number: ");
			    String flightNumber3= scan.next();
				System.out.println("Enter the person name: ");
				String personName3 = scan.next();
				if(check(personName3,flightNumber3)== true) {
					System.out.println("Flight exists ");
				}else {
					System.out.println("No flight is found ");
				}
				break;
				
			case 4:
				list();
				break;
				
			case 5:
				Scanner close;
				System.exit(0);
				
			default:
				System.out.println("Invalid number ");
				
			}
		
		}
		
	
		
		
		

	}

}
