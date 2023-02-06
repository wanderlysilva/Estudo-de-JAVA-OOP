public class TestCarFactory {

	public static void main(String[] args) {
		CarFactory car1 = CarFactory.getInstance();
		CarFactory car2 = CarFactory.getInstance();
		CarFactory car3 = CarFactory.getInstance();

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
