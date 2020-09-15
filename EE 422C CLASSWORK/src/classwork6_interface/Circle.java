package classwork6_interface;

//Represents circles
public class Circle implements Shape2 {
	public double radius;
	
	//constructs a new circle with the given radius
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	//returns the area of this circle
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	//returns the perimeter of this circle
	public double perimeter() {
		return 2.0 * Math.PI * radius;
	}
	

}
