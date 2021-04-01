package chapter06;

public class Q13 {

	public static void main(String[] args) {
		System.out.println("i      m(i)");
		System.out.println("-------------");
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%3d%2s%8.4f%1s", i , "" , m(i),"\n");
		}
	}
	public static double m(int i) {
		double sum = 0;
		while (i > 0) {
			sum += i / (i + 1.0);
			i--;
		}
		return sum;
	}
}
