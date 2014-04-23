import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame
	{
	static ArrayList<String> loader = new ArrayList<String>();

	public static void main(String[] args)
		{
		Themes.setupAnswers();
		Layout.createBlankLayout();
		Layout.display();
		Choosing.inputFirstChoice();
		Choosing.inputSecondChoice();
		Choosing.compareChoices();
		}
	
	public static boolean isValidMove()
		{
		if (! Layout.layout [Choosing.firstRowChoice][Choosing.firstColumnChoice].equals("    ") || 
				! Layout.layout [Choosing.secondRowChoice][Choosing.secondColumnChoice].equals("    "))
			{
			return true;
			}
		return false;
		}
	}

	
