package chapter07;

import java.util.Arrays;

public class Q31 {

	public static void main(String[] args) {
		int[] list1 = Q26.readArray("Enter list1: ");
		int[] list2 = Q26.readArray("Enter list2: ");
		
		int[] list  = merge(list1, list2);
		
		System.out.println(Arrays.toString(list));
		
	}
	
	public static int[] merge(int[] list1, int[] list2) {
		int[] list = new int[list1.length + list2.length];
		
		int list1Index = 0;
		int list2Index = 0;
		int listIndex = 0;
		
		while (list1Index < list1.length && list2Index < list2.length) {
			if (list1[list1Index] < list2[list2Index]) {
				list[listIndex++] = list1[list1Index++];
			} else {
				list[listIndex++] = list2[list2Index++];
			}
		}
		
		while (list1Index < list1.length) {
			list[listIndex++] = list1[list1Index++];
		}
		
		while (list2Index < list2.length) {
			list[listIndex++] = list2[list2Index++];
		}
		
		return list;
	}
}
