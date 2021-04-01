package chapter05;

public class Q05 {

	public static void main(String[] args) {
		System.out.println("Kilograms         Pounds    |   Pounds         Kilogram");
		
		int pound2 = 15;
		for (int kilograms = 1; kilograms <= 199; kilograms += 2) {
			double pound = kilograms * 2.2;
			pound2 += 5;
			double kilogram2 = pound2 / 2.2;
			System.out.printf("%4d%8s%12.1f%5s%7d%6s%12.2f\n", kilograms, "", pound , "|" , pound2 , "", kilogram2);

		}
	}
}