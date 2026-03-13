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
		//if(invoice.)
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
	}
}
