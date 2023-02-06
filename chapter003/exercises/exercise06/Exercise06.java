public class Exercise06 {
	public static void main(String[] args) {
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.println("Printing the fibonacci sequence:");

		while(previousNumber < 100) {
			System.out.print(previousNumber + ", ");
				
			nextNumber += previousNumber;
			previousNumber = nextNumber - previousNumber;
		}
		System.out.print(previousNumber + "\n");
	}
}
