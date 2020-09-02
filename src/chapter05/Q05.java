package chapter05;

public class Q05 {

	public static void main(String[] args) {
		System.out.printf("%12s%12s%7s%9s%12s\n", "Kilometers", "Pounds", "| ", "Mils", "Kilometers");   
		for (int kilogram = 1; kilogram < 200; ++kilogram) {
			System.out.printf("%12d%12.2f%7s%9d%12.2f\n", kilogram, (kilogram * 2.2), "| ", 20, (20 * 1.609));
		}
	}
}
