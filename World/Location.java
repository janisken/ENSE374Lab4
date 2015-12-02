import java.util.*;

public class Location{
	
	//ArrayList is created of type Animals to have a list of the Animals added
	private ArrayList <Animals> aList = new ArrayList <Animals>();

	//ArrayList is created of type Flora to have a list of the Flora added
	private ArrayList <Flora> fList = new ArrayList <Flora>();
	
	//Adders for each of the flora, with the array add, called with a constructor
	public void addGrass(int canBeEaten, int x, int y)
	{
		fList.add(new Grass(canBeEaten, x, y));
		return;
	}

	public void addTreesShrubs(int canBeEaten, int x, int y)
	{
		fList.add(new TreesShrubs(canBeEaten, x, y));
		return;
	}
	
	//Adders for each of the animals, with the array add, called with a constructor
	public void addCaterpillar(int x, int y)
	{
		aList.add(new Caterpillar(x, y));
		return;
	}

	public void addGrasshopper(int x, int y)
	{
		aList.add(new Grasshopper(x, y));
		return;
	}

	public void addDeer(int x, int y)
	{
		aList.add(new Deer(x, y));
		return;
	}

	public void addBluejay(int x, int y)
	{
		aList.add(new Bluejay(x, y));
		return;
	}

	public void addSquirrel(int x, int y)
	{
		aList.add(new Squirrel(x, y));
		return;
	}

	public void addMouse(int x, int y)
	{
		aList.add(new Mouse(x, y));
		return;
	}

	public void addRabbit(int x, int y)
	{
		aList.add(new Rabbit(x, y));
		return;
	}

	public void addHawk(int x, int y)
	{
		aList.add(new Hawk(x, y));
		return;
	}

	public void addFox(int x, int y)
	{
		aList.add(new Fox(x, y));
		return;
	}

	public void addWolf(int x, int y)
	{
		aList.add(new Wolf(x, y));
		return;
	}

	//Print function, taking the list from all the animals and getting the correct type
	public void print(int i, int j)
	{
		for (Animals aTempList : aList)
		{
	        	System.out.println(aTempList.getAnimalType() + " in location " + i + ", " + j); 
		}
		for (Flora fTempList : fList)
		{
			System.out.println(fTempList.getFloraType() + " in location " + i + ", " + j); 
		}
	
	}
}