package chapter07;

public class Q13 {

	public static void main(String[] args) {
		int randomNumber = getRandom(1, 2, 3, 4, 5, 6, 7, 8 ,9);
		System.out.println("The random number is " + randomNumber);		
	}
	
	public static int getRandom(int... numbers) {
		int randomNumber = (int) (Math.random() * 54) + 1;
		for (int i = 0; i < numbers.length; i++) {
			if (randomNumber == numbers[i]) {
				randomNumber = (int) (Math.random() * 54) + 1;
				i = 0;
			}
		}
		return randomNumber;
	}
}
