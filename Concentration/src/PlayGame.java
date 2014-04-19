import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame
	{
	static ArrayList<String> loader = new ArrayList<String>();

	public static void main(String[] args)
		{
		Layout.createLayout();
		Layout.display();
		chooseTheme();
		Choosing.inputFirstChoice();
		Choosing.inputSecondChoice();
		}
	
	public static void chooseTheme()
		{
		System.out.println("Which theme would you like to play with?");
		System.out.println("(1) animals  (2) food  (3) places  (4) body parts  (5) names");
		Scanner input = new Scanner(System.in);
		int theme = input.nextInt();
		switch(theme)
			{
			case 1:
				{
				for(String array : Themes.animals)
					{
					loader.add(array);
					break;
					}
				}
			case 2:
				{
				for(String array : Themes.food)
					{
					loader.add(array);
					break;
					}
				}
			case 3:
				{
				for(String array : Themes.places)
					{
					loader.add(array);
					break;
					}
				}
			case 4:
				{
				for(String array : Themes.bodyParts)
					{
					loader.add(array);
					break;
					}
				}
			case 5:
				{
				for(String array : Themes.names)
					{
					loader.add(array);
					break;
					}
				}
			}
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

	
