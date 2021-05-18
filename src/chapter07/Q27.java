package chapter07;

import java.awt.List;
import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list1 = Q26.readArray("Enter list1: ");
		int[] list2 = Q26.readArray("Enter list2: ");
		
		if (isSameLength(list1, list2) == false) {
			System.out.println("Two lists are not strictly identical");
		} else if (equals(list1, list2)) {
			System.out.println("Two lists are strictly identical");
		} else {
			System.out.println("Two lists are not strictly identical");
		}
		
	}

	public static boolean equals(int[] list1, int[] list2) {
		int countList1 = 0;
		int countList2 = 0;
		for (int i = 0; i < list1.length; i++) {
			countList1 = countInArray(list1, i);
			for (int j = 0; j < list1.length; j++) {
				if (list1[i] == list2[j]) {
					countList2++;
				}
			}
			if (countList1 != countList2) {
				return false;
			}
			countList2 = 0;
		}
		return true;
	}

	public static boolean isSameLength(int[] list1, int[] list2) {
		if (list1.length == list2.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int countInArray(int[] list, int i) {
		int count = 0;
		for (int j = 0; j < list.length; j++) {
			if (list[i] == list[j]) {
				count++;
			}
		}
		return count;
	}
}
