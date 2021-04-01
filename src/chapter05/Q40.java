package chapter05;

public class Q40 {

	public static void main(String[] args) {
		
		int head = 0;
		int tail = 0;
		for (int i = 1; i <= 100_000_000; i++) {
			int headOrTail = (int) (Math.random() * 2);
			if (headOrTail == 0) {
				head++;
			} else {
				tail++;
			}
		}
		System.out.println(head + "\n" + tail);
	}
}
