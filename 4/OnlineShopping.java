package lab.q1;
import java.util.Scanner;

public class OnlineShopping {

    public static void main(String[] args) {
        System.out.print("Enter the number of sellers: ");
        Scanner scanner = new Scanner(System.in);
        int numSellers = scanner.nextInt();
        int numOfSellers = scanner.nextInt();
         
        String [] names = new String[numOfSellers];
        double [] ratings = new double [numOfSellers];
        int[] stocks=  new int[numOfSellers];
        for (int i=0; i<numOfSellers; i++)
        {
        	System.out.println("Seller name:");
        	names[i]= scanner.next();
        	System.out.println("Seller rating:");
        	ratings[i]=scanner.nextDouble();
        	System.out.println("Number of products by the seller:");
        	stocks[i]= scanner.nextInt();
        }
    
         Seller sellerNumber1 = new Seller(names[0], ratings[0] , stocks[0]);
         Seller sellerNumber2 = new Seller(names[1], ratings[1], stocks[1]);
         Seller sellerNumber3 = new Seller(names[2], ratings[2], stocks[2]);
         
         sellerNumber1.removeProduct(50);
         System.out.println(sellerNumber1.toString());
         
         sellerNumber3.addProduct(100);
         System.out.println(sellerNumber3.toString());
         
         sellerNumber2.changeRating(0.6);
         sellerNumber3.changeRating(-0.5);
         
         System.out.println(sellerNumber1.toString());
         System.out.println(sellerNumber2.toString());
         System.out.println(sellerNumber3.toString());
         
         
         
        
         
        
     
        }
    }


