package chapter07;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int number = input.nextInt();

		String[] namesOfStudent = new String[number];
		int[] gradesOfStudent = new int[number];
		
		System.out.print("Enter the name and grade of students: ");
		namesAndGradesOfStudent(namesOfStudent, gradesOfStudent);
	
		sortingGrades(gradesOfStudent, namesOfStudent);
		print(gradesOfStudent, namesOfStudent);

	}

	public static void print(int[] gradesOfStudent, String[] namesOfStudent) {
		for (int i = 0; i < gradesOfStudent.length; i++) {
			System.out.println(namesOfStudent[i] + " has " + gradesOfStudent[i]);
		}
	}
	public static void sortingGrades(int[] gradesOfStudent, String[] namesOfStudent) {
		for (int i = 0; i < gradesOfStudent.length; i++) {
			String name = namesOfStudent[i];
			int temp = 0;
			String tempName = "";
			for (int j = i + 1; j < gradesOfStudent.length; j++) {
				if (gradesOfStudent[i] < gradesOfStudent[j]) {
					temp = gradesOfStudent[i];
					gradesOfStudent[i] = gradesOfStudent[j];
					gradesOfStudent[j] = temp;
					
					tempName = namesOfStudent[i];
					namesOfStudent[i] = namesOfStudent[j];
					namesOfStudent[j] = tempName;
				}
			}
		}
	}

	public static void namesAndGradesOfStudent(String[] namesOfStudent, int[] gradesOfStudent) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < namesOfStudent.length; i++) {
			System.out.println("For student " + (i + 1));
			namesOfStudent[i] = input.next();
			gradesOfStudent[i] = input.nextInt();
		}
	}
}
