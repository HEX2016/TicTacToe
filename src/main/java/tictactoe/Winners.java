package tictactoe;

import java.util.Comparator;

/**
*	Winners class holds a name and how many times a player has won a game
*
*/
public class Winners{
	
	private String name;
	private int wins;

	/**************************************************************
	* Constructor Winners
	*
	* @param winnerName Name of winner
	* @param winnerWins How many times a player has won
	***************************************************************/
	public Winners(String winnerName, int winnerWins){
		this.name = winnerName;
		this.wins = winnerWins;
	}

	/**************************************************************
	*	Comparator for sorting the winners by how many wins they have in descenting order.
	*
	***************************************************************/
	public static Comparator<Winners> WinnersMostWins = new Comparator<Winners>(){
		public int compare(Winners w1, Winners w2){
			return w2.wins - w1.wins;
		}
	};

	/**************************************************************
	* toString Override to be able to print a Winner with how many wins he has.
	*
	***************************************************************/
	@Override
	public String toString(){
		return this.name + ": " + this.wins;
	}
}