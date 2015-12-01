import java.util.*;

public class Animals{
	
	//Moved, canMove and moveDirection function for when the animals will move in the world
	private int moved;
	private int canMove;
	private int moveDirection;

	//x and y Coordinates are used to move the animals, wether to the left or right, up or down on the map
	private int xCoordinate;
	private int yCoordinate;

	//number of directions sets which direction the animal will move
	private int numOfDirections = 4;
	
	//animalType used to print out the proper type of animal in the specific location
	private String animalType;

	//Animal initial constructor
	public Animals()
	{
		xCoordinate = 0;
		yCoordinate = 0;
		moved = 0;
		canMove = 0;
		moveDirection = 0;
		animalType = "";
	}

	//Animal constructor that assigns the movement and type of the animal
	public Animals(String type, int animalCanMove, int xCoor, int yCoor)
	{
		xCoordinate = xCoor;
		yCoordinate = yCoor;
		canMove = animalCanMove;
		moved = 0;
		moveDirection = 0;
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

	public int getXCoordinate()
	{
		return xCoordinate;
	}

	public void setXCoordinate(int xCoor)
	{
		xCoordinate = xCoor;
		return;
	}

	public int getYCoordinate()
	{
		return yCoordinate;
	}

	public void setYCoordinate(int yCoor)
	{
		yCoordinate = yCoor;
		return;
	}

	//selects which way the animal should move
	//moves the animal in the direction set and puts them back in bounds if they go out
	public void moveAnimal()
	{
		Random rInt = new Random();
		moved = rInt.nextInt(getCanMove());
		moveDirection = rInt.nextInt(numOfDirections);

		switch (moveDirection){
			case 1: yCoordinate += moved;
				break;
			case 2: yCoordinate -= moved;
				break;
			case 3: xCoordinate += moved;
				break;
			case 4: yCoordinate -= moved;
				break;
			default: break;
		}

		if (yCoordinate > 149)
		{		
			yCoordinate = 149;
		}
		else{
			if (yCoordinate < 0)
			{
				yCoordinate = 0;
			}
		}

		if (xCoordinate > 149)
		{		
			xCoordinate = 149;
		}
		else{
			if (xCoordinate < 0)
			{
				xCoordinate = 0;
			}
		}
		return;
	}
}
