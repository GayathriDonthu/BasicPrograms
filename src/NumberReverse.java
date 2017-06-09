import java.util.Scanner;

public class NumberReverse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		int n = scan.nextInt();
		
		int reverse = 0;
		
		while( n != 0){
			reverse = (reverse * 10) + (n % 10);
			n = n / 10;
		}
		
		System.out.println("Reversed number is:"+ reverse);
		
	}
}
