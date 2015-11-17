import java.util.*;

public class Animals{
	
	private int moved;
	private int canMove;
	private String animalType;

	public Animals()
	{
		moved = 0;
		canMove = 0;
		animalType = "";
	}

	public Animals(String type, int animalCanMove)
	{
		canMove = animalCanMove;
		animalType = type;
	}

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