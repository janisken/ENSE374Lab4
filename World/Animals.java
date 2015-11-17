import java.util.*;

public class Animals{
	
	//Moved and canMove function for when the animals will move in the world
	private int moved;
	private int canMove;
	
	//animalType used to print out the proper type of animal in the specific location
	private String animalType;

	//Animal initial constructor
	public Animals()
	{
		moved = 0;
		canMove = 0;
		animalType = "";
	}

	//Animal constructor that assigns the movement and type of the animal
	public Animals(String type, int animalCanMove)
	{
		canMove = animalCanMove;
		animalType = type;
	}

	//Setters and getters
	public String getAnimalType()
	{
		return animalType;
	}

	public void setAnimalType(String type)
	{
		animalType = type;
		return;
	}

	public int getMoved()
	{
		return moved;
	}

	public void setMoved(int moves)
	{
		moved = moves;
		return;
	}

	public int getCanMove()
	{
		return canMove;
	}

	public void setCanMove(int maxMove)
	{
		canMove = maxMove;
		return;
	}

}