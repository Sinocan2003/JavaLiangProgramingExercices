package chapter04;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the bounding circle: ");
		int radius = input.nextInt();

		double x1 = (int) (Math.random() * 1);
		double y1 = radius;
		double x2 = (int) (Math.random() * radius);
		double y2 = (int) (Math.random() * radius);
		double x3 = (int) (Math.random() * radius);
		double y3 = (int) (Math.random() * radius);
		double x4 = (int) (Math.random() * radius);
		double y4 = (int) (Math.random() * radius);

		System.out.println("The coordinates of five points on the pentagon are " + "( " + x1 + ", " + y1 + ")" + "( "
				+ x2 + ", " + y2 + ")" + "( " + x3 + ", " + y3 + ")" + "( " + x4 + ", " + y4 + ")");
	}
}
