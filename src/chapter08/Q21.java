package chapter08;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of cities: ");
		int number = input.nextInt();
		
		double[][] array = createArray(number);
		findCentralCity(array); 
	}

	public static void findCentralCity(double[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int row2 = 0; row2 < array.length; row2++) {
				for (int col = 0; col < array[row].length; col++) {
					if (distance(array, row, row2, col)) {
						
					}
				}
			}
		}
	}

	public static boolean distance(double[][] array, int row, int row2, int col) {
		return false;
	}

	public static double[][] createArray(int number) {
		Scanner input = new Scanner(System.in);
		double[][] array = new double[number][2];
		System.out.println("Enter the coordinates of the cities: ");
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = input.nextDouble();
			}
		}
		return array;
	}
}
