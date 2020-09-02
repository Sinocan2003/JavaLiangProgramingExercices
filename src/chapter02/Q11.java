package chapter02;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		final double SECOND_IN_YEAR = 365 * 24 * 60 * 60;
		int population = 312032486;
		double birthInYear = SECOND_IN_YEAR / 7;
		double deathInYear = SECOND_IN_YEAR / 13;
		double immigrantInYear = SECOND_IN_YEAR / 45;
		double populationChangeInYear = birthInYear - deathInYear + immigrantInYear;
		
		System.out.println(year + ". year population is " + (int) (population + (year * populationChangeInYear)));
	}
}
// 339833446
// 339833453