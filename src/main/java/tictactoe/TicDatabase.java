package tictactoe;

import java.io.*;
import java.util.*;

public class TicDatabase {
	private String nameList = "winners.txt";
	private FileWriter list = null;

	/**
	* insertName inserts a new name of winner to the winners list
	* @param name Name of the current round winner
	*/
	public void insertName(String name)
	{
		try{
			File file = new File(nameList);
			if(file.createNewFile())
			{
				System.out.println("Note: Create new db file.");
			}
			BufferedWriter out = new BufferedWriter(new FileWriter(nameList, true));
			out.write(name+"\n");
			out.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	/**
	* getTopList() returns top 5 players list to show when game starts
	*
	* @return String with top 5 players in correct order (from private function)
	*/
	public String getTopList()
	{
		File f = new File(nameList);
		if(!f.exists() || f.isDirectory()) { 
		    return "No listed winner, win a game \nand be the first registered winner!";
		}

		ArrayList<String> listi = new ArrayList<String>();
		String temp;
		try{
			FileReader fr = new FileReader(new File(nameList));
			BufferedReader br = new BufferedReader(fr);

			while((temp = br.readLine()) != null){
				listi.add(temp);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}


		return groupBy(listi);

	}

	/**
	* getTopList() returns top 5 players list to show when game starts
	*
	* @return String with top 5 players in correct order with line breaks between
	* If no winners are registered, it will return an empty String.
	*/
	private String groupBy(ArrayList<String> unordered){
		if (unordered.size() < 1) return "";

		ArrayList<Winners> sorted = new ArrayList<Winners>();
		Collections.sort(unordered);

		String temp = new String();
		int num = 0;
		for(String s: unordered){
			//System.out.print(s);
			if (s.equals(temp)){
				// same name, just increment
				num++;
				//System.out.println(" incremented");
			}
			else {
				// new name, add the old one and setup counter
				sorted.add(new Winners(temp, num));
				temp = s;
				num = 1;
				//System.out.println(" reset");
			}
		}
		sorted.add(new Winners(temp, num));

		// Finish up the list and create String to return (top list)
		Collections.sort(sorted, Winners.WinnersMostWins);
		String res = new String();
		int i = 0;
		for (Winners s: sorted){
			res += s+"\n";
			i++;
			if (i >= 5) break;
		}
		return res;
	}
}
