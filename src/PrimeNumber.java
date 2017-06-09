import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int m = n/2;
		
		boolean flag = true;
		
		for(int i=2; i<m; i++){
			if(n%i == 0){
				flag = false;
				break;
			}
		}
		
		if(flag == true)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
		
	}
	
}
