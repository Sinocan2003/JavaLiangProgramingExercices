package chapter01;

public class Q10 {

	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.6;
		double kilometers = 15;
		double mile = kilometers * KILOMETERS_PER_MILE;
		System.out.println(" 15 kilometer is " + mile + " mil");
		double totalSecond = 50 * 60 + 30;
		double mile_per_hour = (mile * 3600) / totalSecond; 
		System.out.println("mile per hour is " +mile_per_hour);
	}

}
