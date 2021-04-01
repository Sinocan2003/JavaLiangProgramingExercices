package chapter06;

public class Q11 {

	public static void main(String[] args) {
		final int BASE_SALARY = 5000;
		final int TARGET_SALARY = 30_000;

		System.out.println("Sales Amount       Commission");

		for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.println(" " + salesAmount + "               " + computeCommission(salesAmount));

		}
	}
	public static double computeCommission(double salesAmount) {
		double commission = 0;
		if (salesAmount < 5_000) {
			commission = salesAmount * 0.08;
		} else if (salesAmount < 10_000) {
			commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
		} else {
			commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
		}
		return commission;
	}

}
