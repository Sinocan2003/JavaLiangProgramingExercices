package chapter07;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Integer average is " + average(array));
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
}
