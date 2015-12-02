import java.util.*;

public class Wolf extends AnimalsWithoutWings{
	
	public Wolf(int x, int y)
	{
		super("Wolf", x, y); //Super calls the inherited constructor, in this case, it will be Animals(String, int)
	}
}