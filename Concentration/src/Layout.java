
public class Layout
	{
	static String [][] layout;
	
	public static void createLayout()
		{
			layout = new String [4][4];
			for(int i = 0; i < 4; i++)
				{
				for(int j =0; j < 4; j++)
					{
					layout [i][j] = "    ";
					}
				}
		}

	public static void display()
		{
		System.out.println("     A      B      C      D");
		System.out.println("  -----------------------------");
		System.out.println("  |      |      |      |      |");
		System.out.println("1 | " + layout [0][0] + " | " + layout [0][1] + " | " + layout [0][2] + " | " + layout [0][3] + " | ");
		System.out.println("  |      |      |      |      |");
		System.out.println("  -----------------------------");
		System.out.println("  |      |      |      |      |");
		System.out.println("2 | " + layout [1][0] + " | " + layout [1][1] + " | " + layout [1][2] + " | " + layout [1][3] + " | ");
		System.out.println("  |      |      |      |      |");
		System.out.println("  -----------------------------");
		System.out.println("  |      |      |      |      |");
		System.out.println("3 | " + layout [2][0] + " | " + layout [2][1] + " | " + layout [2][2] + " | " + layout [2][3] + " | ");
		System.out.println("  |      |      |      |      |");
		System.out.println("  -----------------------------");
		System.out.println();
		}	
	}

	
