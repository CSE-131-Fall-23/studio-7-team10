package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	//constructor
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	//length accessor
	public double getLength() {
		return length;
	}
	//width accessor
	public double getWidth() {
		return width;
	}
	//return perimeter
	public static double Perimeter(Rectangle r) {
		return 2 * r.getLength() + 2 * r.getWidth();
	}
	//return area 
	public static double Area(Rectangle r) {
		return r.getLength() * r.getWidth();
	}
	
	// compare areas
	public static String Comparison(Rectangle r1, Rectangle r2) {
		if (Area(r1) > Area(r2)) {
			return "Area of 1st rectangle larger than area of 2nd";
		}
		else if (Area(r2) > Area(r1)) {
			return "Area of 2nd rectangle larger than area of 1st";
		}
		else {
			return "Rectangles have same area";
		}
	}
	public static boolean isSquare(Rectangle r) {
		if (r.getLength() == r.getWidth()) {
			return true;
		} else {
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,5);
		Rectangle r2 = new Rectangle(4,5);
		System.out.println(Perimeter(r1));
		System.out.println(Area(r1));
		System.out.println(Comparison(r1,r2));
		System.out.println(isSquare(r1));
		System.out.println(isSquare(r2));

	}

}
