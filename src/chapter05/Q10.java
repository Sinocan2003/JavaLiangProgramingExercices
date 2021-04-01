package chapter05;

public class Q10 {

	public static void main(String[] args) {

		int tenPerLine = 0;
		int i = 100;
		while (i <= 1000) {
			if (i % 5 == 0 && i % 6 == 0) {
				if (tenPerLine < 10) {
					System.out.print(i + " ");
					tenPerLine++;
				} else {
					System.out.println(i);
					tenPerLine = 0;
				}
			}

			i++;
		}
	}
}
