import java.util.*;

public class Fauna{
	
	//faunaType used to print out the proper type of animal in the specific location
	private String faunaType;

	//Fauna initial constructor
	public Fauna()
	{
		faunaType = null;
	}

	//Fauna constructor that assigns the type of fauna
	public Fauna(String type)
	{
		faunaType = type;
	}

	//faunaType getter
	public String getFaunaType()
	{
		return faunaType;
	}

	//faunaType setter
	public void setFaunaType(String type)
	{
		faunaType = type;
		return;
	}
}