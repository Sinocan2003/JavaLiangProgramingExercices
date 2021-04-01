package chapter06;

public class Q38 {

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	public static void main(String[] args) {
		int countletter = 0;
		int countDigit = 0;
		for (int i = 1; i <= 200; i++) {
			if (countletter == 100) {
				System.out.print(getRandomDigitCharacter());
				countDigit++;
			} else if (countDigit == 100) {
				System.out.print(getRandomUpperCaseLetter());
				countletter++;
			} else {
				if (Math.random() > 0.5) {
					System.out.print(getRandomUpperCaseLetter());
					countletter++;
				} else {
					System.out.print(getRandomDigitCharacter());
					countDigit++;
				}
			}
			
			if (i % 10 == 0) 
				System.out.println();
		}
		
		System.out.println("countletter = " + countletter);
		System.out.println("countDigit = " + countDigit);
	}
}
