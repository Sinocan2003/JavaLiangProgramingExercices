package chapter07;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			String[] words = { "program", "java", "computer", "phone", "baby", "ball", "chance", "children", "earth", "rocket", "space", "python" };
			String randomWord = chooesRandomWord(words);
			String codedWord = codeTheLetter(randomWord);
			startGame(codedWord, randomWord);

			System.out.print("Do you want to guess another word? Enter y or n> ");
			String yesOrNo = input.nextLine();
			if (yesOrNo.equals("n")) {
				break;
			}
		}
	}

	public static void startGame(String codedWord, String randomWord) {
		Scanner input = new Scanner(System.in);
		String[] writtenTrueLetters = new String[randomWord.length()];
		writtenTrueLetters = fillArray(writtenTrueLetters);
		int countFalseGuesses = 0;
		String newCodedWord = "";
		while (isTheGameContinue(codedWord)) {
			System.out.print("(Guess) Enter a letter in word " + codedWord + " > ");
			String guessLetter = input.next();

			newCodedWord = solveCodedWord(guessLetter, randomWord, writtenTrueLetters);
			boolean isLetterUsed = isLetterUsedBefore(writtenTrueLetters, guessLetter);
			if (newCodedWord.equals(codedWord) && isLetterUsed) {
				System.out.println(guessLetter + " is already in word");
			} else if (newCodedWord.equals(codedWord)) {
				System.out.println(guessLetter + " is not in the word");
				countFalseGuesses++;
			}
			codedWord = newCodedWord;
		}
		System.out.println("The word is " + codedWord + ". You missed " + countFalseGuesses + " time");
	}

	public static String[] fillArray(String[] writtenTrueLetters) {
		for (int i = 0; i < writtenTrueLetters.length; i++) {
			writtenTrueLetters[i] = "-";
		}
		return writtenTrueLetters;
	}

	public static String solveCodedWord(String guessLetter, String randomWord, String[] writtenTrueLetters) {
		String newCodedWord = "";
		for (int j = 0; j < randomWord.length(); j++) {
			char letter = randomWord.charAt(j);
			String sLetter = String.valueOf(letter);
			boolean isLetterUsedBefore = isLetterUsedBefore(writtenTrueLetters, sLetter);
			if (sLetter.equals(guessLetter) == false && isLetterUsedBefore == false) {
				newCodedWord += "*";
			} else if (isLetterUsedBefore) {
				newCodedWord += letter;
			} else if (sLetter.equals(guessLetter)) {
				newCodedWord += letter;
				collectTrueLetters(writtenTrueLetters, guessLetter);
			}
		}
		return newCodedWord;
	}

	public static String[] collectTrueLetters(String[] writtenTrueLetters, String guessLetter) {
		int i = 0;
		while (i < writtenTrueLetters.length) {
			if ((writtenTrueLetters[i]).equals("-") == false) {
				i++;
				continue;
			}
			writtenTrueLetters[i] = guessLetter;
			return writtenTrueLetters;
		}
		return writtenTrueLetters;
	}

	public static boolean isLetterUsedBefore(String[] writtenTrueLetters, String letter) {
		for (int i = 0; i < writtenTrueLetters.length; i++) {
			if (writtenTrueLetters[i].equals(letter)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isTheGameContinue(String codedWord) {
		int length = codedWord.length();
		for (int i = 0; i < length; i++) {
			char letter = codedWord.charAt(i);
			if (letter == '*') {
				return true;
			}
		}
		return false;
	}

	public static String chooesRandomWord(String[] words) {
		int random = (int) (Math.random() * words.length);
		String randomWord = words[random];
		return randomWord;
	}

	public static String codeTheLetter(String randomWord) {
		int length = randomWord.length();
		String codedWord = "";
		for (int i = 0; i < length; i++) {
			codedWord += "*";
		}
		return codedWord;
	}
}
