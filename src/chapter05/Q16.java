package chapter05;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		int end = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an intiger: ");
		int integer = input.nextInt();

		int divider = 2;
		while(integer != 1) {
			if (integer % divider == 0) {
				System.out.print(divider + " ");
				integer /= divider;
			} else {
				divider++;
			}
			
		}
		/*
		
		while (integer % 2 == 0 || integer % 3 == 0 || integer % 5 == 0 || (integer % 2 != 0  && integer % 3 != 0 && integer % 5 != 0) && end < 1) {
			if (integer % 2 == 0) {
				System.out.print(2 + " ");
				 integer = integer / 2;
			} else if (integer % 3 == 0) {
				System.out.print(3 + " ");
				 integer = integer / 3;
			} else if (integer % 5 == 0) {
				System.out.print(5 + " ");
				 integer = integer / 5;
			} else if (integer % 2 != 0  && integer % 3 != 0 && integer % 5 != 0) {
				System.out.println(integer);
				integer = integer / integer;
			}
			end++;
		}
		*/
	}
}
