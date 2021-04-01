package chapter05;

import java.util.Scanner;

public class Q44 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		short s = scan.nextShort();
		
		System.out.print("The bits are ");
		String bits = "";
		for (int i = 0; i < 16; i++) {
			bits = (s & 1) + bits;
			s = (short) (s >> 1);
		}
		System.out.println(bits);
	}
}
