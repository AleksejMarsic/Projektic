package paket;

public class test {

	public static void main(String[] args) {
		Point point1 = new Point(3, 4, true);
		point1.setX(10);
		point1.setY(5);

		System.out.println("X koordinata tacke je: " + point1.getX());
		System.out.println("Y koordinata tacke je: " + point1.getY());
		System.out.println("Da li je tacka selektovana " + point1.isSelectected());
		
		double distanceResult = point1.distance(15, 7);
		System.out.println(distanceResult);
		
		System.out.println(point1);

	}

}
