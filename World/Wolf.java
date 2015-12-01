import java.util.*;

public class Wolf extends Animals{
	
	public Wolf(int canMove, int xCoor, int yCoor)
	{
		super("Wolf", canMove, xCoor, yCoor); //Super calls the inherited constructor, in this case, it will be Animals(String, int)
	}
}
