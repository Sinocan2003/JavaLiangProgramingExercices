package chapter05;

public class Q35 {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <= 624; i++) {
			double formule = 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
			sum += formule;
		}
		System.out.println("The sum is " + sum);
	}
}
