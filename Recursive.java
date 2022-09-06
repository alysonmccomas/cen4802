package CEN4802;

/**
 * This class contains a function that calculates the nth number in the 
 * fibonacci sequence as well as a Main method that provides the argument 
 * and calls the function.
 * @author Alyson McComas
 * @version 1.1
 */

public class Recursive {
	
	/**
	 * This accepts an argument as an integer and returns the given number in
	 * the Fibonnaci sequence.
	 * @param n the desired number in the fibonacci sequence
	 * @return the resulting number in the sequence
	 */
	static public int fibonnaci(int n) {
		int result = 0;
		
		if (n == 0) {
			return result;
		}else if (n == 1 || n == 2) {
			result = 1;
			return result;
		} else {
			result = fibonnaci(n-1) + fibonnaci(n-2);
			return result;
		}
		
	}
	
	/**
	 * This is the main method that calls the fibonacci function.
	 * @param args standard syntax for Main method
	 */
	public static void main(String[] args) {
		int n = 10;
		String ending = "th";
		
		int fibNum = fibonnaci(n);
		
		System.out.println("The " + n + ending + " number in the Fibonacci sequence is " + fibNum + ".");
	}
}