package chapter05;

public class Q11 {

	public static void main(String[] args) {
		int i = 100;
		int tenPerLine = 0;
		while (i <= 200) {
			// if ((i % 5 == 0 || i % 6 == 0) && ((i % 5 == 0 && i % 6 == 0) == false)) {
			// if ((i % 5 == 0 && i % 6 != 0) || (i % 5 != 0 && i % 6 == 0)) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				System.out.print(i + " ");
				tenPerLine++;
			} else if (tenPerLine >= 9) {
				System.out.println(i);
				tenPerLine = 0;
			}
			i++;

		}
	}
}
