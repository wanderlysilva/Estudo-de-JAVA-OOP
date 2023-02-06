public class TestDoor {

	public static void main(String[] args) {
		Door door1 = new Door();

		door1.open();
		door1.close();
		door1.open();

		System.out.println(door1.isOpen());

		door1.paint("red");

		System.out.println("Door color: " + door1.color);

		door1.dimensionX = 5;
		door1.dimensionY = 8;
		door1.dimensionZ = 10;

		System.out.printf("%d %d %d\n", door1.dimensionX, door1.dimensionY, door1.dimensionZ);

	}
}
