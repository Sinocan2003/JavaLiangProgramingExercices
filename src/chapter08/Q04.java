package chapter08;

public class Q04 {

	public static void main(String[] args) {
		int[][] hourlyWork = { { 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 9, 3, 4, 7, 3, 4, 1 }, { 3, 3, 4, 3, 3, 2, 2 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 2, 4, 3, 4, 5, 8, 8 } };
		int[][] sum = sumOfHOurs(hourlyWork);
		sortTheList1(sum);
		printList(sum);
	}
	
	public static void sortTheList1(int[][] sum) {
		int max = sum[0][1];
		int maxIndex = 0;
		for (int i = 0; i < sum.length; i++) {
			max = sum[i][1];
			maxIndex = i;
			for (int j = i + 1; j < sum.length; j++) {
				if (max < sum[j][1]) {
					max = sum[j][1];
					maxIndex = j; 
				}
			}
			if (i != maxIndex) {
				int temp = sum[maxIndex][0];
				sum[maxIndex][1] = sum[i][1];
				sum[maxIndex][0] = sum[i][0];
				sum[i][1] = max;
				sum[i][0] = temp;
				
			}
		}
	}
	
	public static void printList(int[][] sum) {
		for (int i = 0; i < sum.length; i++) {
			System.out.println("The employee " + sum[i][0] + " works " + sum[i][1]);
		}
	}

	public static int[][] sumOfHOurs(int[][] hourlyWork) {
		int[][] sum = new int[hourlyWork.length][2];
		for (int row = 0; row < hourlyWork.length; row++) {
			sum[row][0] = row;
			for (int col = 0; col < hourlyWork[row].length; col++) {
				sum[row][1] += hourlyWork[row][col]; 
			}
		}
		return sum;
	} 
}
