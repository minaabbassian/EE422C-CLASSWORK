package lecture4;

public class PointMain {

	public static void main(String[] args) {
		Point p1 = new Point(4, 3);
		p1.setX(4);
		p1.setY(3);
		System.out.println(distanceFromOrigin(p1));
		System.out.println(Point.distanceFromOrigin2(p1));
		System.out.println(new PointMain().distanceFromOrigin3(p1));
		
		System.out.println(p1.distanceFromOrigin());
		Point p2 = new Point();
		p2.setX(5);  
		p2.setY(12);
		System.out.println(p2.distanceFromOrigin());
		// 		System.out.println(p1.noOfPoints);
		System.out.println(p1.distance(p2));
		System.out.println(Point.noOfPoints);
		
	}
	
	
	public static double distanceFromOrigin(Point p) {
		return Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
	}
	
	public double distanceFromOrigin3(Point p) {
		return Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
	}
	
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	}
}
