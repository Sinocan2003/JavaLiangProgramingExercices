package chapter04;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		int numberOfHoursWorked = input.nextInt();
		
		System.out.print("Enter hourly pay rate: ");
		double hourslyPay = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double revenue = (numberOfHoursWorked * hourslyPay);
		
		double federalTax = revenue * federalTaxRate;
		double stateTax = revenue * stateTaxRate;
		double netPay = (revenue -  (stateTax + federalTax));
		
		System.out.println("Employee Name: " + name + "\n"
						 + "Hours Worked: " + numberOfHoursWorked + "\n"
						 + "Pay Rate: " + hourslyPay + "\n"
						 + "Gross Pay: " + numberOfHoursWorked * hourslyPay + "\n"
						 + "Deductions: " + "\n"
						 + "\tFederal Withholding (20%): " + federalTax + "\n"
						 + "\tState Withholding (9%): " + stateTax + "\n"
						 + "\tTotal Deduction: " + (federalTax + stateTax) + "\n"
						 + "Net Pay: " + netPay); 
		
		
	}
}
