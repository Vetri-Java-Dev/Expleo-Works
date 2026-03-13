package exceptionHandling;

import java.util.Scanner;

class InputMismatchException extends Exception{
	public InputMismatchException(String msg) {
		super(msg);
	}
}

public class Invoice {
	
	int partNumber;
	String partDescription;
	int noOfItem;
	double pricePerItem;
	
	public Invoice(int partNumber, String partDescription, int noOfItem, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.noOfItem = noOfItem;
		this.pricePerItem = pricePerItem;
	}

	
	public int getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public int getNoOfItem() {
		return noOfItem;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}
	
	
	
}
