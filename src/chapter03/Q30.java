package chapter03;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GTM: ");
		int timeZoneOffset = input.nextInt();

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = (totalHours + timeZoneOffset) % 24;
		
		if (currentHour >= 12)
			System.out.println("The current time is " + (currentHour - 12)  + ":" + currentMinute + ":" + currentSecond + " PM");
		else 
			System.out.println("The current time is " + currentHour  + ":" + currentMinute + ":" + currentSecond + " AM");	
	}
}
