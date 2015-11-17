import java.util.*;

public class Wolf extends Animals{
	
	public Wolf(int canMove)
	{
		super("Wolf", canMove); //Super calls the inherited constructor, in this case, it will be Animals(String, int)
	}
}