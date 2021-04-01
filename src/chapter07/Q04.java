package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] grades = new int[100];
		//  Arrays.fill(grades, -1);
		
		System.out.print("Enter the grades: ");
		int grade = input.nextInt();
		int numberOfElement = 0;
		while (grade >= 0) {
			
			grades[numberOfElement] = grade;
			numberOfElement++;
			grade = input.nextInt();
		}
		double average = average(grades, numberOfElement);
		successRate(average, grades, numberOfElement);
	}

	public static void successRate(double average, int[] grades, int numberOfElement) {
		int higher = 0;
		int equal = 0;
		int lesser = 0;
		for (int a = 0; a < numberOfElement; a++) {
			if (grades[a] < average) {
				lesser++;
			} else if (grades[a] == average) {
				equal++;
			} else {
				higher++;
			}
		}
		print(higher, equal, lesser);
	}

	public static void print(int higher, int equal, int lesser) {
		System.out.println(higher + " grades are high than average " + equal + " grades are equal to " + "average and "
				+ lesser + " grades are less than average");
	}

	public static int average(int[] grades, int numberOfElement) {
		int sum = 0;
		for (int a = 0; a < numberOfElement; a++) {
			sum += grades[a];
		}
		return sum / numberOfElement;
	}
}
