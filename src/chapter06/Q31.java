package chapter06;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a card number: ");
		long cardNumber = input.nextLong();
		
		
		if (isValid(cardNumber)) {
			System.out.println(cardNumber + " is valid");
		} else  {
			System.out.println(cardNumber + " is invalid");
		}
	}
	
	public static boolean isValid(long cardNumber) {
		int length = getSize(cardNumber);
		if (length < 13 || length > 16) {
			return false;
		} else if (prefixMatched(cardNumber, length) == false) {
			return false;
		}
		
		int sum = sumOfOddPlace(cardNumber) + sumOfDoubleEvenPlace(cardNumber);
		if (sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		while (number > 1) {
		number /= 10;
		if (getSize((number % 10) * 2) > 1) {
			 sum += getDigit((number % 10) * 2);
		} else {
			sum += (number % 10) * 2;
		}
		 number /= 10;
		}
		return sum;
	}
	
	public static int getDigit(long l) {
		int digit = 0;
		 while (l >= 1) {
			 digit += l % 10;
			 l /= 10;
		 }
		return digit;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		while (number > 1) {
		 sum += number % 10;
		 number /= 100;
		}
		return sum;
	}
	
	public static boolean prefixMatched(long number, int d) {
		double divisor = 0.1;
		for (int i = 0; i < d - 1; i++) {
			divisor *= 10;
		}
		number /= divisor;
		if (number == 37) {
			return true;
		} else if (number / 10 == 4 || number / 10 == 5 || number / 10 == 6) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int getSize(long d) {
		int length = 0;
		while (d >= 1) {
			d /= 10;
			length++;
		}
		return length;
	}
}
