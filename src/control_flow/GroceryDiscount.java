package control_flow;
import java.util.Scanner;

public class GroceryDiscount {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the quantity of the item : ");
		int quantity=sc.nextInt();
		
		System.out.print("Enter price per item : ");
		double price=sc.nextDouble();
		
		double total=quantity*price;
		
		//Discount reduction
		if(quantity>500)total-=total*0.15;
		
		System.out.print("Total price : "+total);
	}
}
