import java.util.*;

public class Main{
	
	public static void main(String [] args)
	{
		//Creation of a new world
		World newWorld = new World();

		//Adding everything into the world
		newWorld.treesShrubsToWorld();
		newWorld.grassToWorld();
		newWorld.caterpillarToWorld();
		newWorld.grasshopperToWorld();
		newWorld.deerToWorld();
		newWorld.bluejayToWorld();
		newWorld.squirrelToWorld();
		newWorld.mouseToWorld();
		newWorld.rabbitToWorld();
		newWorld.hawkToWorld();
		newWorld.foxToWorld();
		newWorld.wolfToWorld();

		//Printing out the world onto the console
		newWorld.printWorld();
		
	}
}