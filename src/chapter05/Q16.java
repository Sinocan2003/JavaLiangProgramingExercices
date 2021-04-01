package chapter05;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an intiger: ");
		int intiger = input.nextInt();
		
		System.out.print("The smallest factors of " + intiger + " is ");
		
		int divisor = 2;
		while (intiger >= divisor) {
			if (intiger % divisor == 0) {
				System.out.print(divisor + " ");
				intiger /= divisor;
			} else {
				divisor++;
			}
		}
	}
}
