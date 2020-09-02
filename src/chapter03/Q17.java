package chapter03;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		final int SCISSOR = 0;
		final int ROCK = 1; 
		final int PAPER = 2;
		
		
		int guessOfComputer = (int) (Math.random() * 2);
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor(0), rock(1), paper(2): ");
		int guess = input.nextInt();
		
		System.out.print("The computer is ");
		switch (guessOfComputer) {
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		}

		System.out.print(" You are ");
		switch (guess) {
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		}
		
		if (guessOfComputer == guess) {
			System.out.println(" It is a draw.");
		} else if (
				guessOfComputer == PAPER && guess == SCISSOR || 
				guessOfComputer == SCISSOR && guess == ROCK || 
				guessOfComputer == ROCK && guess == PAPER) {
			System.out.println(" You won.");
		} else {
			System.out.println(" You lost.");
		}
	}
}
