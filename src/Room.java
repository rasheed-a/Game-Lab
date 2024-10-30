import java.util.HashMap;

public class Room {
	private String description;
	private Room east;
	private Room west;
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	
	HashMap<String, Item> Items = new HashMap<String,Item>(); // name, description
	
	public Room(String d) {
		description =  d;	
	}
	
	public void addItem(Item i) {
		Items.put(i.getName(), i);
	}
	
	public Item getItem(String name) {
		name = Items.getName(Item i);
		return name;
	}
	
	public void removeItem(Item i) {
		i = null;
	}
		
	public Room getExit(char dir) {
		if (dir == 'e') {
			return east;
		}
		else if (dir == 'w') {
			return west;
		}
		else if(dir == 'n') {
			return north;
		}
		else if(dir == 's') {
			return south;
		}
		else if(dir == 'u') {
			return up;
		}
		else if(dir == 'd') {
			return down;
		} else {
			return null;		
		}
	}
	
	public void addExit(Room a, char leave) {
		if (leave == 'e') {
			east = a;
		}
		else if (leave == 'w') {
			west = a;
		}
		else if(leave == 'n') {
			north = a;
		}
		else if(leave == 's') {
			south = a;
		}
		else if(leave == 'u') {
			up = a;
		}
		else if(leave == 'd') {
			down = a;	
		}
	}
	
	public String toString() {
		return description;
	}
}