package CEN4802;

public class Recursive extends Thread{
	
	static public int fibonnaci(int n) {
		if (n == 0) {
			return 0;
		}else if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonnaci(n-1) + fibonnaci(n-2);
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		String ending = "th";
		
		int fibNum = fibonnaci(n);
		
		System.out.println("The " + n + ending + " number in the Fibonacci sequence is " + fibNum + ".");
	}
}