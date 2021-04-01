package chapter07;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list1 = Q26.readArray("Enter list1: ");
		int[] list2 = Q26.readArray("Enter list2: ");
		

		if (equals(list1, list2)) {
			System.out.println("Two lists are strictly identical");
		} else {
			System.out.println("Two lists are not strictly identical");
		}
	}

	public static boolean equals(int[] list1, int[] list2) {
		birinci arrayde buldugumuz her sayiyi iki arrayde de sayip kontrol edecegiz
		
		return true;
	}
	
	public static int countInArray(int[] list, int i) {
		return 0;
	}
}
