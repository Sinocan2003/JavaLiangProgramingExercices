package chapter07;

public class Q29 {

	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		shuffelDeck(deck);
		pick4Card(deck, suits, ranks);
	}

	public static void pick4Card(int[] deck, String[] suits, String[] ranks) {
		int[] fourCard = new int[4];
		for (int i = 0; i < fourCard.length; i++) {
			int random = (int) (Math.random() * 52);
			String suit = suits[deck[random] / 13];
			String rank = ranks[deck[random] % 13];
			System.out.println(rank + " of " + suit);
			fourCard[i] = (deck[random] % 13) + 1;
		}
		int sum = sumOfFourCards(fourCard);
		System.out.println("The sum is " + sum);
		
	}

	public static int sumOfFourCards(int[] fourCard) {
		int sum = 0;
		for (int i = 0; i < fourCard.length; i++) {
			sum += fourCard[i];
		}
		return sum;
	}

	public static void shuffelDeck(int[] deck) {
		for (int i = 0; i < deck.length; i++) {
			int randomCard = (int) (Math.random() * 52);
			int temp = deck[i];
			deck[i] = deck[randomCard];
			deck[randomCard] = temp;
		}
	}
}
