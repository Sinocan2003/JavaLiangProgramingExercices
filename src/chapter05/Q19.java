package chapter05;

public class Q19 {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= i; j--) {
				System.out.print("    ");
			}
			for (int a = 0; a < i; a++) {
				System.out.printf("%4d", (int) Math.pow(2, a));
			}
			for (int b = i - 1; b <= (i) && b > 0; b--) {
				System.out.printf("%4d", (int) Math.pow(2, b - 1));
			}
			System.out.println();
			
		}
	}
}
