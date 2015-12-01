import java.util.*;

public class Location{
	
	//ArrayList is created of type Animals to have a list of the Animals added
	private ArrayList <Animals> aList = new ArrayList <Animals>();

	//ArrayList is created of type Flora to have a list of the Flora added
	private ArrayList <Flora> fList = new ArrayList <Flora>();
	
	//Adders for each of the flora, with the array add, called with a constructor
	public void addGrass(int canBeEaten)
	{
		fList.add(new Grass(canBeEaten));
		return;
	}

	public void addTreesShrubs(int canBeEaten)
	{
		fList.add(new TreesShrubs(canBeEaten));
		return;
	}
	
	//Adders for each of the animals, with the array add, called with a constructor
	public void addCaterpillar(int canMove)
	{
		aList.add(new Caterpillar(canMove));
		return;
	}

	public void addGrasshopper(int canMove)
	{
		aList.add(new Grasshopper(canMove));
		return;
	}

	public void addDeer(int canMove)
	{
		aList.add(new Deer(canMove));
		return;
	}

	public void addBluejay(int canMove)
	{
		aList.add(new Bluejay(canMove));
		return;
	}

	public void addSquirrel(int canMove)
	{
		aList.add(new Squirrel(canMove));
		return;
	}

	public void addMouse(int canMove)
	{
		aList.add(new Mouse(canMove));
		return;
	}

	public void addRabbit(int canMove)
	{
		aList.add(new Rabbit(canMove));
		return;
	}

	public void addHawk(int canMove)
	{
		aList.add(new Hawk(canMove));
		return;
	}

	public void addFox(int canMove)
	{
		aList.add(new Fox(canMove));
		return;
	}

	public void addWolf(int canMove)
	{
		aList.add(new Wolf(canMove));
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
