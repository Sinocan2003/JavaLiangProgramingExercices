package chapter08;

public class Q18 {

	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		shuffelArray(m);
		printArray(m);
	}

	public static void printArray(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			System.out.println();
			for (int col = 0; col < m[0].length; col++) {
				System.out.print(m[row][col] + " ");
			}
		}
	}

	public static void shuffelArray(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			int randomRow = (int)(Math.random() * m.length);
			int randomRow2 = (int)(Math.random() * m.length);
			for (int col = 0; col < m[0].length; col++) {
				if (randomRow != randomRow2) {
					int temp = m[randomRow][col];
					m[randomRow][col] = m[randomRow2][col];
					m[randomRow2][col] = temp;
				}
			}
		}
	}
}

	