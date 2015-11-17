import java.util.*;

public class Flora{
	
	//floraType used to print out the proper type of animal in the specific location
	private String floraType;

	//Flora initial constructor
	public Flora()
	{
		floraType = null;
	}

	//Flora constructor that assigns the type of flora
	public Flora(String type)
	{
		floraType = type;
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
}