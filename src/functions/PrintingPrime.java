/*Program to print prime number 1 to 100*/

package functions;
import java.util.Scanner;

public class PrintingPrime {
	
	public static boolean isPrime(int n) {
		
		if(n==1)return false;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
		
	}
	public static void printPrime() {
		for(int i=1;i<=100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		printPrime();
		
	}
}
