package chapter05;

public class Q10 {

	public static void main(String[] args) {
		int number = 100;
		
		while (number <= 1000) {
			if (number % 30 == 0) {
				System.out.print(" " + number);
			}
			number++;
		}
	}
}
