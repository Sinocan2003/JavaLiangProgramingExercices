package chapter08;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		double[][] m = new double[4][4];
		fillMatrixWithUserInput(m);
		double sum = sumMajorDiagonal(m);
		System.out.println("Sum of the elements in the major diagonal is " + sum);
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}

	public static void fillMatrixWithUserInput(double[][] m) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				m[row][col] = input.nextDouble();
			}
		}
	}
}
