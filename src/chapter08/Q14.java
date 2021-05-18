package chapter08;

public class Q14 {

	public static void main(String[] args) {
		int[][] array = new int[4][4];
		fillTheArray(array);
		printArray(array);
		checkTheRows(array);
		checkTheColumns(array);
		checkTheMajorDiagonal(array);
		checkTheSubDiagonal(array);
	}

	public static void checkTheSubDiagonal(int[][] array) {
		int count = 0;
		int sameNumber = array[0][3];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			if (sameNumber == array[j][i]) {
				count++;
			} else {
				break;
			}
		}
		
		if (count >= array[0].length) {
			System.out.println("Sub-diagonal has " + sameNumber + "s");
		} else {
			System.out.println("No same numbers on the Sub-diagonal");
		}
	}

	public static void checkTheMajorDiagonal(int[][] array) {
		int count = 0;
		int sameNumber = array[0][0];
		for (int i = 0; i < array.length; i++) {
			if (sameNumber == array[i][i]) {
				count++;
			} else {
				break;
			}
		}
		
		if (count == array[0].length) {
			System.out.println("Major diagonal has " + sameNumber + "s");
		} else {
			System.out.println("No same numbers on the major diagonal");
		}
	}

	public static void checkTheColumns(int[][] array) {
		boolean anySamenumbers = false;
		for (int col = 0; col < array[0].length; col++) {
			int count = 0;
			int sameNumber = array[0][col];
			for (int row = 0; row < array.length; row++) {
				if (sameNumber == array[row][col]) {
					count++;
				} else {
					break;
				}
			}
			if (count == array[0].length) {
				anySamenumbers = true;
				System.out.println("All " + sameNumber + "s on column " + col);
			}
		}
		if (anySamenumbers == false) {
			System.out.println("No same numbers on a column");
		}
	}

	public static void printArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col]);
			}
			System.out.println();
		}
	}

	public static void checkTheRows(int[][] array) {
		boolean anySamenumbers = false;
		for (int row = 0; row < array.length; row++) {
			int sameNumber = array[row][0];
			int count = 1;
			for (int col = 1; col < array[row].length; col++) {
				if (sameNumber == array[row][col]) {
					count++;
				} else {
					break;
				}
			}
			if (count == array[row].length) {
				anySamenumbers = true;
				System.out.println("All " + sameNumber + "s on row " + row);
			}
		}
		if (anySamenumbers == false) {
			System.out.println("No same numbers on a row");
		}
	}

	public static void fillTheArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				int random = (int) (Math.random() * 2);
				array[row][col] = random;
			}
		}
	}
}
