package chapter06;

public class Q08 {

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s%-10s%-20s%-20s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");

		double celsius = 40, fahrenheit = 120;
		for (int i = 0; i < 10; i++) {
			System.out.printf("%-20.1f%-20.1f%-10s%-20.1f%-20.2f\n", celsius, celsiusToFahrenheit(celsius), "|",
					fahrenheit, fahrenheitToCelsius(fahrenheit));
			celsius--;
			fahrenheit -= 10;
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
