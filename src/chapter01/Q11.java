package chapter01;

public class Q11 {

	public static void main(String[] args) {
		final int SECOND_IN_YEAR = 365 * 24 * 60 * 60;
		int population = 312032486;
		int birthInYear = SECOND_IN_YEAR / 7;
		int deathInYear = SECOND_IN_YEAR / 13;
		int immigrantInYear = SECOND_IN_YEAR / 45;
		int populationChangeInYear = birthInYear - deathInYear + immigrantInYear;
		
		System.out.println("Current population = " + population);
		
		population = population + populationChangeInYear;
		System.out.println("1. year population = " + population);
		
		population = population + populationChangeInYear;
		System.out.println("2. year population = " + population);
		
		population = population + populationChangeInYear;
		System.out.println("3. year population = " + population);
		
		population = population + populationChangeInYear;
		System.out.println("4. year population = " + population);
		
		population = population + populationChangeInYear;
		System.out.println("5. year population = " + population);
		
	}

}
