package classwork6_interface;

public class Rectangle implements Shape2 {
	private double width;
	private double height;
	
	//Constructs a new rectangle with the given dimensions
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	//Returns the area of this rectangle
	public double area() {
		return width * height;
	}

	@Override
	//Returns the perimeter of this rectangle
	public double perimeter() {
		return 2.0 * (width + height);
	}
	

}
