package chapter05;

import java.util.Scanner;

public class Q51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String string1 = input.nextLine();

		System.out.print("Enter the second string: ");
		String string2 = input.nextLine();

		int lenght1 = string1.length();
		int lenght2 = string2.length();
		
		int min = Math.min(lenght1, lenght2);

		String common = "";
		for (int i = 0; i < min; i++) {
			char a = string1.charAt(i);
			char b = string2.charAt(i);
			if (a == b) {
				common += a;
			}
		}

		if (common.length() == 0) {
			System.out.println(string1 + " and " + string2 + " have no common prefix");
		} else {
			System.out.println("The common prefix is " + common);
		}
	}
}
