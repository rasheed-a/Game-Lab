
public class Safe extends Item{
	public Safe(String name, String description) {
		super("Safe", "Safest storage in the game!");
	}

	public void open() {
		if(getName().equals("Combination")) {
			Game.print("Using the combination, you open the safe and find a diamond inside! Naturally, you pocket the diamond.");
			Item Diamond = new Item("Diamond", "Sharp and Shiny jewlery");
			Game.inventory.add(Diamond);
		}
		else {
			Game.print("The safe is locked and you don't have the combination");
		}
	}
}