public class Fibonacci {

	// calculates the fibonacci number of the position
	public int calculateFibonacci(int position) {
		if(position == 1 || position == 2)
			return 1;
		return calculateFibonacci(position - 2) + calculateFibonacci(position - 1);
	}
}
