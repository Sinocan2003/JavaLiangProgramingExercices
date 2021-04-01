package chapter06;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year between 2000 and 2020: ");
		int year = input.nextInt();
		
		if (year < 2000 || year > 2020) {
			System.out.println("Invalid year");
			return;
		} 
		
		System.out.println("The year " + year + " has " + numberOfDaysInAYear(year) + " days");
	}
	
	public static int numberOfDaysInAYear(int year) {
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		return leapYear ? 366 : 365;
	}
}
