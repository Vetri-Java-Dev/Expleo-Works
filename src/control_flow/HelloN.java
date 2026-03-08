package control_flow;
import java.util.Scanner;

public class HelloN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		int total=0; //to track total hellos
		
		while(true) {

		    System.out.print("Enter the number : ");
		    n=sc.nextInt();

		    if(n<0)break;

		    int index=0;

		    while(index++ < n) {
		        System.out.println("Hello");
		        total++;
		    }
		}
		
		System.out.print("Total number of hello printed : "+total);
	}
}
