package chapter08;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, { 16700, 67900, 137050, 20885, 372950 },
				{ 8350, 33950, 68525, 104425, 186475 }, { 11950, 45500, 117450, 190200, 372950 } };
		double[] rate = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };

		System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), "
				+ "\n2-married separately, 3-head of household)\n" + "Enter the filing status: ");
		int status = input.nextInt();

		System.out.print("Enter a income: ");
		double income = input.nextInt();
		double tax = countTheTax(income, status, brackets, rate);
		System.out.println("The tax is " + tax);

	}

	public static double countTheTax(double income, int status, int[][] brackets, double[] rate) {
		double tax = 0;
		if (brackets[status][0] >= income) {
			tax = brackets[status][0] * rate[0];
		} else if (income <= brackets[status][1]) {
			tax = brackets[status][0] * rate[0] + (brackets[status][1] - brackets[status][0]) * rate[1];
		} else if (income <= brackets[status][2]) {
			tax = brackets[status][0] * rate[0] + (brackets[status][1] - brackets[status][0]) * rate[1]
					+ (brackets[status][2] - brackets[status][1]) * rate[2];
		} else if (income <= brackets[status][3]) {
			tax = brackets[status][0] * rate[0] + (brackets[status][0] - brackets[status][0]) * rate[1] + (brackets[status][2] - brackets[status][1]) * rate[2]
					+ (brackets[status][3] - brackets[status][2]) * rate[3];
		} else if (income <= brackets[status][4]) {
			tax = brackets[status][0] * rate[0] + (brackets[status][1] - brackets[status][0]) * rate[1] + (brackets[status][2] - brackets[status][1]) * rate[2]
					+ (brackets[status][3] - brackets[status][2]) * rate[3] + (brackets[status][4] - brackets[status][3]) * rate[4];
		} else {
			tax = brackets[status][0] * rate[0] + (brackets[status][1] - brackets[status][0]) * rate[1] + (brackets[status][2] - brackets[status][1]) * rate[2]
					+ (brackets[status][3] - brackets[status][2]) * rate[3] + (brackets[status][4] - brackets[status][3]) * rate[4]
					+ (income - brackets[status][4]) * rate[5];
		}
		return tax;
	}
}
