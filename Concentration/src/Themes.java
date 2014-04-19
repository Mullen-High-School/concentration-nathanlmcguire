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
	public static void loadCards()
		{
		for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
				{
				board[i][j] = " ";
				}
			}
		}
	}
	}
