package chapter07;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a list: ");
		int number = input.nextInt();
		int[] list = new int[number];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		if (isSorted(list)) {
			System.out.println("The list is already sorted");
		} else {
			System.out.println("The list is not sorted");
		}
		
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i + 1 < list.length; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
