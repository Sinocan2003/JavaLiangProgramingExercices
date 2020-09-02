package chapter04;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write a massage: ");
		String massage = input.nextLine();
		
		System.out.println("The Length of your massage is " + massage.length());
	}
}
