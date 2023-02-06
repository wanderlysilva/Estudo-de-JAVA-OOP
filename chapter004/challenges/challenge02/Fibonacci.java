public class Fibonacci {

	// calculates the fibonacci number 
	// using recursion and ternary operator
	public int calculateFibonacci(int position) {
		return position == 1 || position == 2 ? 1 : calculateFibonacci(position - 2) + calculateFibonacci(position - 1);
	}
}
