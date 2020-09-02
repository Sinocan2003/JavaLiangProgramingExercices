package chapter03;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of package: ");
		double weight = input.nextDouble();
		
		if (1 >= weight) {
			System.out.println("It costs 3.5 dollars ");
		} else if (3 >= weight) {
			System.out.println("It costs 5.5 dollars ");
		} else if (10 >= weight) {
			System.out.println("It costs 8.5 dollars ");
		} else if (20 >= weight) {
			System.out.println("It costs 10.5 dollars ");
		} else {
			System.out.println("The package cannot be shipped ");
		}
	}
}
