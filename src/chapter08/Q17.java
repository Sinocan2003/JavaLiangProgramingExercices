package chapter08;

public class Q17 {

	public static void main(String[] args) {
		double[][] matrix = { { 25, 100.5, 0, 0, 320.5 }, { 0, 125, 40, 85, 0 }, { 125, 0, 175, 75, 0 },
				{ 125, 0, 0, 75, 0 }, { 0, 0, 125, 0, 181 } };
		int[] unsafeBanks = isTheBanksUnsafe(matrix);
		printUnsafeBanks(unsafeBanks);
	}

	public static void printUnsafeBanks(int[] unsafeBanks) {
		System.out.print("Unsafe banks are ");
		for (int i = 0; i < unsafeBanks.length; i++) {
			if (unsafeBanks[i] != 0) {
				System.out.print(i + ", ");
			}
		}
	}

	public static int[] isTheBanksUnsafe(double[][] matrix) {
		int[] unsafeBanks = new int[5];
		for (int i = 0; i < matrix[0].length; i++) {
			for (int row = 0; row < matrix.length; row++) {
				int sum = 0;
				for (int col = 0; col < matrix[row].length; col++) {
					sum += matrix[row][col];
				}
				if (sum <= 201) {
					unsafeBanks[row]++;
					makeZeroTheColumnOfUnsafeBank(matrix, row);
				}
			}
		}
		return unsafeBanks;
	}

	public static void makeZeroTheColumnOfUnsafeBank(double[][] matrix, int i) {
		for (int row = 0; row < matrix.length; row++) {
			matrix[row][i] = 0;
		}
	}
}
