package chapter07;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		double[] numbers = readNumbers(10);

		double mean = mean(numbers);
		double deviation = deviation(numbers, mean);
		
		System.out.printf("%1s%1.2f", "The mean is ", mean);
		System.out.printf("\n%1s%1.5f", "The standard deviation is ", deviation);
	}

	public static double[] readNumbers(final int N) {
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[N];
		System.out.print("Enter " + N + " number: ");
		for (int i = 0; i < numbers.length; i++) {
			double number = input.nextDouble();
			numbers[i] = number;
		}
		return numbers;
	}

	public static double deviation(double[] numbers, double mean) {
		double deviation = 0;
		for (int i = 0; i < numbers.length; i++) {
			deviation += Math.pow(numbers[i] - mean, 2);
		}
		return Math.sqrt(deviation / (numbers.length - 1));
	}

	public static double mean(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum / numbers.length;
	}
}
