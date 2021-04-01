package chapter07;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		int[] list1 = readArray("Enter list1: ");
		int[] list2 = readArray("Enter list2: ");

		if (equals(list1, list2)) {
			System.out.println("Two lists are strictly identical");
		} else {
			System.out.println("Two lists are not strictly identical");
		}
	}

	public static int[] readArray(String message) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(message);
		int size = input.nextInt();
		int[] list1 = new int[size];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		return list1;
	}

	public static boolean equals(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i]) {
				return false;
			}
		}
		return true;
	}
}
