package chapter05;

public class Q23 {

	public static void main(String[] args) {
		
		double sum = 0;
		for (double n = 1; n <= 50000; n++) {
			sum += 1/n;
		}
		
		double sum2 = 0;
		for (double n = 50000; n >= 1; n--) {
			sum2 += 1/n;
		}
		
		System.out.println("Left to right: " + sum + "\n" + "Right to left: " + sum2);
	}
}
