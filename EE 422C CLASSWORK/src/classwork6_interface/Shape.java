package classwork6_interface;

public abstract class Shape {
	String color;
	
	public Shape() {
		color = "black";
	}
	
	public abstract double lineLength();
}

class Square extends Shape implements ClosedShapeInterface {

	double side;
	
	public Square (double side) {
		this.side = side;
	}
	public Square () {
		this(0);
	}
	
	@Override
	public double getArea() {
		return side*side;
	}

	@Override
	public double getPerimeter() {
		return lineLength();
	}

	@Override
	public double lineLength() {
		return 4*side;
	}
}

class smallSquare extends Square implements Scaleable, OpenShapeInterface {

	@Override
	public void scale(double factor) {
		side *= factor;
	}

	@Override
	public boolean hasLoop() {
		return false;
	}
	
}
