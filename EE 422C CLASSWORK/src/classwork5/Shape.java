package classwork5;

public abstract class Shape {
	String color;
	
	public String getColor() {
		return color;
	}
	
	public abstract double getPerimeter();

}

class Square extends Shape {
	int side;

	@Override
	public double getPerimeter() {
		return 4*side;
	}
	
	public Square (int side) {
		this.side = side;
	}
	
}

class Circle extends Shape {
	int radius;

	@Override
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
}