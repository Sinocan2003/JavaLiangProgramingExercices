package chapter05;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of the students: ");
		int numberOfStudents = input.nextInt();
		input.nextLine();

		int i = 1;
		int maxGrade = 0;
		String maxGradeName = "";
		while (i <= numberOfStudents) {
			System.out.print("Enter the name of the student: ");
			String name = input.nextLine();
			
			System.out.print("Enter the grade of the student: ");
			int grade = input.nextInt();
			input.nextLine();
			
			if (maxGrade < grade) {
				maxGrade = grade;
				maxGradeName = name;
			}

			i++;
		}

		System.out.println("The name of the student with the highest score is " + maxGradeName
				+ " and her or his score is " + maxGrade);

	}
}
