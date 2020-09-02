package chapter03;

public class Q24 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 13) + 1;
		
		System.out.print("The card you picked is ");
		
		switch (random) {
		case 1: System.out.print("Ace");break;
		case 11: System.out.print("Jack");break;
		case 12: System.out.print("Queen");break;
		case 13: System.out.print("King");break;
		default: System.out.print(random);
		}
		
		int random2 = (int) (Math.random() * 4) + 1;
		
		switch (random2) {
		case 1: System.out.println(" of Clubs");break;
		case 2: System.out.println(" of Diamonds");break;
		case 3: System.out.println(" of Hearts");break;
		case 4: System.out.println(" of Spades");break;
		}
	}
}
