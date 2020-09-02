package chapter02;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		long hour = minutes / 60;
		
		long currenthour = hour % 24;
		
		long day = hour / 24;
		
		long currentday = day % 365;
		
		long year = day / 365;
		
		System.out.println(minutes + " minutes is approximately " + year + " years, " + currentday + " and " + currenthour + " hour");
	}
}
