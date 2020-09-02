package chapter03;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double RADIUS = 10;
		
		System.out.print("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		double distance = Math.sqrt(x * x + y * y);
		
		if (distance <= RADIUS) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle" );
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circle" );
		}
		
				
	}
}
