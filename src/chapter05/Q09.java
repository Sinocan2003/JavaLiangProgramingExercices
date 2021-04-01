package chapter05;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of the students: ");
		int numberOfStudents = input.nextInt();
		input.nextLine();

		int i = 1;
		int maxGrade = 0;
		int maxGrade2 = 0;
		String maxGradeName = "";
		String maxGradeName2 = "";
		while (i <= numberOfStudents) {
			System.out.print("Enter the name of the student: ");
			String name = input.nextLine();

			System.out.print("Enter the grade of the student: ");
			int grade = input.nextInt();
			input.nextLine();
			
			if (maxGrade < grade) {
				maxGrade2 = maxGrade;
				maxGradeName2 = maxGradeName;
				
				maxGrade = grade;
				maxGradeName = name;
			} else if (maxGrade2 < grade) {
				maxGrade2 = grade;
				maxGradeName2 = name;
			}

			i++;
		}

		System.out.println("The name of the student with the highest score is " + maxGradeName
				+ " and her or his score is " + maxGrade + "\n" + " and the next student with the 2. highest score is "
				+ maxGradeName2 + " and his or her score is " + maxGrade2);

	}
}
