package classwork6_interface;

public class ShapeTester {

	public static void main(String[] args) {
		
		//you can have Shape on the left hand side, as long as there are shapes 
		//you can't have it on the right hand side
		Shape s = new Square(4.0);
		Shape s2 = new StraightLine(new Point(1, 2), new Point(3, 4));
		//you can even have interfaces on the left hand side
		OpenShapeInterface s1 = new StraightLine(new Point(), new Point());
		boolean b = s1.hasLoop();
		
		//why is this not working??
		//because, the compiler only sees that it is an OpenShapeInterface
		//OpenShapeInterfaces are not guaranteed to have lineLength(), only hasLoop()
		//so you have to cast it as a shape
		
		//double x = s1.lineLength();
	
		
		
		
	}
}
