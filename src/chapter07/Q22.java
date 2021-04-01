package chapter07;

public class Q22 {
	
	private static final int EMPTY = 0;
	private static final int QUEEN = 1;
	private static final int CLOSED = 2;

	public static void main(String[] args) {
		int[] chessBoard;
		while(true) {
			chessBoard = new int[64];
			int  queenCount = playOnes(chessBoard);
			System.out.println(queenCount);
			if (queenCount == 8)
				break;
			
		}
		
		print(chessBoard);
	}

	public static int playOnes(int[] chessBoard) {
		int queenCount = 0;
		while (isThereAny0(chessBoard)) {
			int random = placeTheQueen(chessBoard);
			queenCount++;
			fillTheBoard(chessBoard, random);
		}
		return queenCount;
	}

	public static void print(int[] chessBoard) {
		for (int i = 1; i < chessBoard.length + 1; i++) {
			if (i % 8 == 0 && chessBoard[i - 1] == QUEEN) {
				System.out.println("Q|");
			} else if (i % 8 != 0 && chessBoard[i - 1] == QUEEN) {
				System.out.print("Q|");
			} else if (i % 8 != 0 && chessBoard[i - 1] != QUEEN) {
				System.out.print(" |");
			} else if (i % 8 == 0 && chessBoard[i - 1] != QUEEN) {
				System.out.println(" |");
			}
		}

	}

	public static boolean isThereAny0(int[] chessBoard) {
		for (int i = 0; i < chessBoard.length; i++) {
			if (chessBoard[i] == EMPTY) {
				return true;
			}
		}
		return false;
	}

	public static void fillTheBoard(int[] chessBoard, int random) {
		int y = yCoordinats(random);
		int x = xCoordinats(random);

		for (int i = 0; i < chessBoard.length; i++) {
			if (yCoordinats(i) == y && xCoordinats(i) != x) {
				chessBoard[i] = CLOSED;
			} else if (xCoordinats(i) == x && yCoordinats(i) != y) {
				chessBoard[i] = CLOSED;
			} else if (xCoordinats(i) + yCoordinats(i) == y + x && (xCoordinats(i) != x && yCoordinats(i) != y)) {
				chessBoard[i] = CLOSED;
			} else if ((xCoordinats(i) - x == yCoordinats(i) - y) && (xCoordinats(i) != x && yCoordinats(i) != y)) {
				chessBoard[i] = CLOSED;
			}
		}
	}

	public static int xCoordinats(int num) {
		int x = num % 8;
		return x;
	}

	public static int yCoordinats(int num) {
		if (num / 8 == 0) {
			int y = num / 8;
			return y;
		} else {
			int y = (num / 8) + 1;
			return y;
		}
	}

	public static int placeTheQueen(int[] chessBoard) {
		while (true) {
			int random = (int) (Math.random() * 64);
			if (chessBoard[random] == EMPTY) {
				chessBoard[random] = QUEEN;
				return random;
			}
		}
	}
}
