package chapter05;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal integer: ");
		int decimalInteger = input.nextInt();

		String binaryStr = "";
		while (decimalInteger != 0) {
			binaryStr = (decimalInteger % 2) + binaryStr;
			decimalInteger /= 2;
		}
		System.out.println(binaryStr);
		
		/*
		for (int i = binaryStr.length() - 1; i >= 0; i--) {
			System.out.print(binaryStr.charAt(i));
		}*/
	}
}
