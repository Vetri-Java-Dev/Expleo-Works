package control_flow;
import java.util.Scanner;

public class PurchaseDiscount {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the quantity : ");
		int quantity=sc.nextInt();
		
		System.out.print("Enter the price : ");
		float price=sc.nextFloat();
		
		float total=quantity*price;
		
		if(total>1000) total-=total*0.10;
		else total-=total*0.05;
		
		System.out.print(total);
	}
}
