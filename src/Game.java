import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		runGame();
	}
	
	private static ArrayList<Item> inventory = new ArrayList<Item>();
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static Room currentRoom = World.buildWorld();
	
	public static Room getRoom() {
		return currentRoom;
	}
	
	public static Item getInventory(String name) {
		for(Item a : inventory) {
			if(a.getName().equals(name))
				return a;
			}
			return null;
	}

	
	public static void runGame() {
		Scanner input = new Scanner(System.in);
		
		String command;
		
		do {
			System.out.println(currentRoom);
			System.out.println("Where do you want to go? ");
			command = input.nextLine();
			String [] words = command.split(" ");
			
			switch(words[0]) {
			case "e":
			case "w":
			case "s":
			case "n":
			case "u":
			case "d":
				currentRoom = currentRoom.getExit(command.charAt(0));
				break;
			case "x":
				System.out.println("Bye, thanks for playing.");
				break;
			case "take":
				Item i = currentRoom.getItem(words[1]);
				System.out.println("You want to take the " + words[1]);
				if(i == null) {
					System.out.println("There's nothing to take.");
				}
				else {
					currentRoom.removeItem(i);
					inventory.add(i);
					System.out.println("You pick up the" + i.getName());
				}
				break;
			case "look":
				Item i1 = currentRoom.getItem(words[1]);
				System.out.println("You want to look at " + words[1]);
				if(i1 == null) {
					System.out.println(words[1] + "( " + words[1] + ") is not in the room"); }
				else {
					for(Item there : inventory) {
						if(there.equals(i1)) {
							System.out.println(words[1] + "(" + i1.getDescription() + ") is in your inventory");
						}
						else {
							System.out.println(words[1] + "is not in your inventory");
						}
					}
					System.out.println(words[1] + "( " + i1.getDescription() + ") is still in the room");
				}
				break;
			case "i":
				System.out.println("You are carrying: ");
				for(Item it : inventory)
						System.out.println(it);
				break;
			case "use":                                 
				System.out.println("You want to use the " + words[1]);
				if(currentRoom.getItem(words[1]) != null) {
					currentRoom.getItem(words[1]).use();
					System.out.println("You have used your item succesfully");
				}
				else {
					
					System.out.println("You can't use " + words[1] + "!");
				}
				break;
			case "open":
				System.out.println("Lets see if you can open it succesfully...");
				if(currentRoom.getItem(words[1]) != null) {
					currentRoom.getItem(words[1]).use();
					System.out.println("You were able to open it!");
				}
				else {
					System.out.println("You can't open it...");
				}
			default:
				System.out.println("Unsure what you meant.");
			}
			
		} while(!command.equals("x"));
		
		input.close();
	}
}