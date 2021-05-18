package chapter08;

public class Q16 {

	public static void main(String[] args) {
		int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		sort(array);
		printArray(array);
	}

	public static void printArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			System.out.println();
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + ", ");
			}
		}
	}

	public static void sort(int[][] array) {
		int minRow = 0;
		
		for (int i = 0; i < array.length; i++) {
			int[] min = {Integer.MAX_VALUE, Integer.MAX_VALUE};
			for (int row = i; row < array.length; row++) {
				if ((min[0] > array[row][0]) || (min[0] == array[row][0] && min[1] > array[row][1])) {
					min = array[row];
					minRow = row;
				} 
			}
			if (i != minRow) {
				array[minRow] = array[i];
				array[i] = min;
			}
		}
	}
}
