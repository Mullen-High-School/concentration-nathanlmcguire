import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Themes

	{
	static ArrayList<String> loader = new ArrayList<String>();
	static int theme;
	
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
		Scanner input = new Scanner(System.in);
		theme = input.nextInt();
		switch(theme)
			{
			case 1:
				{
				for(String array : animals)
					{
					loader.add(array);
					}
				}
			
		
		
	public static void fillLayout()
		{
		for(String array : nameOfArray)
			{
			loader.add(array);
			}
		}
	
	public static void shuffle()
		{
		Collections.shuffle(loader);	
		}
	}
