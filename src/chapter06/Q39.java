package chapter06;

import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (isLeftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("p2 is on the left side of the line");
		} else if (isOnTheSameLine(x0, y0, x1, y1, x2, y2)) {
			if (x0 <= x2 && x2 <= x1 && y0 <= y2 && y2 <= y1) {
				System.out.println("p2 is on the same segment");
			} else {
				System.out.println("p2 is on the same line");
			}
		} else {
			System.out.println("p2 is on the right side of the line");
		}
	}

	public static boolean isOnTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		if (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isLeftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		if (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0) {
			return true;
		} else {
			return false;
		}

	}
}
