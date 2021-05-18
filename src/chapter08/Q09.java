package chapter08;

import java.util.Scanner;

public class Q09 {

	private static final int EMPTY = 0;
	private static final int X_VALUE = 1;
	private static final int O_VALUE = 2;

	private static final String X_TYPE = "X";
	private static final String O_TYPE = "Y";

	public static void main(String[] args) {
		playTheGame();
	}

	public static void playTheGame() {
		int[][] matrix = new int[3][3];
		while (true) {
			enterPoint(matrix, X_VALUE, X_TYPE);
			printMatrix(matrix);
			if (isWin(matrix, X_VALUE, X_TYPE)) {
				System.out.println("X player won");
				break;
			}

			enterPoint(matrix, O_VALUE, O_TYPE);
			printMatrix(matrix);
			if (isWin(matrix, O_VALUE, O_TYPE)) {
				System.out.println("O player won");
				break;
			}
		}
	}

	public static boolean isWin(int[][] matrix, int value, String type) {
		if (checkTheRows(matrix, value)) {
			return true;
		} else if (checkTheCols(matrix, value)) {
			return true;
		} else if (checkTheLeftCross(matrix, 1)) {
			return true;
		} else if (checkTheRightCross(matrix, 1)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkTheRightCross(int[][] matrix, int value) {
		int count = 0;
		for (int row = 0, col = 2; row < matrix.length; col--, row++) {
			if (matrix[row][col] == value) {
				count++;
			}
		}
		return (count == 3);
	}

	public static boolean checkTheLeftCross(int[][] matrix, int value) {
		int count = 0;
		for (int row = 0, col = 0; col < matrix.length; col++, row++) {
			if (matrix[row][col] == value) {
				count++;
			}
		}
		return (count == 3);
	}

	public static boolean checkTheCols(int[][] matrix, int value) {
		int count = 0;
		for (int col = 0; col < matrix[0].length && count != 3; col++) {
			count = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col] == value) {
					count++;
				}
			}
			if (count == 3)
				return true;
		}
		return false;
	}

	public static boolean checkTheRows(int[][] matrix, int value) {
		int count = 0;
		for (int row = 0; row < matrix.length && count != 3; row++) {
			count = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == value) {
					count++;
				}
			}
			if (count == 3)
				return true;
		}
		return false;
	}

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			System.out.println();
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == EMPTY) {
					System.out.print("| ");
				} else if (matrix[row][col] == X_VALUE) {
					System.out.print("|" + X_TYPE);
				} else {
					System.out.print("|" + O_TYPE);
				}
			}
			System.out.print("|");
		}
		System.out.println("\n");
	}

	public static void enterPoint(int[][] matrix, int value, String type) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a row (0, 1, or 2) for player " + type + ": ");
			int row = input.nextInt();

			System.out.print("Enter a column (0, 1, or 2) for player " + type + ":");
			int col = input.nextInt();

			if (row < 0 || row >= 3 || col < 0 || col >= 3) {
				System.err.println("Row and col should be in 0, 1, 2! Try again");
			} else if (matrix[row][col] != EMPTY) {
				System.err.println("This part is not empty. Try again");
			} else {
				matrix[row][col] = value;
				break;
			}
		}
	}
}
