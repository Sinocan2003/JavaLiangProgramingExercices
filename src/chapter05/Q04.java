package chapter05;

public class Q04 {

	public static void main(String[] args) {
		System.out.println("Miles        KÝlometers");
		
		for (int mile = 1; mile <= 10; mile++) {
			double kilometer = 1.608 * mile;
			System.out.printf("%4d%8s%8.2f\n", mile , " " , kilometer);
		}
	}
}
