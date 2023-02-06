public class Door {
	boolean opened;
	String color;
	int dimensionX;
	int dimensionY;
	int dimensionZ;

	public void open() {
		opened = true;	
	}

	public void close() {
		opened = false;
	}

	public boolean isOpen() {
		return opened;	
	}

	public void paint(String color) {
		this.color = color;
	}

}
