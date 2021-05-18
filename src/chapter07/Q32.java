package chapter07;

import java.util.Arrays;

public class Q32 {

	public static void main(String[] args) {
		int[] list = Q26.readArray("Enter list: ");
		
		System.out.println(Arrays.toString(list));
		
		int index = partition(list);
		System.out.println("index = " + index);
		
		System.out.println(Arrays.toString(list));
	}
	public static int partition(int[] list) {
		int pivot = list[0];
		int low = 1;
		int high = list.length - 1;
		
		while (low <= high) {
			while (list[low] < pivot) low++;
			
			while (list[high] >= pivot) high--;
			
			if  (low < high) {
				int temp = list[low];
				list[low] = list[high];
				list[high] = temp;
			}
		}
		
		list[0] = list[high];
		list[high] = pivot;
		
		return high;
		/*
		int[] partitionList = new int[list.length];
		int beginning = 0;
		int end = list.length - 1;
		for (int i = 0; i < list.length; i++) {
			if (list[i] < list[0]) {
				partitionList[beginning] = list[i];
				beginning++;
			} else if (list[i] > list[0]) {
				partitionList[end] = list[i];
				end--;
			} 
		}
		placeTheFirstNum(partitionList, list); 
		return 0;
		*/
	}
	public static void placeTheFirstNum(int[] partitionList, int[] list) {
		for (int i = 1; i < partitionList.length - 1; i++) {
			if (partitionList[i - 1] < list[0] && partitionList[i + 1] > list[0]) {
				partitionList[i] = list[0];
			}
		}
	}
}
