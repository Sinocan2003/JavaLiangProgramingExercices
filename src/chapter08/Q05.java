package chapter08;

import java.util.Scanner;

public class Q05 {

	private static final int NUMBER_OF_ROW = 3; 
	private static final int NUMBER_OF_COLUMN = 3; 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] matrix1 = new double[NUMBER_OF_ROW][NUMBER_OF_COLUMN];
		double[][] matrix2 = new double[NUMBER_OF_ROW][NUMBER_OF_COLUMN];

		System.out.print("Enter matrix1: ");
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				matrix1[row][col] = input.nextDouble();
			}
		}
		System.out.print("Enter matrix2: ");
		for (int row = 0; row < matrix2.length; row++) {
			for (int col = 0; col < matrix2[row].length; col++) {
				matrix2[row][col] = input.nextDouble();
			}
		}
		double[][] multiplyMatrix = sumOfMatrixs(matrix1, matrix2);
		printMatrix(multiplyMatrix, matrix1, matrix2);
	}

	public static void printMatrix(double[][] multiplyMatrix, double[][] matrix1, double[][] matrix2) {
	
		System.out.println("The matrices are added as follows");
		for (int row = 0; row < NUMBER_OF_ROW; row++) {
			for (int col = 0; col < NUMBER_OF_COLUMN; col++) {
				System.out.print(matrix1[row][col] + " ");
			}
			
			if (row == (NUMBER_OF_ROW / 2)) {
				System.out.print("+ ");
			} else {
				System.out.print("  ");
			}
			
			for (int col = 0; col < NUMBER_OF_COLUMN; col++) {
				System.out.print(matrix2[row][col] + " ");
			}
			
			if (row == (NUMBER_OF_ROW / 2)) {
				System.out.print("= ");
			} else {
				System.out.print("  ");
			}
			
			for (int col = 0; col < NUMBER_OF_COLUMN; col++) {
				System.out.print(multiplyMatrix[row][col] + " ");
			}
			
			System.out.println();
		}
		
	}

	public static double[][] sumOfMatrixs(double[][] matrix1, double[][] matrix2) {
		double[][] multiplyMatrix = new double[3][3];
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				double c = matrix1[row][1] * matrix2[1][col];
				
				multiplyMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
			}
		}
		return multiplyMatrix;
	}
}
