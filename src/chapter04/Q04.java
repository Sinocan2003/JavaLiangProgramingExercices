package chapter04;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double Pİ = 3;
		
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Pİ / 6));
		
		System.out.println("The area of the hexagon is " + area);
	}
}
