
public class Combination extends Item {
	public Combination(String name, String description) {
		super("Combination", "What could these numbers be for?");
	}
	public void use() {
		Game.print("If you find a safe, try opening it!");
	}
}
