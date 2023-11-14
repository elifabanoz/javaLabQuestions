package lab4;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci(4):");
		fibonacci(4);
		
		System.out.println();
		System.out.println("Fibonacci(10):");
		fibonacci(10);
		
		
	}
	
	public static int fibonac(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibonac(n-1)+fibonac(n-2);
		}
	}
	
	public static void fibonacci(int n) {
		for(int i=0; i<n; i++) {
			System.out.print(fibonac(i)+ " ");
		}

}

}
