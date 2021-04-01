package chapter07;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of the balls: ");
		int numberOfBalls = input.nextInt();

		System.out.print("Enter the numberf of the slots: ");
		int numberOfSlot = input.nextInt();
		
		playGame(numberOfBalls, numberOfSlot);
	}

	public static void printSlots(int[] slots, int balls) {
		for (int i = 0; i < balls; i++) {
			for (int j = 0; j < slots.length; j++) {
				if (slots[j] >= balls - i) 
					System.out.print("0");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


	public static void playGame(int numberOfBalls, int numberOfSlot) {
		int[] slots = new int[numberOfSlot];

		for (int j = 0; j < numberOfBalls; j++) {
			int rightCount = 0;
			String leftOrRight = "";
			
			for (int i = 0; i < slots.length - 1; i++) {
				int direction = (int) ((Math.random() * 2));
				if (direction == 1) {
					leftOrRight += "R";
					rightCount++;
				} else {
					leftOrRight += "L";
				}
			}
			slots[rightCount]++;
			System.out.println(leftOrRight);
		}
		printSlots(slots, numberOfBalls);
	}
}
