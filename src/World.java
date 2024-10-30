public class World {
	public static Room buildWorld() {
		Room entrance = new Room("You are in the entrance.");
		Room kitchen = new Room("You are in the kitchen.");
		Room diningRoom = new Room("You are in the dining room.");
		Room basement = new Room("You are in the basement.");
		Room attic = new Room("You are in the attic");
		Room livingRoom = new Room("You are in the living room.");
		
		
	
		entrance.addExit(kitchen,'e');
		entrance.addExit(diningRoom,'n');
		entrance.addExit(livingRoom,'w');
		entrance.addExit(basement,'d');
		entrance.addExit(attic,'u');
		
		basement.addExit(entrance,'u');
		Item flashlight = new Item("Flashlight","Working flashlight");
		basement.addItem(flashlight);
		
		attic.addExit(entrance,'d');
		Item key = new Item("Key","Key for a door");
		attic.addItem(key);
		
		kitchen.addExit(entrance,'w');
		kitchen.addExit(diningRoom,'n');
		Item Mango = new Item("Mango","Mango Mango Mango Mango Mango");
		kitchen.addItem(Mango);
		Item StillWater = new Item("Still water","Be careful");
		kitchen.addItem(StillWater);
		Item Noradrenaline = new Item("Noradrenaline","Human peak");
		kitchen.addItem(Noradrenaline);
		
		livingRoom.addExit(entrance,'e');
		livingRoom.addExit(diningRoom,'n');
		
		diningRoom.addExit(kitchen,'e');
		diningRoom.addExit(entrance,'s');
		diningRoom.addExit(livingRoom,'w');
		
		return entrance;
	}
}