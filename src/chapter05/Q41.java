package chapter05;

import java.util.Scanner;

public class Q41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		int number = input.nextInt();
		int max = number;
		int count = 1;
		while (number != 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max) {
				count++;
			}
		}
		System.out.println("The max number is " + max + ". and it repeats " + count + " times");
		
	}

}
