package chapter07;

public class Q24 {

	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		shuffelDeck(deck);
		printCards(deck, suits, ranks);
	}

	public static void printCards(int[] deck, String[] suits, String[] ranks) {
		int count = 0;
		String[] check = new String[4];
		int numberOfPicks = 0;
		while (count != 4) {
			int i = (int) (Math.random() * 52); // sinek 8
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			
			boolean found = false;
			for (int j = 0; j < count; j++) {
				if (suit == check[j]) {
					found = true;
					break;
				}
			}
			
			numberOfPicks++;
			
			if (found)
				continue;
			
			
			check[count] = suit;
			count++;
			
			System.out.println(rank + " of " + suit);
		}
		System.out.println("Number of picks: " + numberOfPicks);
		
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
