import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Themes
	
	{
	static String animals [] = {"deer", "deer", "puma", "puma", "wolf", "wolf", "lion", 
			"lion", "vole", "vole", "duck", "duck", "frog", "frog", "bird", "bird"};
	
	static String food [] = {"taco", "taco", "meat", "meat", "cake", "cake", "corn", "corn", 
			"peas", "peas", "eggs", "eggs", "nuts", "nuts", "rice", "rice"};
	
	static String places [] = {"Iowa", "Iowa", "Utah", "Utah", "Ohio", "Ohio", "Cabo", "Cabo",
			"Reno", "Reno", "Baja", "Baja", "Oslo", "Oslo", "Vail", "Vail"};
	
	static String bodyParts [] = {"knee", "knee", "skin", "skin", "toes", "toes", "eyes", "eyes",
			"ears", "ears", "nose", "nose", "lips", "lips", "hair", "hair"};
	
	static String names [] = {"Lisa", "Lisa", "Mary", "Mary", "Bill", "Bill", "Suzy", "Suzy",
			"Jeff", "Jeff", "John", "John", "Emma", "Emma", "Dave", "Dave"};
	
	static ArrayList<String> loader = new ArrayList<String>();
	static String [][] layoutAnswers = new String [4] [4];
	
	public static void setupAnswers()
		{
		chooseTheme();
		shuffle();
		loadCards();
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
				for(String array : animals)
					{
					loader.add(array);
					}
				break;
				}
			case 2:
				{
				for(String array : food)
					{
					loader.add(array);
					}
				break;
				}
			case 3:
				{
				for(String array : places)
					{
					loader.add(array);
					}
				break;
				}
			case 4:
				{
				for(String array : bodyParts)
					{
					loader.add(array);
					}
				break;
				}
			case 5:
			for(int i = 0; i < 8; i++)
				{
				for(String array : names)
					{
					loader.add(array);
					}
				break;
				}
			}
		}
	
	public static void shuffle()
		{
		Collections.shuffle(loader);	
		}
	
	public static void loadCards()
		{
		int counter = 0;
		for(int i=0;i<4;i++)
			{
			for(int j=0;j<4;j++)
				{
				layoutAnswers[i][j] = loader.get(counter);
				counter++;
				}
			}
		}
	}
