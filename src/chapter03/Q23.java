package chapter03;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x <= (10 / 2) && x >= - (10 / 2) && y <= (5 / 2) && y >= - (5 / 2)) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle" );
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		}
	}
}