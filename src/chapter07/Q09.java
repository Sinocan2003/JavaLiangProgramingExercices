package chapter07;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];

		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		System.out.println("The minimum number is: " + findMinValue(array));
	}

	public static double findMinValue(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
