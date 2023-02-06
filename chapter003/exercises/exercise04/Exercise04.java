public class Exercise04 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {

			int factorial = 1;

			for(int j = i; j > 0; j--) {
				factorial *= j;
			}

			System.out.printf("(%d!) = %d\n", i, factorial);
		}
	}
}
