package control_flow;
import java.util.Scanner;

public class JobWorkBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no of pages : ");
		int page=sc.nextInt();
		
		System.out.print("Enter no of copies : ");
		int copy=sc.nextInt();
		
		double typingCost=page*3;
		double printingCost;
		
		if(copy==1){
			printingCost=page*1;
		}
		else {
			printingCost=(page*1)+((copy-1)*page*3);
		}
		
		double totalCost=typingCost+printingCost;
		
		System.out.print("Total cost : "+totalCost);
	}
}
