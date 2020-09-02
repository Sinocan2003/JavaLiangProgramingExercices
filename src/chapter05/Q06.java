package chapter05;

public class Q06 {

	public static void main(String[] args) {
		int mile= 1;
		int mile2 = 20;
		System.out.printf("%12s%12s%7s%9s%12s\n" ,"Mils","Kilometers"," |","Mils","Kilometers");   
		while (mile < 200 && mile2 < 65) {
			System.out.printf("%12d%12.2f%7s%9d%12.2f\n", mile , (mile2 * 2.2) , "|" , mile , (mile2 * 1.609));
			++mile;
			++mile2;
		}
	}
}
