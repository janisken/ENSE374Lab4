import java.util.*;

public class Main{
	
	public static void main(String [] args)
	{
		World newWorld = new World();

		newWorld.populateTreesShrubs();
		newWorld.populateGrass();
		newWorld.populateCaterpillar();
		newWorld.populateGrasshopper();
		newWorld.populateDeer();
		newWorld.populateBluejay();
		newWorld.populateSquirrel();
		newWorld.populateMouse();
		newWorld.populateRabbit();
		newWorld.populateHawk();
		newWorld.populateFox();
		newWorld.populateWolf();

		newWorld.printWorld();
	}
}