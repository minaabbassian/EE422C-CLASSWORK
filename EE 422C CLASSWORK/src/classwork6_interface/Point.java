package classwork6_interface;

public class Point {
	int x;
	int y;
	
	public Point () {
		this(0, 0);
	}
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Creating a new point at " +  toString());
	}

	public Point (int x) {
		this.x = x;
		this.y = 0;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x1) {
		if (x1 < 0)
			System.out.println("x cannot be < 0! Not changed.");
		else 
			x = x1;
	}

	public void setY(int y1) {
		y = y1;
	}

	public int[] getCoords() {
		int [] coords = {x, y};
		return coords;	

	}

    public String toString () {
        return "(" + x + ", " + y + ")";
    } 

	public double distanceFromOrigin() {
		Point p = new Point();
		return distance(p);

	}


	public double distance(Point other) {
		double dist = (x - other.x)*(x - other.x);
		dist += (y - other.y)*(y - other.y);
		
		return Math.sqrt(dist);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
	
	
	

}

class Point_sub extends Point {
	public Point_sub (int x, int y) {
		super(x, y);
		System.out.println("Creating a new point at " +  toString());
	}
	
	@Override
	public boolean equals(Object o) {	// equals should be reflexive
	    if (o instanceof Point_sub) {
	        // o is a Point; cast and compare it
	        Point_sub other = (Point_sub) o;
	        return x == other.x && y == other.y;
	    } else {
	        // o is not a Point_sub; cannot be equal
	        return false;
	    }
	}
	
}
