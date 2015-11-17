import java.util.*;

public class Main{
	
	public static void main(String [] args)
	{
		//Creation of a new world
		World newWorld = new World();

		//Adding everything into the world
		newWorld.TreesShrubsToWorld();
		newWorld.GrassToWorld();
		newWorld.CaterpillarToWorld();
		newWorld.GrasshopperToWorld();
		newWorld.DeerToWorld();
		newWorld.BluejayToWorld();
		newWorld.SquirrelToWorld();
		newWorld.MouseToWorld();
		newWorld.RabbitToWorld();
		newWorld.HawkToWorld();
		newWorld.FoxToWorld();
		newWorld.WolfToWorld();

		//Printing out the world onto the console
		newWorld.printWorld();
	}
}