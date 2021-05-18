package chapter08;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[3][3];

		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		decimalToBinary(number, matrix);
		printMatrix(matrix);

	}

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					System.out.print("H ");
					continue;
				}
				System.out.print("T ");
			}
			System.out.println();
		}
	}

	public static void decimalToBinary(int number, int[][] matrix) {
		for (int row = matrix.length - 1; row >= 0; row--) {
			for (int col = matrix[row].length - 1; col >= 0; col--) {
				matrix[row][col] = number % 2;
				number = number / 2;
			}
		}
	}
}
