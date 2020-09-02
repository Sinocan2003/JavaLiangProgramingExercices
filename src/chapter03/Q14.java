package chapter03;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int random = (int) (Math.random() * 2);
		
		System.out.print("Enter your guess 1 or 0: ");
		int guess = input.nextInt();
		
		if (guess == random) {
			System.out.println("Your guess is correct");
		} else {
			System.out.println("Your guess is not correct");
		}
	}
}
