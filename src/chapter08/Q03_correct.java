package chapter08;

public class Q03_correct {

	public static void main(String[] args) {
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		int[][] indexCorrectCounts = new int[answers.length][2];
		

		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			indexCorrectCounts[i][0] = i;
			indexCorrectCounts[i][1] = correctCount;
			
		}
		selectionSort(indexCorrectCounts);
		printSortedList(indexCorrectCounts);
	}

	public static void printSortedList(int[][] indexCorrectCounts) {
		for (int i = 0; i < indexCorrectCounts.length; i++) {
			System.out.println("Student " + indexCorrectCounts[i][0] + "'s correct count is " + indexCorrectCounts[i][1]);
		}
	}

	
	/** The method for sorting the numbers */
	public static void selectionSort(int[][] indexCorrectCounts) {
		for (int i = 0; i < indexCorrectCounts.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int[] currentMin = indexCorrectCounts[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < indexCorrectCounts.length; j++) {
				if (currentMin[1] > indexCorrectCounts[j][1]) {
					currentMin = indexCorrectCounts[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				indexCorrectCounts[currentMinIndex] = indexCorrectCounts[i];
				indexCorrectCounts[i] = currentMin;
			}
		}
	}
}
