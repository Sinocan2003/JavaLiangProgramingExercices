package chapter04;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String character =  input.nextLine();
		
		System.out.println("The Unicode for the character " + character + " is " +  character);
	}
}
