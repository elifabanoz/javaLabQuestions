package Labb8;

public class Circle {
	public double radius;
	public String color;
	final double PI=3.14;
	
	public Circle(String color, double radius) {
		this.radius=radius;
		this.color=color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void SetColor(String color) {
		this.color=color;
	}
	
	public double getArea() {
		System.out.println(this.getClass().getSimpleName() + " getArea method is invoked");
		return PI*radius*radius;
	}
	
	public void draw() {
		System.out.println(this.getClass().getSimpleName()+ " draw method is invoked");
		System.out.println("This method draws circle of class " + this.getClass().getSimpleName());
	}
	public boolean equals(Object o) {
		System.out.println(getClass().getSimpleName() + " equals method is invoked");
		if(o==null) {
			return false;
		}
		if(getClass()!=o.getClass()) {
			return false;
		}
		Circle other= (Circle) o;
		return Double.compare(radius,other.radius)==0 && color.equals(other.color);
	}
	public String toString() {
	    return "Circle:\tRadius = " + radius + "\tColor = " + color;
	}
	

}
