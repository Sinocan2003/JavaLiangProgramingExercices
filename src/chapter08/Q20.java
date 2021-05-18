package chapter08;

import java.util.Scanner;

public class Q20 {

	private static final int RED_VALUE = 1;
	private static final int YELLOW_VALUE = 2;

	private static final String RED_TYPE = "R";
	private static final String YELLOW_TYPE = "Y";

	public static void main(String[] args) {
		int[][] matrix = new int[6][7];
		while (true) {
			putADisk(matrix, RED_TYPE, RED_VALUE);
			printMatrix(matrix, RED_TYPE, YELLOW_TYPE, RED_VALUE, YELLOW_VALUE); 
			if (isWin(matrix, RED_VALUE, RED_TYPE)) {
				System.out.println("The " + RED_TYPE + " player is win");
				return;
			}
			putADisk(matrix, YELLOW_TYPE, YELLOW_VALUE);
			printMatrix(matrix, RED_TYPE, YELLOW_TYPE, RED_VALUE, YELLOW_VALUE);
			if (isWin(matrix, YELLOW_VALUE, YELLOW_TYPE)) {
				System.out.println("The " + YELLOW_TYPE + " player is win");
				return;
			}
		}
	}

	public static void printMatrix(int[][] matrix, String redType, String yellowType, int redValue, int yellowValue) {
		for (int row = 0; row < matrix.length; row++) {
			System.out.println();
			System.out.print("|");
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == redValue) {
					System.out.print(redType + "|");
				} else if (matrix[row][col]== yellowValue) {
					System.out.print(yellowType + "|");
				} else {
					System.out.print(" |");
				}
			}
		}
		System.out.println("\n");
	}

	public static boolean isWin(int[][] matrix, int value, String type) {
		if (checkTheRows(matrix, value)) {
			return true;
		} else if (checkTheCols(matrix, value)) {
			return true;
		} else if (checkTheLeftCross(matrix, value)) {
			return true;
		} else if (checkTheRightCross(matrix, value)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkTheRightCross(int[][] matrix, int value) {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int row = i, col = matrix[row].length - 1; row < matrix.length; col--, row++) {
				if (matrix[row][col] == value) {
					count++;
				} else {
					count = 0;
				}
				if (count == 4) {
					return true;
				}
			}
			if (count == 4) {
				return true;
			}
			return false;
		}
		return false;ogfop
	}

	public static boolean checkTheLeftCross(int[][] matrix, int value) {
		int count = 0;
		for (int row = 0, col = 0; row < matrix.length; col++, row++) {
			if (matrix[row][col] == value) {
				count++;
			} else {
				count = 0;
			}
			if (count == 4) {
				return true;
			}
		}
		if (count == 4) {
			return true;
		}
		return false;
	}

	public static boolean checkTheCols(int[][] matrix, int value) {
		int count = 0;
		for (int col = 0; col < matrix[0].length; col++) {
			count = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col] == value) {
					count++;
				} else {
					count = 0;
				}
				if (count == 4) {
					return true;
				}
			}
		}
		if (count == 4) {
			return true;
		}
		return false;
	}

	public static boolean checkTheRows(int[][] matrix, int value) {
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			count = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == value) {
					count++;
				} else {
					count = 0;
				}
				if (count == 4)
					return true;
			}
			if (count == 4)
				return true;
		}
		return false;
	}

	public static void putADisk(int[][] matrix, String type, int value) {
		Scanner input = new Scanner(System.in);

		System.out.print("Drop a " + type + " disk at column (0–6): ");
		int col = input.nextInt();

		for (int row = matrix.length - 1; row >= 0; row--) {
			if (matrix[row][col] == 0) {
				matrix[row][col] = value;
				return;
			} else if (matrix[0][col] != 0) {
				while (matrix[0][col] != 0) {
					System.out.print("This column is full. Try again: ");
					col = input.nextInt();
				}
				matrix[row][col] = value;
				return;
			}
		}
	}
}
