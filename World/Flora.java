import java.util.*;

public class Flora{
	
	//floraType used to print out the proper type of animal in the specific location
	private String floraType;

	//canBeEaten used so that plants hold a certain amount of food
	private int canBeEaten;

	//coordinates of each plant
	private int xCoordinate;
	private int yCoordinate;

	//Flora initial constructor
	public Flora()
	{
		xCoordinate = 0;
		yCoordinate = 0;
		floraType = "";
		canBeEaten = 0;
	}

	//Flora constructor that assigns the type of flora
	public Flora(String type, int foodAmount, int xCoor, int yCoor)
	{
		xCoordinate = xCoor;
		yCoordinate = yCoor;
		floraType = type;
		canBeEaten = foodAmount;
	}

	//floraType getter
	public String getFloraType()
	{
		return floraType;
	}

	//floraType setter
	public void setFloraType(String type)
	{
		floraType = type;
		return;
	}

	//canBeEaten getter
	public int getCanBeEaten()
	{
		return canBeEaten;
	}

	//canBeEaten setter
	public void setCanBeEaten(int foodAmount)
	{
		canBeEaten = foodAmount;
		return;
	}
}
