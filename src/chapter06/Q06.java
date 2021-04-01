package chapter06;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an n value: ");
		int n = input.nextInt();
		displayPattern(n);
	}
	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int a = i; a <= i && a > 0; a--) {
			System.out.print(a + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
