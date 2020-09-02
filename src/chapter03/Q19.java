package chapter03;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the edges of the triangle: ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		double heigh = Math.sqrt(Math.pow((edge1 / 2), 2) - Math.pow(edge3, 2));
		double area = (edge1 * heigh) / 2;
		
		if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge3 + edge2 > edge1) {
			System.out.println("The area of the triangle is " + area);
		} else {
			System.out.println("Input is invalid ");
		}
	}
}
