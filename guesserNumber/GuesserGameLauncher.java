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

	void getPlayersNumber(boolean first, boolean second, boolean third) {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		 if(first == true && second == true && third == true) {
			    numFromPlayer1 = p1.playerNumber();
				numFromPlayer2 = p2.playerNumber();
				numFromPlayer3 = p3.playerNumber();
		    } else if(first == true && second == true && third == false) {
		    	// match b/w 1 and 2 player
		    	numFromPlayer1 = p1.playerNumber();
				numFromPlayer2 = p2.playerNumber();
		    } else if(first == true && second == false && third == true) {
		    	// match b/w 1 and 3
		    	numFromPlayer1 = p1.playerNumber();
		    	numFromPlayer3 = p3.playerNumber();
		    } else if(first == false && second == true && third == true){
		    	// match b/w 2 and 3
		    	numFromPlayer2 = p2.playerNumber();
				numFromPlayer3 = p3.playerNumber();
		    } else {
		    	// no match
		    	System.out.println("No match Scheduled");
		    }	
	
		
	}

	void result() {
		Umpire umpire = new Umpire();
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All Players WIN the Game");
				System.out.println("It's Tie between player 1 ,2 and 3, so Restarting the Game again  to Play");
				System.out.println("*********************");
				System.out.println("Match b/w player 1, player 2 and Player 3");
				umpire.getGuesserNumber();
				umpire.getPlayersNumber(true, true, true);
				umpire.result();
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2 WIN the game ");
				System.out.println("So Restart the again  Again");
				System.out.println("It's Tie between player 1 and player2, so Restarting the Game again  to Play");
				System.out.println("*********************");
				System.out.println("Match Betwen Player 1 and Player 2");
				umpire.getGuesserNumber();
				umpire.getPlayersNumber(true, true, false);
				umpire.result();
			} else if (numFromGuesser == numFromPlayer1) {
				System.out.println("Player 1 and Player 3 WIN the Game");
				System.out.println("It's Tie between player 1 and player 3, so Restarting the Game again  to Play");
				System.out.println("*********************");
				System.out.println("Match Between player 1 and Player 3");
				umpire.getGuesserNumber();
				umpire.getPlayersNumber(true, false, true);
				umpire.result();
			} else {
				System.out.println("Player 1 WIN the game");
			}

		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3 Won the Game");
				System.out.println("It's Tie between player 2 and player 3, so Restarting the Game again  to Play");
				System.out.println("*********************");
				System.out.println("Match Between Player 2 and Player 3");
				umpire.getGuesserNumber();
				umpire.getPlayersNumber(false, true, true);
				umpire.result();
			} else {
				System.out.println("Player 2 WON the game");
			}

		}

		else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 WON the game");
		}

		else {
			System.out.println("No one won the GAME");
			System.out.println("*******************");
			System.out.println("Restarting the Game");
			umpire.getGuesserNumber();
			umpire.getPlayersNumber(true, true, true);
			umpire.result();
		}

	}

}

public class GuesserGameLauncher {

	public static void main(String[] args) throws IOException {
		Umpire umpire = new Umpire();
		umpire.getGuesserNumber();
		umpire.getPlayersNumber(true, true, true);
		umpire.result();

	}

}
