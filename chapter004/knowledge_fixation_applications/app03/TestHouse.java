public class TestHouse {
	public static void main(String[] args) {
		House house1 = new House();

		System.out.println(house1.howManyDoorsAreOpen() + " doors are open");

		house1.paint("White");

		System.out.println("House color: " + house1.color);

		house1.door1 = true;
		house1.door2 = true;

		System.out.println(house1.howManyDoorsAreOpen()  + " doors are open");
	}
}
