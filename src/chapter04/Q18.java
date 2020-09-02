package chapter04;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String defination = input.next().toUpperCase();
		char charracter1 = defination.charAt(0); 
		int charracter2 = defination.charAt(1);
		
		// input validation 
		
		if (charracter1 == 'M') {
			System.out.print("Mathematics ");
		} else if (charracter1 == 'C') {
			System.out.print("Computer Science ");
		} else if (charracter1 == 'I') {
			System.out.print("Information Technology ");
		} else {
			System.out.print("Invalid input ");
			System.exit(1);
		}
		
		switch (charracter2) {
		case '1' : System.out.println("Freshman");break;
		case '2' : System.out.println("sophomore");break;
		case '3' : System.out.println("Junior");break;
		case '4' : System.out.println("sophomore");break;
		default: System.out.println("Invalid input ");
		System.exit(1);
		}
	}
}
