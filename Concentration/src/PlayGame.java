
public class PlayGame
	{
	public static void main(String[] args)
		{
		Themes.chooseTheme();
		Themes.shuffleTerms();
		Layout.createLayout();
		Layout.display();
		Choosing.inputFirstChoice();
		//Choosing.inputSecondChoice();
		
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

	
