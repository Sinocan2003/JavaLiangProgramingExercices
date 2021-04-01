package chapter06;

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		System.out.println("The area of the polygon is " + area(side, n));
	}

	public static double area(double side, int n) {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}
