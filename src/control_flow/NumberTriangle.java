package control_flow;
import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		StringBuilder pattern=new StringBuilder();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				pattern.append(i+" ");
			}
			pattern.append("\n");
		}
		
		System.out.print(pattern);
	}
}
