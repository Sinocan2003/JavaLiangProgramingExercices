package chapter08;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int col = input.nextInt();
		double[][] array = new double[row][col];
		fillTheArray(array);
		findTheLargestElement(array);
	}

	public static void findTheLargestElement(double[][] array) {
		int maxRow = 0;
		int maxCol = 0;
		double max = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (max < array[row][col]) {
					maxRow = row;
					maxCol = col;
					max = array[row][col];
				}
			}
		}
		printTheColAndRowOfMax(maxRow, maxCol);
	}

	public static void printTheColAndRowOfMax(int maxRow, int maxCol) {
		System.out.println("The location of the largest element is at (" + maxRow + ", " + maxCol + ")");
	}

	public static void fillTheArray(double[][] array) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array: ");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = input.nextDouble();
			}
		}
	}
}
