package chapter02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the radius and lenght of a cylinder: ");
		double radius = input.nextDouble();
		double lenght = input.nextDouble();
		 
		final double PI = 3.14159265358979323846;
		
		double area = radius * radius * PI;
		double volume = area * lenght;
		
		System.out.println("The area is " + area  + " and the volume is " + volume );
		

	}

}
