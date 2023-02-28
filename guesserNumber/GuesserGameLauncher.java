package guesserNumber;

import java.io.IOException;
import java.util.Scanner;

class Guesser {
	int guessNumber;

	int getGuesserNumber() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Please Guess the Number");
		guessNumber = sc.nextInt();
		
		while (guessNumber > 10 || guessNumber <= 0) { // Range to Guess the Number
			System.out.println("Incorrect Input");
			System.out.println("Allowed Range is 1 - 10 please Guess again");
			guessNumber = sc.nextInt();
		}

		return guessNumber;
	}

}

class Player {
	int playerGuess;

	int playerNumber() {
		@SuppressWarnings("resource")
		Scanner scm = new Scanner(System.in);
		System.out.println("Player Please Guess the Number");
		playerGuess = scm.nextInt();
		while (playerGuess > 10 || playerGuess <= 0) { // Range to Guess the Number
			System.out.println("Incorrect Input");
			System.out.println("Allowed Range is 1 - 10 Player Guess Again");
			playerGuess = scm.nextInt();
		}
		return playerGuess;
	}

}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void getGuesserNumber() {
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.getGuesserNumber();

	}

	void getPlayersNumber() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.playerNumber();
		numFromPlayer2 = p2.playerNumber();
		numFromPlayer3 = p3.playerNumber();
	}

	void result() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All Players WIN the Game");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2 WIN the game ");
			} else if (numFromGuesser == numFromPlayer1) {
				System.out.println("Player 1 and Player 3 WIN the Game");
			} else {
				System.out.println("Player 1 WIN the game");
			}

		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3 Won the Game");
			} else {
				System.out.println("Player 2 WON the game");
			}

		}

		else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 WON the game");
		}

		else {
			System.out.println("No one won the GAME");
		}

	}

}

public class GuesserGameLauncher {

	public static void main(String[] args) throws IOException {
		Umpire umpire = new Umpire();
		umpire.getGuesserNumber();
		umpire.getPlayersNumber();
		umpire.result();

	}

}
