package chapter07;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] animalNames = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", 
	    		"snake", "horse", "sheep"};
	    
	    System.out.print("Enter a year: ");
	    int year = input.nextInt();
	    printYear(year, animalNames);
	    
	}

	public static void printYear(int year, String[] animalNames) {
		System.out.println(animalNames[year]);
	}
}
