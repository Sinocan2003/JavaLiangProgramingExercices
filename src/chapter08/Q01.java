package chapter08;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		fillMatrixWithUserInput(matrix);

		for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
			double sum = sumColumn(matrix, columnIndex);
			System.out.println("Sum of the elements at column " + columnIndex + " is " + sum);
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;
	}

	public static void fillMatrixWithUserInput(double[][] matrix) {
		Scanner input = new Scanner(System.in);
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}
	}
}
