package chapter07;

public class Q12 {

	public static int[] reverse(int[] list) {
		int temp = 0;
		
		for (int i = 0, j = (list.length - 1) / 2; i < (list.length / 2); i++, j--) {
			temp = list[j];
			list[j] = list[i];
			list[i] = temp; 
		}

		return list;

	}
}
