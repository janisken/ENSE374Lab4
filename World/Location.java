import java.util.*;

public class Location{
	
	//ArrayList is created of type Animals to have a list of the Animals added
	private ArrayList <Animals> aList = new ArrayList <Animals>();

	//ArrayList is created of type Flora to have a list of the Flora added
	private ArrayList <Flora> fList = new ArrayList <Flora>();
	
	//Adders for each of the flora, with the array add, called with a constructor
	public void addGrass(int canBeEaten, int xCoor, int yCoor)
	{
		fList.add(new Grass(canBeEaten, xCoor, yCoor));
		return;
	}

	public void addTreesShrubs(int canBeEaten, int xCoor, int yCoor)
	{
		fList.add(new TreesShrubs(canBeEaten, xCoor, yCoor));
		return;
	}
	
	//Adders for each of the animals, with the array add, called with a constructor
	public void addCaterpillar(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Caterpillar(canMove, xCoor, yCoor));
		return;
	}

	public void addGrasshopper(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Grasshopper(canMove, xCoor, yCoor));
		return;
	}

	public void addDeer(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Deer(canMove, xCoor, yCoor));
		return;
	}

	public void addBluejay(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Bluejay(canMove, xCoor, yCoor));
		return;
	}

	public void addSquirrel(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Squirrel(canMove, xCoor, yCoor));
		return;
	}

	public void addMouse(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Mouse(canMove, xCoor, yCoor));
		return;
	}

	public void addRabbit(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Rabbit(canMove, xCoor, yCoor));
		return;
	}

	public void addHawk(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Hawk(canMove, xCoor, yCoor));
		return;
	}

	public void addFox(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Fox(canMove, xCoor, yCoor));
		return;
	}

	public void addWolf(int canMove, int xCoor, int yCoor)
	{
		aList.add(new Wolf(canMove, xCoor, yCoor));
		return;
	}
	
	//moves all of the animals using the moveAnimal function in the Animals class
	public void moveAllAnimals()
	{
		for (Animals tempList : list)
		{
			tempList.moveAnimal();
		}
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
