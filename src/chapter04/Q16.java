package chapter04;

public class Q16 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 5) + 1;
		
		switch (random) {
		case 1: System.out.println(" A ");break;
		case 2: System.out.println(" B ");break;
		case 3: System.out.println(" C ");break;
		case 4: System.out.println(" D ");break;
		case 5: System.out.println(" E ");break;
		case 6: System.out.println(" F ");break;
		}
	}
}
