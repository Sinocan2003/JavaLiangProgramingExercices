package chapter05;

public class Q11 {

	public static void main(String[] args) {
		int number = 100;
		
		while (number <= 200) {
			//if ((number % 5 == 0 || number % 6 == 0) && (number % 5 != 0 || number % 6 != 0)) {
			if (number % 5 == 0 ^ number % 6 == 0) {
				System.out.print(" " + number);
			}
			number++;
		}
	}

}
