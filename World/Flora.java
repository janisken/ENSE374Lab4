import java.util.*;

public class Flora{
	
	//floraType used to print out the proper type of animal in the specific location
	private String floraType;

	//canBeEaten used so that plants hold a certain amount of food
	private int canBeEaten;

	//Flora initial constructor
	public Flora()
	{
		floraType = "";
		canBeEaten = 0;
	}

	//Flora constructor that assigns the type of flora
	public Flora(String type, int foodAmount)
	{
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