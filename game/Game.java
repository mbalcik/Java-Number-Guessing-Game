package game;

public class Game {

	
	private Player player1;	
	private Player player2;
	
	
	public Game(Player player1, Player player2) {

		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void play(int number) {
		int p1=Math.abs(player1.getGuess()-number);
		
		int p2=Math.abs(player2.getGuess()-number);
		
		if(p1<p2) {
			player1.setNumberOfWins(player1.getNumberOfWins()+1);
		}else if(p2<p1) {
			player2.setNumberOfWins(player2.getNumberOfWins()+1);
		}else {
			System.out.println("Same guess.");
		}
		
	}
	
	public void declareWinner() {
		 int a=player1.getNumberOfWins();

		 int b=player2.getNumberOfWins();
		 if(a>b) {
			 System.out.println(player1.getPlayerName() + " won");
		 }else if(a<b) {
			 System.out.println(player2.getPlayerName() + " won");
		 }else {
			 System.out.println("It's a tie!");
		 }
	}
}
