import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame
	{
	static ArrayList<String> loader = new ArrayList<String>();
	static int numberOfAttempts = 0;

	public static void main(String[] args)
		{
		Themes.setupAnswers();
		Layout.createBlankLayout();
		Layout.display();
		while (Choosing.numberOfMatches < 8)
			{
			Choosing.inputFirstChoice();
			Choosing.inputSecondChoice();
			Choosing.compareChoices();
			}
		displayScore();
		}
	
	public static void displayScore()
		{
		System.out.println("You cleared the board!  It took you " + numberOfAttempts +
				" attempts.");
		System.out.println("See if you can beat that record.");
		}
	
//	public static boolean isValidMove()
//		{
//		if (! Layout.layout [Choosing.firstRowChoice][Choosing.firstColumnChoice].equals("    ") || 
//				! Layout.layout [Choosing.secondRowChoice][Choosing.secondColumnChoice].equals("    "))
//			{
//			return true;
//			}
//		return false;
//		}
	}

	
