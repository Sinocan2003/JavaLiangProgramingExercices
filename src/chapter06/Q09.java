package chapter06;

public class Q09 {

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s%-10s%-20s%-20s\n", "Feet", "Meters", "|", "Meters", "Feet");

		double feet = 1, meter = 20;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-20.1f%-20.3f%-10s%-20.1f%-20.3f\n", feet, footToMeter(feet), "|",
					meter, meterToFoot(meter));
			feet++;
			meter += 5;
		}
		
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

	public static double footToMeter(double feet) {
		return 0.305 * feet;
	}
}
