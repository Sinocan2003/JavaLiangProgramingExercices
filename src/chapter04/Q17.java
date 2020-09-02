package chapter04;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();
		// For clean enter char
		input.nextLine();

		System.out.print("Enter a month: ");
		String month = input.nextLine();

		System.out.print(month + " " + year);

		boolean isLeapYear = year % 4 == 0 && year % 4 != 400 && year % 4 == 100;
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println(" has 31 days");
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println(" has 30 days");
			break;
		case "Feb":
			System.out.println(isLeapYear ? " has 29 days" : " has 28 days");
			break;
		}
	}
}
