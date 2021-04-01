package chapter05;

public class Q43 {

	public static void main(String[] args) {
		int numberOfCombinations = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				numberOfCombinations++;
			}
		}
		System.out.println("Number of combination is " + numberOfCombinations);
	}
}
