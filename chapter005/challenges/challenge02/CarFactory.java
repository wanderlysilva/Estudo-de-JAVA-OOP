public class CarFactory {

	// Singleton Design Pattern
	private static CarFactory instance;

	private CarFactory() {}

	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
}
