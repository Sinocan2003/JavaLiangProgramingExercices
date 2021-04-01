package chapter07;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] coefficients = new double[3];
		System.out.print("Enter the coefficients of a quadratic equation: ");
		for (int i = 0; i < coefficients.length; i++) {
			double coefficient = input.nextDouble();
			coefficients[i] = coefficient;
		}
		
		double[] roots = new double[3];
		int numOfRoots = solveQuadratic(coefficients, roots);
		
		print(roots, numOfRoots);
	}
	
	public static int solveQuadratic(double[] coefficients, double[] roots) {
		int numOfRoots;
		
		double delta = Math.pow(coefficients[1], 2) - 4 * (coefficients[0] * coefficients[2]);
		if (delta > 0) {
			numOfRoots = 2;
			roots[0] = (-coefficients[1] + Math.sqrt(delta)) / 2 * coefficients[0];
			roots[1] = (-coefficients[1] - Math.sqrt(delta)) / 2 * coefficients[0];
		} else if (delta == 0) {
			numOfRoots = 1;
			roots[0] = (-coefficients[1] + Math.sqrt(delta)) / 2 * coefficients[0];
		} else {
			numOfRoots = 0;
		}
		
		return numOfRoots;
	}

	public static void print(double[] roots,int numOfRoots) {
		if (numOfRoots == 0) {
			System.out.println("There is no reel roots");
		} else if (numOfRoots == 1) {
			System.out.println("There is 1 reel root and it is " + roots[0]);
		} else {
			System.out.println("There is 2 reel roots and they are " + roots[0] + " and " + roots[1]);
		}
	}

}
