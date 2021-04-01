package chapter06;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a millisecond: ");
		long millis = input.nextLong();
		
		System.out.println(convertMillis(millis));
	}

	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;

	    long currentSecond = totalSeconds % 60;

	    long totalMinutes = totalSeconds / 60;

	    long currentMinute = totalMinutes % 60;

	    long totalHours = totalMinutes / 60;

		return totalHours + ":" + currentMinute + ":" + currentSecond;
	}
}
