import java.util.*;

public class World{
	
	private static int squareKM = 150;
	private Location[][] environment = new Location[squareKM][squareKM];
	
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

	public void populateWolf()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addWolf(3);
		}
	}

	public void populateFox()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addFox(3);
		}
	}

	public void populateHawk()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addHawk(5);
		}
	}

	public void populateRabbit()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addHawk(3);
		}
	}

	public void populateMouse()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addMouse(3);
		}
	}

	public void populateSquirrel()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addSquirrel(3);
		}
	}

	public void populateBluejay()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addBluejay(5);
		}
	}

	public void populateDeer()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addDeer(3);
		}
	}
	
	public void populateGrasshopper()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addGrasshopper(1);
		}
	}

	public void populateCaterpillar()
	{
		for(int i = 0; i < 30; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addCaterpillar(1);
		}
	}

	public void populateGrass()
	{
		for(int i = 0; i < 60; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addGrass(0);
		}
	}

	public void populateTreesShrubs()
	{
		for(int i = 0; i < 60; i++)
		{
			Random rInt = new Random();
			int x = rInt.nextInt(150);
			int y = rInt.nextInt(150);
			environment[x][y].addTreesShrubs(0);
		}
	}

	public void printWorld()
	{
		for(int i = 0; i < squareKM; i++)
		{
			for(int j = 0; j < squareKM; j++)
			{
				//Have to call another print function to be able to get the type of animal and fauna through the list
				environment[i][j].print(i, j);
			}
		}
		return;
	}
}