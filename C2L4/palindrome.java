package lab4;
import java.util.Scanner;

public class palindrome {


	public static void main(String[] args) {
		String word1= "level";
		String word2= "test";
		
		//ya da kullanıcıdan alırız:
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter word:");
		String word= scan.nextLine();
		if(isPalindrome(word)) {
			System.out.println(word + " true");
		}else {
			System.out.println(word + " false");
		}
		
		if(isPalindrome(word1)) {
			System.out.println(word1 + " true");
		}else {
			System.out.println(word1 + " false");
		}
		
		if(isPalindrome(word2)) {
			System.out.println(word2 + " true");
		}else {
			System.out.println(word2 + " false");
		}
		
		
		

	}
	
	public static boolean isPalindrome(String word) {
		if(word.length()<=1) {
			return true;
		}else if(word.charAt(0)!= word.charAt(word.length()-1)) {
			return false;
		}else {
			return isPalindrome(word.substring(1, word.length()-1));
		}
		
		
	}

}
