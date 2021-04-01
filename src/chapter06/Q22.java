package chapter06;

public class Q22 {

	public static void main(String[] args) {
		System.out.println(sqrt(4));
		System.out.println(sqrt(9));
		System.out.println(sqrt(16));
		System.out.println(sqrt(25));
		System.out.println(sqrt(36));
		
	}
	
	public static double sqrt(long n) {
		
		double lastGuess = 1;
		while (true) {
			double nextGuess = (lastGuess + n / lastGuess) / 2;
			if (Math.abs(nextGuess - lastGuess) < 0.00000000000000001) {
				return lastGuess;
			}
			lastGuess = nextGuess;
		}
	}
}
