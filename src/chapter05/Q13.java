package chapter05;

public class Q13 {

	public static void main(String[] args) {
		
		int n = 1;
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		System.out.println("The largest n such n3 > 12.000 is " + (n - 1));

	}

}
