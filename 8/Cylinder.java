package Labb8;

public class Cylinder extends Circle{
	public double height;
	final double PI=3.14;
	

	public Cylinder(double height, String color, double radius) {
		super(color,radius);
		this.height=height;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getArea() {
		System.out.println(this.getClass().getSimpleName() + " getArea method is invoked");
		return 2*PI*getRadius()*(height+getRadius());
	}
	public void draw(int val) {
		System.out.println(this.getClass().getSimpleName() + " draw method is invoked");
	    System.out.println("This method draws circle of class " + getClass().getSimpleName());
	    System.out.println("This method is overloaded with an int parameter the value is: " + val);

	}
	public boolean equals(Object o) {
		System.out.println(getClass().getSimpleName() + " equals method is invoked");
		if(o==null) {
			return false;
		}
		if(getClass()!=o.getClass()) {
			return false;
		}
		Cylinder other= (Cylinder) o;
		return Double.compare(radius,other.radius)==0 && color.equals(other.color) && Double.compare(height, other.height)==0;
	}
	public String toString() {
	    return "Cylinder:\tRadius = " + radius + "\tColor = " + color + "\tHeight = " + height;
	}
	
	
}
