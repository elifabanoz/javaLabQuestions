package labb9;

public class ShapeCalculator {
	public double calculateArea(Rectangle r) {
		return r.calculateArea();
	}
	
	public double calculateArea(Circle c) {
		return c.calculateArea();
	}
	
	public double calculateArea(Rectangle r, boolean square) {
		return r.calculateArea(square);
	}
	public double calculateArea(Circle c, double pii) {
		return c.calculateArea(pii);
	}

}
