package chapter05;

public class Q07 {

	public static void main(String[] args) {
		int amount = 10000;
		int sum = 0;
		for (int year = 1; year <= 14; year++) {
			int rate = (5 * amount) / 100;
			amount = amount + rate;
			if (year > 10) {
				sum += amount;
				continue;
			}
			System.out.println(year + ". year amount is " + amount);

		}
		
		System.out.println("The total cost of the last 4 years is " + sum);

	}
}
