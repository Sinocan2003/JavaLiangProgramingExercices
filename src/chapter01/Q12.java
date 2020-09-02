package chapter01;

public class Q12 {

	public static void main(String[] args) {
		final double KILOMETER_PER_MILE = 1.6;
		double mile = 24;
		double kilometer = mile / KILOMETER_PER_MILE;
		System.out.println(" 24 mil is  " + kilometer + " km");
		double totalSecond = 3600 + 40 * 60 + 35;
		double kilometer_per_hour = (kilometer * 3600) / totalSecond;
		System.out.println(" kilometer per hour is " + kilometer_per_hour);
		
		

	}

}
