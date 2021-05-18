package chapter08;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] points = new double[5][2];
		System.out.print("Enter five points: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		if (sameLine(points)) {
			System.out.println("The five points are on the same line");
		} else {
			System.out.println("The five points are not on the same line");
		}

	}

	public static boolean sameLine(double[][] points) {
		int p1, p2, p3;
		p1 = 0;
		p2 = 1;
		p3 = 2;
		if (isOnSameLine(points, p1, p2, p3)) {
			p3 = 3;
			if (isOnSameLine(points, p1, p2, p3)) {
				p3 = 4;
				if (isOnSameLine(points, p1, p2, p3)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean isOnSameLine(double[][] points, int p1, int p2, int p3) {
		if (((points[p2][0] - points[p1][0]) * (points[p3][1] - points[p1][1]) - (points[p3][0] - points[p1][0]) * (points[p2][1] - points[p1][1])) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
