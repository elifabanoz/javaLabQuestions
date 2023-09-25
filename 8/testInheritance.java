package Labb8;

public class testInheritance {

	public static void main(String[] args) {
		Circle c1= new Circle("Yellow", 5);
		Cylinder cyl1= new Cylinder(10,"Blue", 4 );
		Curve cur1= new Curve(3,"Red",30);
		
		c1.setRadius(5);
		c1.SetColor("Yellow");
		
		cyl1.setRadius(4);
		cyl1.SetColor("Blue");
		cyl1.setHeight(10);
		
		cur1.setRadius(3);
		cur1.SetColor("Red");
		cur1.setAngle(30);
		
		c1.getArea();
		c1.draw();
		
		cyl1.getArea();
		cyl1.draw(10);
		
		cur1.getArea();
		cur1.draw(10.0);
		
		System.out.println("Circle area value is: " + c1.getArea());
		System.out.println("Cylinder area value is: " + cyl1.getArea());
		System.out.println("Curve area value is: " + cur1.getArea());
		

	}

}
