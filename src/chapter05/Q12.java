package chapter05;

public class Q12 {

	public static void main(String[] args) {
		
		int n = 1;
		while (Math.pow(n, 2) < 12000) {
			n++;
		}
		System.out.println("The smallest n such n2 < 12.000 is " + n);
	}
}
