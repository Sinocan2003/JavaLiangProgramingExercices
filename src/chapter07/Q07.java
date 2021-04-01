package chapter07;

public class Q07 {

	public static void main(String[] args) {
		int[] numbers = generateRandomNumbers(100);
		
		int[] counts = countNumbers(numbers);
		
		printCounts(counts);
	}

	public static void printCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 1) {
				System.out.println(i + " has " + counts[i] + " times");
			} else if (counts[i] == 1) {
				System.out.println(i + " has " + counts[i] + " time");
			}
		}
	}

	public static int[] countNumbers(int[] numbers) {
		int[] counts = new int[10];
		 
		for (int i = 0; i < numbers.length; i++) {
			counts[numbers[i]]++;
		}
		 return counts;
	}

	public static int[] generateRandomNumbers(final int N) {
		int[] numbers = new int[N];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}
		return numbers;
	}
}
