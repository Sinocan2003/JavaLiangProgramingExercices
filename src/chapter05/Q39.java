package chapter05;

public class Q39 {

	public static void main(String[] args) {
		final int BASE_SALARY = 5000;
		
		final int TARGET_SALARY = 30_000;
		
		double commission = 0;
		int totalSales = 0;
		
		while (TARGET_SALARY - BASE_SALARY > commission) {
			totalSales++;
			if (totalSales < 5_000) {
				commission = totalSales * 0.08;
			} else if (totalSales < 10_000) {
				commission = 5000 * 0.08 + (totalSales - 5000) *  0.10;
			} else {
				commission = 5000 * 0.08 + 5000 *  0.10 + (totalSales - 10000) *  0.12;
			}
		}
		
		System.out.println("Total sales: " + totalSales);
		
		
	}
}
