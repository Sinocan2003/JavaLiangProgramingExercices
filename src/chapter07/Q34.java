package chapter07;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();
		s = sort(s);

		System.out.println(s);
	}

	public static String sort(String s) {
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			// select first element
			char min = array[i];
			int minIndex = i;
			
			// select min element in rest of array
			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					minIndex = j;
				}
			}
			
			// swap i to minIndex
			if (minIndex != i) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}

		return new String(array);
	}
}
