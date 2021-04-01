package chapter06;

public class Q30 {

	public static void main(String[] args) {
		int roll1 = (int) (Math.random() * 6) + 1;
		int roll2 = (int) (Math.random() * 6) + 1;
		int sum = roll1 + roll2;
		System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);

		if (sum == 7 || sum == 11) {
			// Natural
			System.out.println("you win");
		} else if (sum == 2 || sum == 3 || sum == 12) {
			// Craps
			System.out.println("You lose");
		} else {
			while (true) {
				roll1 = (int) (Math.random() * 6) + 1;
				roll2 = (int) (Math.random() * 6) + 1;
				int sum2 = roll1 + roll2;
				System.out.print("The point is " + sum + "\n" + "You rolled " + roll1 + " + " + roll2 + " = " + sum2);

				if (sum == sum2) {
					System.out.println("You win");
					break;
				}

				if (sum == 7) {
					System.out.println("You lose");
					break;
				}
			}
		}
	}
}