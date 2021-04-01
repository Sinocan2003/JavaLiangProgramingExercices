package chapter07;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int number = input.nextInt();

		int[] scores = new int[number];

		System.out.print("Enter " + number + " scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		print(scores);
		
	}

	public static void print(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			String grade = grade(scores[i]);
			System.out.println("Student " + i + " score is " + grade);
		}
	}

	public static String grade(int score) {
		if (100 - 10 <= score) {
			return "A";
		} else if (100 - 20 <= score) {
			return "B";
		} else if (100 - 30 <= score) {
			return "C";
		} else if (100 - 40 <= score) {
			return "D";
		} else {
			return "F";
		}
	}
}
