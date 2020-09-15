package classwork6_interface;

//abstract class cannot be instantiated

public abstract class Shape {
	String color; //border color
	
	public Shape() {
		color = "black";
	}
	
	public abstract double lineLength();
}


class Square extends Shape implements ClosedShapeInterface {
	//if Square is to be a concrete class, you have to define what's meant
	//	by the lineLength() method
	
	//A Square is qualified to be a ClosedShapeIntereface
	//Therefore, it has a getArea() and getPerimeter() method

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

	//perimeter
	@Override
	public double lineLength() {
		return 4*side;
	}
}



class StraightLine extends Shape implements OpenShapeInterface {
	Point p1, p2;
	

	public StraightLine(Point point, Point point2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasLoop() {
		return false;
	}

	//shapes need to implement lineLength()
	@Override
	public double lineLength() {
		return p1.distance(p2);
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
