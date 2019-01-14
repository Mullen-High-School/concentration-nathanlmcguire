import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Choosing
	{
	static String firstChoice, secondChoice;
	static int firstRowChoice, firstColumnChoice, secondRowChoice, secondColumnChoice;
	static int numberOfMatches = 0;
	
	public static void inputFirstChoice()	
		{			
		System.out.println("Please enter the row and column of your move (e.g. A1)");
		Scanner input = new Scanner(System.in);
		firstChoice = input.nextLine();
		switch (firstChoice.substring(0,1))
			{
			case "A":
			case "a":
				{
				firstRowChoice = 0;
				break;
				}
			case "B":
			case "b":
				{
				firstRowChoice = 1;
				break;
				}
			case "C": 
			case "c":
				{
				firstRowChoice = 2;
				break;
				}
			case "D": 
			case "d":
				{
				firstRowChoice = 3;
				break;
				}
			}
		
		firstColumnChoice = Integer.parseInt(firstChoice.substring(1)) - 1;
		System.out.println();
		Layout.layout[firstRowChoice][firstColumnChoice] = 
				Themes.layoutAnswers[firstRowChoice][firstColumnChoice];
		Layout.display();
		}

	public static void inputSecondChoice()
		{
		System.out.println("Please enter the row and column of your move (e.g. A1)");
		Scanner input = new Scanner(System.in);
		secondChoice = input.nextLine();
		switch (secondChoice.substring(0,1))
			{
			case "A":
			case "a":
				{
				secondRowChoice = 0;
				break;
				}
			case "B":
			case "b":
				{
				secondRowChoice = 1;
				break;
				}
			case "C": 
			case "c":
				{
				secondRowChoice = 2;
				break;
				}
			case "D": 
			case "d":
				{
				secondRowChoice = 3;
				break;
				}
			}
		
		secondColumnChoice = Integer.parseInt(secondChoice.substring(1)) - 1;
		System.out.println();
		Layout.layout[secondRowChoice][secondColumnChoice] = 
				Themes.layoutAnswers[secondRowChoice][secondColumnChoice];
		PlayGame.numberOfAttempts++;
		Layout.display();
		}
			
	public static void compareChoices()
		{
		if (Layout.layout[firstRowChoice][firstColumnChoice].equals
		                                  (Layout.layout[secondRowChoice][secondColumnChoice]))
			{
			numberOfMatches++;
			if ( numberOfMatches == 1)
				{
				System.out.println("Congratulations, you have " + numberOfMatches + " match.");
				}
			else
				{
				System.out.println("Congratulations, you have " + numberOfMatches + " matches.");
				}
			}
		else
			{
			try 
				{
				TimeUnit.SECONDS.sleep(2);
				}
			catch (InterruptedException e) 
				{
				//Handle exception
				}
			Layout.layout[firstRowChoice][firstColumnChoice] = "    ";
			Layout.layout[secondRowChoice][secondColumnChoice] = "    ";
			Layout.display();	
			}

		}
	}
