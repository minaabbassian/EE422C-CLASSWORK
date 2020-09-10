package lecture4;

public class Point {
	//x/y data called fields 
	private int x;
	private int y;
	static int noOfPoints = 0;
	public static int counter = 0;
	private static final boolean DEBUG = true;
	
	//behavior called methods
	public Point (int x, int y) {
		counter++;
		if(DEBUG)
			System.out.println(counter + "th point Constructed a point at " + x + " " + y);
		this.x  = x;
		this.y = y;
		noOfPoints++;
		
	}
	
	//if you want a default constructor, you have to do this
	public Point() {
		//constructor call must be the first thing in a constructor
		this(0, 0); //calls the other constructor above, with parameters 0 and 0
	}
	public static double distanceFromOrigin2(Point p) {
		return Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
	}
	
	//instance method 
	//each Point object has its own copy of the distanceFromOrigin method,
	//	which operates on that object's state
	public double distanceFromOrigin() {
		//return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance(new Point(0, 0));
	}
	
	public double distance(Point o) {
		return Math.sqrt(Math.pow(x - o.x, 2) + Math.pow(y - o.y, 2));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	//sets the point's x and y to the given values
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//adjusts the point's x and y by the given amounts 
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	//every object has a toString method
	//no parameters in the method
	@Override
	public String toString() {
		return "[" + x + ", " + y +"]";
	}
	
	//you should be able to pass in ANY object
	//anything that is an Object can be passed as a parameter
	@Override 
	public boolean equals(Object other) {
		if(other == null)
			return false; //a null object 
		if(!(other instanceof Point))
			return false; 
		Point p = (Point) other; 
		if(p.x == this.x && p.y == this.y)
			return true;
		return false;
	}
}
