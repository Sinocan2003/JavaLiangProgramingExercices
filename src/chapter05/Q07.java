package chapter05;

public class Q07 {

	public static void main(String[] args) {
		int cost = 10000;
		int year = 1;
		
		while (year <= 10) {
			System.out.println(year + ". year costs " + (cost + (cost * 5) / 100) + "\n");
			year++;
			cost += (cost * 5) / 100;
		}
		
		int year2 = 1;
		int sum = 0;
		
		while (year2 <= 4) {
			cost += (cost * 5) / 100;
			sum += cost;
			year2++;
		}
		
		System.out.println("The sum of the 11th, 12th, 13th and 14th year is " + sum);

	}

}
