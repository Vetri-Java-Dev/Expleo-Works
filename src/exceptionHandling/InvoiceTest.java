package exceptionHandling;

import java.util.Scanner;

public class InvoiceTest {
	
	public static void validateInput(Invoice invoice) throws InputMismatchException {
		if(invoice.getPartNumber()<=0) {
			throw new InputMismatchException("Part number should not be zero or less than zero.");
		}
		if(invoice.getPartDescription().isEmpty()) {
			throw new InputMismatchException("Part description should not be null.");
		}
		if((invoice.getNoOfItem()<0)||invoice.getPricePerItem()<0) {
			throw new InputMismatchException("No of items or price per item should'nt be lesser than 0.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		/*int partNumber;
	String partDescription;
	int noOfItem;
	double pricePerItem;
	*/
		
		System.out.print("Enter part number : ");
		int partNumber=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter part description : ");
		String partDescription=sc.nextLine();
		
		System.out.print("Enter no of items : ");
		int noOfItem=sc.nextInt();
		
		System.out.print("Enter price : ");
		double price=sc.nextDouble();
		
		Invoice invoice=new Invoice(partNumber, partDescription, noOfItem, price);
		
		try {
			validateInput(invoice);
			System.out.println("Invoice is validated.");
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}
}
