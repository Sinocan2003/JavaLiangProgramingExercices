package chapter05;

public class Q27 {
	
	public static void main2(String[] args) {
		final int NUMBER_OF_YEARS_PER_LINE = 8;
		
		int numberOfLeapYears = 0;
		for (int year = 101; year <= 2100; year++) {
			boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (leapYear == true) {
				numberOfLeapYears++;
				
				System.out.printf("%5d", year);
				
				if (numberOfLeapYears % NUMBER_OF_YEARS_PER_LINE == 0) {
					System.out.println();
				}
			} 
		}
		System.out.println("\nThe number of years is " + numberOfLeapYears);
	}
}
