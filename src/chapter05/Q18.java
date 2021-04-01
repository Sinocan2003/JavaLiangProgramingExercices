package chapter05;

public class Q18 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("  ");
			}
			for (int a = i; a <= i && a > 0; a--) {
			System.out.print(a + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; (j >= i || j <= i) && j <= 7 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
