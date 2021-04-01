package chapter05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 1;
		int positiveNumbers = 0;
		int negativeNumbers = 0;
		double sum = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		while (number != 0) {
			number = input.nextInt();
			sum += number;
			if (number > 0)
				positiveNumbers++;
			else if (number < 0)
				negativeNumbers++;
		}
		
		System.out.println("The number of positives is " + positiveNumbers + "\n" + 
		"The number of negatives is " + negativeNumbers + "\n" + "The total is " + sum + "\n" +
				"The average is " + (sum / (positiveNumbers + negativeNumbers)));
	}
}
