package chapter05;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		System.out.print("Enter the first day: ");
		int firstDay = input.nextInt();
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		int day = firstDay;
		int totalDay = 0;
		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1: System.out.print("January 1, " + year);break;
			case 2: System.out.print("February 1, " + year);break; 
			case 3: System.out.print("March 1, " + year);break;
			case 4: System.out.print("April 1, " + year);break;
			case 5: System.out.print("May 1, " + year);break;
			case 6: System.out.print("June 1, " + year);break;
			case 7: System.out.print("July 1, " + year);break;
			case 8: System.out.print("August 1, " + year);break;
			case 9: System.out.print("September 1, " + year);break;
			case 10: System.out.print("Oktober 1, " + year);break;
			case 11: System.out.print("November 1, " + year);break;
			case 12: System.out.print("December 1, " + year);break;
			}
			
			day = (firstDay + totalDay) % 7;
			
			switch (day) {
			 case 0: System.out.println(" is Sunday");break;
			 case 1: System.out.println(" is Monday");break;
			 case 2: System.out.println(" is Tuesday");break;
			 case 3: System.out.println(" is Wednesday");break;
			 case 4: System.out.println(" is Thursday");break;
			 case 5: System.out.println(" is Friday");break;
			 case 6: System.out.println(" is Saturday");break;
			}
			
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				totalDay += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				totalDay += 31;
			} else {
				totalDay += leapYear ? 29 : 28;
			}
		}
	}
}
