public class House {

	String color;
	boolean door1;
	boolean door2; 
	boolean door3;

	public void paint(String color) {
		this.color = color;
	}

	public int howManyDoorsAreOpen() {
		int amount = 0;

		if(door1)
			amount++;
		if(door2)
			amount++;
		if(door3)
			amount++;

		return amount;
	}
}
