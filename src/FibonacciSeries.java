import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the fibonacci count:");
		int n = scan.nextInt();
		
		int[] fib = new int[n];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2; i<n; i++ ){
			
			fib[i] = fib[i-1] + fib[i-2];
			
		}
		
		System.out.println(Arrays.toString(fib));
		
	}
	
}
