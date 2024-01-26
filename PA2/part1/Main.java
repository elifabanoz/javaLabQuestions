package pa2;

import java.util.Arrays;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) {
		Person[] person = { 
				new Person("Elif", "Abanoz",14 ),
		        new Person("Ayşenur", "Abanoz", 28),
		        new Person("Selçuk", "Abanoz", 6),
	            new Person("Ayşe", "Yılmaz", 32137),
	           	new Person("Arda", "Sönmez", 4324),
		        new Person("Şüheda", "Tatlı", 5435),
		        new Person("Kamil", "Kara", 664757),
		        new Person("Açelya", "Gündüz", 90094),
		        new Person("Neriman", "Şimşek", 89878),
		        new Person("Erva", "Uzun", 64566),
	};
		
		System.out.println("Original array: " + Arrays.toString(person));
		
		  Person.mergeSortDes(person);
	        System.out.println("Merge Sort Descending by ID: " + Arrays.toString(person));
	      
	        Person.mergeSort(person, Comparator.comparing(Person::getName).reversed());
	        System.out.println("Merge Sort Descending by Name: " + Arrays.toString(person));

	        Person.mergeSort(person, Comparator.comparing(Person::getSurname).reversed());
	        System.out.println("Merge Sort Descending by Surname: " + Arrays.toString(person));
	       
	        Person.quickSortDes(person);
	        System.out.println("Quick Sort Descending by ID: " + Arrays.toString(person));
	       
	        Person.quickSort(person, Comparator.comparing(Person::getName).reversed());
	        System.out.println("Quick Sort Descending by Name: " + Arrays.toString(person));

	        Person.quickSort(person, Comparator.comparing(Person::getSurname).reversed());
	        System.out.println("Quick Sort Descending by Surname: " + Arrays.toString(person));
	    }
	

	
	
	}

	


