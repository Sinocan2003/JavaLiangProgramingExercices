package chapter08;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the row and column of array: ");
		int row = input.nextInt();
		int col = input.nextInt();
		int[][] array = new int[row][col];
		if (isConsecutiveFour(array)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	public static boolean isConsecutiveFour(int[][] array) {
		checkRows(array);
		checkColumns(array);
		checkTheMajorDiagonal(array);
		checkTheSubDiagonal(array);
		return false;
	}

	public static boolean checkTheSubDiagonal(int[][] array) {
		int count = 0;
		int sameNumber = array[0][array[0].length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			if (count >= 4) {
				return true;
			}
			if (sameNumber == array[j][i]) {
				count++;
			} else {
				count = 0;
			}
		}
		return false;
	}

	public static boolean checkTheMajorDiagonal(int[][] array) {
		
		for (int r = 0, c = 0; r < array.length; r++) {
			
			for (int i = 0; isValidIndex(array, r + i, c + i); i++) {
				
			}
		}dktdur
		

		for (int r = 0, c = 1; r < array.length; c++) {
			
			for (int i = 0; isValidIndex(array, r + i, c + i); i++) {
				
			}
		}
		return true; 
	}
	
	public static boolean isValidIndex(int[][] array, int r, int c) {
		return r < array.length && c < array[0].length && r >= 0 && c >= 0;
	}

	public static boolean checkRows(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			int count = 1;
			int sameNumber = array[row][0];
			for (int col = 1; col < array[0].length; col++) {
				
				if (count >= 4) {
					return true;
				}
				if (sameNumber == array[row][col]) {
					count++;
				} else {
					sameNumber = array[row][col];
					count = 1;
				}
				if (count >= 4) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkColumns(int[][] array) {
		for (int col = 0; col < array[0].length; col++) {
			int count = 1;
			int sameNumber = array[0][col];
			
			for (int row = 1; row < array.length; row++) {
				
				if (sameNumber == array[row][col]) {
					count++;
				} else {
					sameNumber = array[row][col];
					count = 1;
				}
				if (count >= 4) {
					return true;
				}
			}
		}
		return false;
	}
}
