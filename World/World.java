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
	
	//Adding all of the animals and fauna to the world with the adders from Location
	public void WolfToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addWolf(3);
		}
	}

	public void FoxToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addFox(3);
		}
	}

	public void HawkToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addHawk(5);
		}
	}

	public void RabbitToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addHawk(3);
		}
	}

	public void MouseToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addMouse(3);
		}
	}

	public void SquirrelToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addSquirrel(3);
		}
	}

	public void BluejayToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addBluejay(5);
		}
	}

	public void DeerToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addDeer(3);
		}
	}
	
	public void GrasshopperToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addGrasshopper(1);
		}
	}

	public void CaterpillarToWorld()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addCaterpillar(1);
		}
	}

	public void GrassToWorld()
	{
		for(int i = 0; i < 60; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addGrass();
		}
	}

	public void TreesShrubsToWorld()
	{
		for(int i = 0; i < 60; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addTreesShrubs();
		}
	}
	
	//Printing the world to the console, using the print function from Location
	public void printWorld()
	{
		for(int i = 0; i < squareKM; i++)
		{
			for(int j = 0; j < squareKM; j++)
			{
				//Have to call another print function to be able to get the type of animal and fauna
				environment[i][j].fPrint(i, j);
				environment[i][j].aPrint(i, j);
			}
		}
		return;
	}
}