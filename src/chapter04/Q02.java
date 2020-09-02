package chapter04;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		final double EARTH_RADIUS = 6371.01;
		
		double d = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("The distance between the two points is " + d);

	}
}

/*

Enter point 1 (latitude and longitude) in degrees: 39,55 -116,25
Enter point 2 (latitude and longitude) in degrees: 41,5 87,37
The distance between the two points is -1093.2762503252234

 */