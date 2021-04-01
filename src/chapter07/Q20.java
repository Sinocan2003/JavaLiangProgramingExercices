package chapter07;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[10];
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		sorting(list);
		print(list);
	}

	public static void print(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void sorting(int[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			int max = list[i];
			int maxIndex = i;
			
			for (int j = i - 1; j >= 0; j--) {
				if (max < list[j]) {
					max = list[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				list[maxIndex] = list[i];
				list[i] = max;
			}
		}
	}
}
