package  chapter07;

import java.util.Arrays;

public class Q16 {

	public static void main(String[] args) {
		final int N = 1_000_000_000;
		
		long start, end;
		
		start = System.currentTimeMillis();
		int[] array = createRandomlyArray(N);
		end = System.currentTimeMillis();
		System.out.println("createRandomlyArray takes " + (end - start) + " ms");
		
		int key = (int) (Math.random() * Integer.MAX_VALUE);
		
		start = System.currentTimeMillis();
		linearSearchTime(array, key);
		end = System.currentTimeMillis();
		System.out.println("linearSearchTime takes " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		// sortingArray(array);
		// 10 -> 100
		// 100 -> 10000
		Arrays.sort(array);
		end = System.currentTimeMillis();
		System.out.println("sortingArray takes " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		binarySearchTime(array, key);
		end = System.currentTimeMillis();
		System.out.println("binarySearchTime takes " + (end - start) + " ms");

	}

	public static int binarySearchTime(int[] array, int key) {
		int min = 0;
		int max = array.length - 1;
		
		int mid = (max + min)/ 2;
		
		while (max >= min) {
			if (key > array[mid]) {
				min = mid + 1;
				mid = (max + min)/ 2;
			} else if (key < array[mid]) {
				max = mid - 1;
				mid = (max + min)/ 2;
			} else {
				return min;
			}
		}
		return -1;
	}

	public static void sortingArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}

	public static int linearSearchTime(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int [] createRandomlyArray(final int N) {
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = (int) (Math.random() * Integer.MAX_VALUE);
			
		}
		return array;
	}
}
