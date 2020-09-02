package chapter04;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		if (city3.compareToIgnoreCase(city1) < 0 && city1.compareToIgnoreCase(city2) < 0) {
			System.out.println("The three cities in alphabetical order are " + city3 + " " + city1 + " " + city2);
		} else if (city2.compareToIgnoreCase(city1) < 0 && city3.compareToIgnoreCase(city2) < 0) {
			System.out.println("The three cities in alphabetical order are " + city3 + " " + city2 + " " + city1);
		} else if (city3.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0) {
			System.out.println("The three cities in alphabetical order are " + city2 + " " + city3 + " " + city1);
		} else if (city1.compareToIgnoreCase(city3) < 0 && city2.compareToIgnoreCase(city1) < 0) {
			System.out.println("The three cities in alphabetical order are " +  city2 + " " + city1 + " " + city3);
		} else if (city2.compareToIgnoreCase(city3) < 0 && city1.compareToIgnoreCase(city2) < 0) {
			System.out.println("The three cities in alphabetical order are " +  city1 + " " + city2 + " " + city3);
		} else {
			System.out.println("The three cities in alphabetical order are " +  city1 + " " + city3 + " " + city2);
		}
	}
}


/*
123
132
213
231
312
321
*/