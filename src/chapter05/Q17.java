package chapter05;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();

		int i = 1;
		while (i <= numberOfLines) {
			int j = numberOfLines;
			while (j >= i) {
				System.out.print("  ");
				j--;
			}
			int a = i;
			while (a <= i && a > 0) {
				System.out.print(" " + a);
				a--;
			}
			
			int c = i;
			while (c <= i && c > 0) {
				System.out.print(" " + c);
				c--;
			}
			
			System.out.println();
			i++;

		}

	}
}
