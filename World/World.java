import java.util.*;

public class World{
	
	//size of the world
	private static int squareKM = 150;
	
	//2D array is created for the environment, ensuring a location is created for each squareKM
	private Location[][] environment = new Location[squareKM][squareKM];
	
	//World constructor, creating a new location per squareKM
	public World()
	{
		for(int i = 0; i < squareKM; i++)
		{
			for(int j = 0; j < squareKM; j++)
			{
				environment[i][j] = new Location();
			}
		}
		return;
	}

	//Adding all of the animals and flora to the world with the adders from Location
	public void wolfToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addWolf(3, x, y);
		}
	}

	public void foxToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addFox(3, x, y);
		}
	}

	public void hawkToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addHawk(5, x, y);
		}
	}

	public void rabbitToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addRabbit(3, x, y);
		}
	}

	public void mouseToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addMouse(3, x, y);
		}
	}

	public void squirrelToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addSquirrel(3, x, y);
		}
	}

	public void bluejayToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addBluejay(5, x, y);
		}
	}

	public void deerToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addDeer(3, x, y);
		}
	}
	
	public void grasshopperToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addGrasshopper(1, x, y);
		}
	}

	public void caterpillarToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addCaterpillar(1, x, y);
		}
	}

	public void grassToWorld()
	{
		for(int i = 0; i < 60; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addGrass(15, x, y);
		}
	}

	public void treesShrubsToWorld()
	{
		for(int i = 0; i < 60; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addTreesShrubs(15, x, y);
		}
	}
	
	public void moveAnimals()
	{
		for(int i = 0; i < squareKM; i++)
		{
			for(int j = 0; j < squareKM; j++)
			{
				//Have to call another print function to be able to get the type of animal and flora through the list
				environment[i][j].moveAllAnimals();
			}
		}
	}

	//Printing the world to the console, using the print function from Location
	public void printWorld()
	{
		for(int i = 0; i < squareKM; i++)
		{
			for(int j = 0; j < squareKM; j++)
			{
				//Have to call another print function to be able to get the type of animal and flora through the list
				environment[i][j].print(i, j);
			}
		}
		return;
	}
}
