package chapter07;

public class Q23 {

	public static void main(String[] args) {
		boolean[] locker = changeLockers();

		printOpenLockers(locker);
	}

	public static boolean[] changeLockers() {
		boolean[] locker = new boolean[100];
		
		for (int i = 0; i < locker.length; i++) {
			for (int j = i; j < locker.length; j += (i + 1)) {
				locker[j] = !locker[j];
			}
		}
		
		return locker;
		
	}

	public static void printOpenLockers(boolean[] locker) {
		System.out.println("The open locker numbers are: ");
		int count = 0;
		for (int i = 1; i < locker.length; i++) {

			if (locker[i]) {
				System.out.print((i + 1) + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
