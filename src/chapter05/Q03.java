package chapter05;

public class Q03 {

	public static void main(String[] args) {
		System.out.println("Kilograms         Pounds");
		
		for (int kilograms = 1; kilograms <= 199; kilograms += 2) {
			double pound = kilograms * 2.2;
			System.out.printf("%4d%8s%12.1f\n" , kilograms , "" , pound);
		}
	}
}
