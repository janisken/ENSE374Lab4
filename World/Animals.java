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
		canMove = 0;
		animalType = null;
	}

	//Animal constructor that assigns the movement and type of the animal
	public Animals(String type, int animalCanMove)
	{
		canMove = animalCanMove;
		animalType = type;
	}
	
	//animalType getter
	public String getAnimalType()
	{
		return animalType;
	}

	//animalType setter
	public void setAnimalType(String type)
	{
		animalType = type;
		return;
	}

	//canMove getter
	public int getCanMove()
	{
		return canMove;
	}

	//canMove setter
	public void setCanMove(int maxMove)
	{
		canMove = maxMove;
		return;
	}

}