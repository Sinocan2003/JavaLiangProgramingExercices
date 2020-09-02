package chapter01;

public class Q07 {

	public static void main(String[] args) {
		
		
		double result = 4 * ( 1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) );
		System.out.println(result);
		
		result = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + ( 1.0 / 13));
		System.out.println(result);
		
		result = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + ( 1.0 / 13) - (1.0 / 15) + ( 1.0 / 17));
		System.out.println(result);

	}

}
