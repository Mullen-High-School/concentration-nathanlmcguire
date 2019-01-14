import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Themes
	{
	static int theme;
	static int counter = 0;
	static ArrayList<String> loader = new ArrayList<String>();
	static String [][] layoutAnswers = new String [4] [4];
	
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
	

	public static void chooseTheme()
		{
		System.out.println("Which theme would you like to play with?");
		System.out.println("(1)  animals");
		System.out.println("(2)  food");
		System.out.println("(3)  places");
		System.out.println("(4)  body parts");

		Scanner input = new Scanner(System.in);
		theme = input.nextInt();
		switch(theme)
			{
			case 1:
				{
				for(String s : animals)
					{
					loader.add(s);
					}
				break;
				}
			case 2:
				{
				for(String s : food)
					{
					loader.add(s);
					}
				break;
				}
			case 3:
				{
				for(String s : places)
					{
					loader.add(s); 
					}
				break;
				}
			case 4:
				{
				for(String s : bodyParts)
					{
					loader.add(s);
					}
				break;
				}
			case 5:
				{
				for(String s : names)
					{
					loader.add(s);
					}
				break;
				}
			}
		}
	
	public static void setupAnswers()
		{
		chooseTheme();
		shuffle();
		loadCards();
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
