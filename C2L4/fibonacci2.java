package lab4;
//2. çözüm yolu:

public class fibonacci2 {

	public static void main(String[] args) {
		System.out.println("Fibonacci(4):");
		System.out.print("0 1 ");
		fibonacci(2);
		
		System.out.println("");
		System.out.println("Fibonacci(10):");
		System.out.print("0 1 ");
		fibonacci(8);
		
		System.out.println("");
		System.out.println("Fibonacci(20):");
		System.out.print("0 1 ");
		fibonacci(18);


	}
	
	public static void fibonacci(int n) {
		if(n<=0) {
			return;
		}
		fibo(n,0,1);
	}
	
	public static void fibo(int n, int num1, int num2) {
		
		if(n==0) {
			return ;
		}
		int next= num1 + num2;
		System.out.print(next + " ");
		fibo(n-1,num2,next);
		
		}

} 
