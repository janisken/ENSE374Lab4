import java.util.*;

public class Location{
	private ArrayList <Animals> list = new ArrayList <Animals>();
	
	public void addGrass(int canMove)
	{
		list.add(new Grass(canMove));
		return;
	}

	public void addTreesShrubs(int canMove)
	{
		list.add(new TreesShrubs(canMove));
		return;
	}

	public void addCaterpillar(int canMove)
	{
		list.add(new Caterpillar(canMove));
		return;
	}

	public void addGrasshopper(int canMove)
	{
		list.add(new Grasshopper(canMove));
		return;
	}

	public void addDeer(int canMove)
	{
		list.add(new Deer(canMove));
		return;
	}

	public void addBluejay(int canMove)
	{
		list.add(new Bluejay(canMove));
		return;
	}

	public void addSquirrel(int canMove)
	{
		list.add(new Squirrel(canMove));
		return;
	}

	public void addMouse(int canMove)
	{
		list.add(new Mouse(canMove));
		return;
	}

	public void addRabbit(int canMove)
	{
		list.add(new Rabbit(canMove));
		return;
	}

	public void addHawk(int canMove)
	{
		list.add(new Hawk(canMove));
		return;
	}

	public void addFox(int canMove)
	{
		list.add(new Fox(canMove));
		return;
	}

	public void addWolf(int canMove)
	{
		list.add(new Wolf(canMove));
		return;
	}

	public void print(int i, int j)
	{
	    for (Animals tempList : list)
	    {
	        System.out.println(i + ", " + j + " contains a " + tempList.getAnimalType()); 
	    }
	}
}