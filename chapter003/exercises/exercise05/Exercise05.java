public class Exercise05 {
	
	public static void main(String[] args) {

		long factorial = 1;

		for(long i = 1; i <= 40; i++) {
			factorial *= i;

			System.out.printf("(%d!) = %d\n", i, factorial);
		}
	}
}
