public class Item {
	private String description; // item description
	private String name; // item name
	
	public Item (String n, String d) {
		name = n;
		description = d;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public String toString() {
		return name;
	}
}
