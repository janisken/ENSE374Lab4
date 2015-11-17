import java.util.*;

public class Location{
	
	//ArrayList is created of type Animals to have a list of the Animals added
	private ArrayList <Animals> aList = new ArrayList <Animals>();

	//ArrayList is created of type Fauna to have a list of the Fauna added
	private ArrayList <Fauna> fList = new ArrayList <Fauna>();
	
	//Adders for each of the fauna
	public void addGrass()
	{
		fList.add(new Grass());
		return;
	}

	public void addTreesShrubs()
	{
		fList.add(new TreesShrubs());
		return;
	}
	
	//Adders for each of the animals
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
	public void aPrint(int i, int j)
	{
	    for (Animals tempListA : aList)
	    {
	        System.out.println(i + ", " + j + " contains" + tempListA.getAnimalType()); 
	    }
	}

	//Print function, taking the list from all the fauna and getting the correct type
	public void fPrint(int i, int j)
	{
	    for (Fauna tempListF : fList)
	    {
	        System.out.println(i + ", " + j + " contains" + tempListF.getAnimalType()); 
	    }
	}
}