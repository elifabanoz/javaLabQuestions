package labb9;

public class Circle extends Shape {
	public double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double calculateArea() {
		double area=Math.PI * Math.pow(radius, 2);
		return area;
	}
	public double calculateArea(double pii) {
		double area= pii* Math.pow(radius, 2);
		return area;
	}

}
