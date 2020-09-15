package classwork6_interface;

public class Triangle implements Shape2 {
	private double a;
	private double b;
	private double c;
	
	//Constructs a new triangle given side lengths
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	//Returns the triangle's area using Heron's formula
	public double area() {
		double s = (a+b+c) / 2.0;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}

	@Override
	//Returns the perimeter of this triangle
	public double perimeter() {
		return a + b + c;
	}
	

}
