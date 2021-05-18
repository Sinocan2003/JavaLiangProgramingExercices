package chapter08;

public class Q10 {

	public static void main(String[] args) {
		int matrix[][] = new int[4][4];
		creatRandomArray(matrix);
		int rowsumIndex = findsumRowIndex(matrix);
		int rowColIndex = findsumColIndex(matrix);
		printMatrix(matrix);
		System.out.println("\nThe largest row index: " + rowsumIndex);
		System.out.println("The largest column index: " + rowColIndex);

	}

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			System.out.println();
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col]);
			}
		}
	}

	public static int findsumRowIndex(int[][] matrix) {
		int maxRow = 0;
		int max = 0;
		for (int row = 0; row < matrix.length; row++) {
			int sum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
					sum += matrix[row][col];
			}
			if (max < sum) {
				max = sum;
				maxRow = row;
			}
		}
		return maxRow;
	}
	
	public static int findsumColIndex(int[][] matrix) {
		int maxCol = 0;
		int max = 0;
		for (int col = 0; col < matrix[0].length; col++) {
			int sum = 0;
			for (int row = 0; row < matrix.length; row++) {
					sum += matrix[row][col];
			}
			if (max < sum) {
				max = sum;
				maxCol = col;
			}
		}
		return maxCol;
	}

	public static void creatRandomArray(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				int random = (int) (Math.random() * 2);
				matrix[row][col] = random;
			}
		}
	}
}
