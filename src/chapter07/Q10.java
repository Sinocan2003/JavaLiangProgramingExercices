package chapter07;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[]array = new double[10];
		System.out.print("Enter ten number: ");
		for (int i = 0; i < array.length; i++) {
			int number = input.nextInt();
			array[i] = number;
		}
		
		System.out.println("The index of smallest numbers is " +  indexOfSmallestElement(array));
		System.out.println("The index of smallest numbers is " +  indexOfSmallestElementBetter(array));
	}
	
	public static int indexOfSmallestElement(double[] array) {
		double min = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}

	public static int indexOfSmallestElementBetter(double[] array) {
		int index = -1;
		
		int i = 0;
		int j = array.length - 1;
		while (i < array.length && j > i) {
			if (array[i] <= array[j]) {
				index = i;
				j--;
			} else {
				index = j;
				i++;
			}
		}
		
		return index;
	}
}
