package chapter05;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		int min = Math.min(n1, n2);
		int gcd = 1;
		int k = min;
		while (k > 0) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
				break;
			}
			k--;
		}

		System.out.println("The greatest common divisor for " + n1 + 
				" and " + n2 + " is " + gcd);

	}
}
