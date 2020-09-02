package chapter03;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double xLeftMid1 = x1 - width1 / 2;
		double xRigthMid1 = x1 + width1 / 2;
		double xLeftMid2 = x2 - width2 / 2;
		double xRigthMid2 = x2 + width2 / 2;
		
		double yUpMid1 = y1 + height1 / 2;
		double yDownMid1 = y1 - height1 / 2;
		double yUpMid2 = y2 + height2 / 2;
		double yDownMid2 = y2 + height2 / 2;
		
		if (
				(xLeftMid1 <= xLeftMid2 && xLeftMid2 <= xRigthMid1) && 
				(xLeftMid1 <= xRigthMid2 && xRigthMid2 <= xRigthMid1) &&
				(yDownMid1 <= yDownMid2 && yDownMid2 <= yUpMid1) && 
				(yDownMid1 <= yUpMid2 && yUpMid2 <= yUpMid1)
				
				) {
			System.out.println("r2 is inside r1");
		} else if (
				(xLeftMid1 <= xLeftMid2 && xLeftMid2 <= xRigthMid1) || 
				(xLeftMid1 <= xRigthMid2 && xRigthMid2 <= xRigthMid1) ||
				(yDownMid1 <= yDownMid2 && yDownMid2 <= yUpMid1) ||
				(yDownMid1 <= yUpMid2 && yUpMid2 <= yUpMid1)
				
				) {
			System.out.println("r2 overlaps r1");
		} else {
			System.out.println("r2 does not overlap r1");
		}
		
	}
}
