package labb9;

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 10);
		 Circle c = new Circle(7);
		 double pii=3.14;
		 ShapeCalculator calculator = new ShapeCalculator();
		 
		 double rectangleArea = calculator.calculateArea(r);
		 System.out.println("The area of the rectangle is " + rectangleArea);
		 
		 double circleArea = calculator.calculateArea(c);
		 System.out.println("The area of the circle is " + circleArea);
		 
		 double rectangleArea2=calculator.calculateArea(r,true);
		 System.out.println("The area of the square is " + rectangleArea2);
		 
		 double rectangleArea3= calculator.calculateArea(r,false);
		 System.out.println("The area of the not square is " + rectangleArea3);
		 
		 double circleArea2=calculator.calculateArea(c, pii);
		 System.out.println("The area of the circle is " + circleArea2);
		 

	}

}
