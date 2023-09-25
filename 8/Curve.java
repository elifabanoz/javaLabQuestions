package Labb8;

public class Curve extends Circle{
	public double angle;
	final double PI=3.14;
	

	public Curve(double radius, String color, double angle) {
		super(color,radius);
		this.angle=angle;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle=angle;
	}
	public double getArea() {
		System.out.println(this.getClass().getSimpleName() + " getArea method is invoked");
		return (angle/360)*PI*getRadius()*getRadius();
	}
	  public void draw(double val) {
		 System.out.println(this.getClass().getSimpleName() + " draw method is invoked");
		 System.out.println("This method draws circle of class " + getClass().getSimpleName());
		 System.out.println("This method is overloaded with an double parameter the value is: " +val);
		}
	public boolean equals(Object o) {
		System.out.println(getClass().getSimpleName() + " equals method is invoked");
		if(o==null) {
			return false;
		}
		if(getClass()!=o.getClass()) {
			return false;
		}
		Curve other= (Curve) o;
		return Double.compare(radius,other.radius)==0 && color.equals(other.color) && Double.compare(angle, other.angle)==0;
	}
	
	public String toString() {
	    return "Curve:\tRadius = " + radius + "\tColor = " + color + "\tAngle = " + angle;
	}
}
