package game;

public class Player {

	
	
	private String playerName;
	private int numberOfWins;
	private int guess;
	
	private int score;
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	public Player(String playerName) {
		
		this.playerName = playerName;
		this.numberOfWins=0;
		this.guess=0;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getNumberOfWins() {
		return numberOfWins;
	}

	public void setNumberOfWins(int numberOfWins) {
		this.numberOfWins = numberOfWins;
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}
	
	public void addWin(Player p) {
		this.setNumberOfWins(numberOfWins+1);
	}


}
