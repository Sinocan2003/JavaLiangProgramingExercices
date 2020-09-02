package chapter05;

import java.util.Scanner;

public class Q09 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		
		int maxScore = -1;
		String maxName = "";

		int maxScoreSecond = -1;
		String maxNameSecond = "";
		
		for (int i = 0; i < students; i++) {
			System.out.print("Enter the name of the student: ");
			String name = input.next();
			
			System.out.print("Enter the score of the students: ");
			int score = input.nextInt();
			
			if (score > maxScore) {
				maxScoreSecond = maxScore;
				maxNameSecond = maxName;
				
				maxScore = score;
				maxName = name;
			} else if (score > maxScoreSecond) {
				maxScoreSecond = score;
				maxNameSecond = name;
			}
		}
		
		System.out.println(maxName + " have the max score: " + maxScore + "\n" + 
		  maxNameSecond + " have the second max score: " + maxScoreSecond);
	}
}
