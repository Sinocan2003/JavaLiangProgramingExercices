package chapter04;

public class Q03 {

	public static void main(String[] args) {
		
		final double EARTH_RADIUS = 6371.01;
		
		double cordinatsOfAtlantaY = 33.7489954;
		double cordinatsOfAtlantaX = -84.3879824;
		
		double cordinatsOfOrlandoY = -81.3792365;
		double cordinatsOfOrlandoX = 28.5383355;
		
		double cordinatsOfSavannahY = -81.0998342;
		double cordinatsOfSavannahX = 32.0835407;
		
		double cordinatsOfCharlotteY = -80.8431267;
		double cordinatsOfCharlotteX = 35.2270869;
		
		
		double atlantaOrlando = EARTH_RADIUS * Math.cos(Math.sin(cordinatsOfAtlantaX)) * Math.sin(cordinatsOfOrlandoX) + Math.cos(cordinatsOfAtlantaX) * Math.cos(cordinatsOfOrlandoX) * Math.cos(cordinatsOfAtlantaY - cordinatsOfOrlandoY);
		double savannahOrlando = EARTH_RADIUS * Math.cos(Math.sin(cordinatsOfSavannahX)) * Math.sin(cordinatsOfOrlandoX) + Math.cos(cordinatsOfSavannahX) * Math.cos(cordinatsOfOrlandoX) * Math.cos(cordinatsOfSavannahY - cordinatsOfOrlandoY);
		double charlotteSavannah = EARTH_RADIUS * Math.cos(Math.sin(cordinatsOfSavannahX)) * Math.sin(cordinatsOfOrlandoX) + Math.cos(cordinatsOfSavannahX) * Math.cos(cordinatsOfOrlandoX) * Math.cos(cordinatsOfSavannahY - cordinatsOfCharlotteY);
		double atlantaSavvanah = EARTH_RADIUS * Math.cos(Math.sin(cordinatsOfSavannahX)) * Math.sin(cordinatsOfOrlandoX) + Math.cos(cordinatsOfSavannahX) * Math.cos(cordinatsOfOrlandoX) * Math.cos(cordinatsOfSavannahY - cordinatsOfAtlantaY);
		double atlantaCharlotte = EARTH_RADIUS * Math.cos(Math.sin(cordinatsOfAtlantaX)) * Math.sin(cordinatsOfOrlandoX) + Math.cos(cordinatsOfAtlantaX) * Math.cos(cordinatsOfOrlandoX) * Math.cos(cordinatsOfAtlantaY - cordinatsOfCharlotteY);
		
		double s1 = (savannahOrlando + atlantaSavvanah + atlantaOrlando) / 2;
		double area1 = Math.sqrt(s1 * (s1 - savannahOrlando) * (s1 - atlantaSavvanah) * (s1 - atlantaOrlando));
		double s2 = (charlotteSavannah + atlantaSavvanah + atlantaCharlotte) / 2;
		double area2 = Math.sqrt(s2 * (s2 - charlotteSavannah) * (s2 - atlantaSavvanah) * (s2 - atlantaCharlotte));
		
		System.out.println("The area of citis are " + (area1 + area2));
		
	}
}
