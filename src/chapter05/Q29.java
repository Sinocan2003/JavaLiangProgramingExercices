package chapter05;

import java.util.Scanner;

public class Q29 {

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
			case 1: System.out.println("\t\tJanuary " + year);break;
			case 2: System.out.println("\t\tFebruary " + year);break; 
			case 3: System.out.println("\t\tMarch " + year);break;
			case 4: System.out.println("\t\tApril " + year);break;
			case 5: System.out.println("\t\tMay " + year);break;
			case 6: System.out.println("\t\tJune " + year);break;
			case 7: System.out.println("\t\tJuly " + year);break;
			case 8: System.out.println("\t\tAugust " + year);break;
			case 9: System.out.println("\t\tSeptember " + year);break;
			case 10: System.out.println("\t\tOktober " + year);break;
			case 11: System.out.println("\t\tNovember " + year);break;
			case 12: System.out.println("\t\tDecember " + year);break;
			}
			
			day = (firstDay + totalDay) % 7;
			
			int numberOfDayInMount;
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				numberOfDayInMount = 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				numberOfDayInMount = 31;
			} else {
				numberOfDayInMount = leapYear ? 29 : 28;
			}
			
			System.out.println("   ---------------------------------------");
			System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			
			for (int j = 1; j <= day; j++) {
				System.out.printf("%6s", " ");
			}
			
			for (int a = 1; a <= numberOfDayInMount; a++) {
				System.out.printf("%6d", a);
				if ((a + day) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			
			totalDay += numberOfDayInMount;
		}
	}
}
