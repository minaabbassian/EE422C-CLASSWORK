package lecture4;

public class Point {
	private int x;
	private int y;
	static int noOfPoints = 0;
	
	public Point (int x, int y) {
		this.x  = x;
		this.y = y;
		noOfPoints++;
	}
	
	public Point() {
		this(0, 0);
	}
	public static double distanceFromOrigin2(Point p) {
		return Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
	}
	
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
}
