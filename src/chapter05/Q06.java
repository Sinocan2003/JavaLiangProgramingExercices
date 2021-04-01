package chapter05;

public class Q06 {

	public static void main(String[] args) {
		System.out.println("Miles         Kilometers    |   Kilometers         Miles");

		int kilometers2 = 15;
		for (int mile = 1; mile <= 10; mile++) {
			double kilometer = 1.608 * mile;
			kilometers2 += 5;
			double mile2 = kilometers2 / 1.608;
			System.out.printf("%2d%8s%9.2f%10s%5d%8s%14.2f\n", mile , " " , kilometer, "|", kilometers2 , "" , mile2);

		}
	}
}
