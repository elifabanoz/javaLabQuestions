package lab.q1;


public class Seller {
private String name;
private double rating;
private int Numberofproducts;
//---------------------------------------------------------------
public Seller(String productName, double sellerRating, int stock)

{
	name= productName;
	rating=sellerRating;
	Numberofproducts= stock;
}



public int removeProduct(int num) {

	if(num>Numberofproducts) {
		return -1;
	}else {
		Numberofproducts-=num;
		return Numberofproducts;
	}

}


public int addProduct(int num) {
Numberofproducts+= num;
return Numberofproducts;
}

 
public String toString() {
	String strStock=Integer.toString(Numberofproducts);
	String strRating = String.valueOf(rating);
	String text= ( "Seller " + name + " has " + strStock + " products and the seller rating is " + strRating);
return text;
}


public double changeRating(double rating) {
	  this.rating += rating;
	    return this.rating;
}
}