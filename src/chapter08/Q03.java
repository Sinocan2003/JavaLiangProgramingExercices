package chapter08;

public class Q03 {

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
		int[][] correctCounts = new int[answers.length][2];
		int[] collectRow = new int[correctCounts.length];
		

		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;
			collectRow[i] = -1;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			correctCounts[i][0] = correctCount;
		}
		int[] sortedList = sortStudents(correctCounts, collectRow);
		printSortedList(sortedList, collectRow);
	}

	public static void printSortedList(int[] sortedList, int[] collectRow) {
		for (int i = 0; i < sortedList.length; i++) {
			System.out.println("Student " + collectRow[i] + "'s correct count is " + sortedList[i]);
		}
	}

	public static int[] sortStudents(int[][] correctCounts, int[] collectRow) {
		int[] sortedList = new int[correctCounts.length];
		int i = 0;
		int max = 0;
		for (int j = 0; j < sortedList.length; j++) {
			for (int col = 0; col < correctCounts[0].length; col++) {
				max = 0;
				for (int row = 0; row < correctCounts.length; row++) {
					if (max < correctCounts[row][col] && checkTheList(collectRow, row)) {
						collectRow[i] = row;
						max = correctCounts[row][col];
					}
				}
			}
			sortedList[i] = max;
			i++;
		}
		return sortedList;
	}

	public static boolean checkTheList(int[] collectRow, int row) {
		for (int i = 0; i < collectRow.length; i++) {
			if (collectRow[i] == row) {
				return false;
			}
		}
		return true;
	}
}
