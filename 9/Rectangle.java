package labb9;

public class Rectangle extends Shape {
	public double length;
	public double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double calculateArea() {
		double area= length*width;
		return area;
	}
	public double calculateArea(boolean square) {
		if(square) {
			double area=length*length;
			return area;
		}else {
			return calculateArea();
		}
	}

}
