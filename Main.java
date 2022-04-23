import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import game.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		Player player11= new Player(" ");
		Player player22= new Player(" ");
		
		System.out.println("Enter the number of tours :");
		int tours =scanner.nextInt();
		
		System.out.println("Enter the name of player1 :");
		player11.setPlayerName(scanner.next());
		
		System.out.println("Enter the name of player2 :");
		player22.setPlayerName(scanner.next());

		Game game= new Game(player11,player22);
		
		int starter=1;
		
		while(starter<=tours) {
			
			System.out.println();

			int random= generateRandomNumber();
			
			System.out.println("Enter the "+player11.getPlayerName() +"'s guess : ");
			int p1guess= scanner.nextInt();
			player11.setGuess(p1guess);
			
			//inlab for player1
			player11.setScore(Math.abs(random-p1guess+player11.getScore()));
			
			
			
			System.out.println("Enter the "+player22.getPlayerName() +"'s guess : ");
			int p2guess= scanner.nextInt();
			player22.setGuess(p2guess);
			
			//inlab for player2
			player22.setScore(Math.abs(random-p2guess+player22.getScore()));
			
			System.out.println("The number was "+ random +".");
			game.play(random);
			
			if(starter==tours) {
				game.declareWinner();
				
	
				System.out.println("Game Result: " +player11.getPlayerName() +": " + player11.getNumberOfWins() +" "+ player22.getPlayerName() +": " + player22.getNumberOfWins());
				System.out.println("Game Scores: " +player11.getPlayerName() +": " + player11.getScore()+" "+ player22.getPlayerName() +": " + player22.getScore());
				
				
			}
			starter++;
		}
		
		
		
	}
	
	public static int generateRandomNumber() {
		return ThreadLocalRandom.current().nextInt(1, 100 + 1);
	}

}
