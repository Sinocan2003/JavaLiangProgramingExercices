package chapter07;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[101];
		System.out.print("Enter numbers between 1 and 100: ");
		int number = input.nextInt();
		int i = -1;
		while (number != 0) {
			i++;
			if (1 <= number && number <= 100)
				numbers[number]++;
			
			number = input.nextInt();
		}
		
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] != 0) {
				if (numbers[j] > 1) {
					System.out.println(j + " occurs " + numbers[j] + " times");
				} else {
					System.out.println(j + " occurs " + numbers[j] + " time");
				}
			}
		}
/*
		int j = 0;
		for (int b = 0; b < i + 1; b++, j++) {
			int count = count(numbers, j);
			if (count == 0) {
				return;
			}
			num++;
			print(numbers, num, count);
		}
		*/
	}
	/*
	public static int count(int[] numbers, int j) {
		while (numbers[j] != 0) {
			int i = 0;
			int count = 0;
			while (numbers[i] != 0) {
				if (numbers[j] == numbers[i]) {
					count++;
				}
				i++;
			}
			j++;
			return count;
		}
		return 0;
	}

	public static void print(int[] numbers, int num, int count) {
		if (count > 1) {
			System.out.println(numbers[num] + " occurs " + count + " times");
		} else {
			System.out.println(numbers[num] + " occurs " + count + " time");
		}abnhaen
	}
	*/
}
