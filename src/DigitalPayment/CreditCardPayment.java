package DigitalPayment;

import java.time.LocalDate;

public class CreditCardPayment extends Payment {

	private String cardNumber;
	private String cvv;
	private LocalDate expiryDate;
	
	public CreditCardPayment(String transactionId, double amount, String customerName
			,String cardNumber, String cvv, LocalDate expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expiryDate=expiryDate;
	}
	
	public boolean isValidCardNumber() {
		String[] numbers=cardNumber.split(" ");
		
		if(numbers.length!=4)return false;
		
		for(String num : numbers) {
			
			if(num.length()!=4)return false;
			
			try {
				int n=Integer.parseInt(num);
	            continue;
	        }
			catch (NumberFormatException e) {
	            return false;
	        }
		}
		return true;
	}
	
	public boolean isExpired() {
		if(LocalDate.now().isAfter(expiryDate))return true;
		return false;
	}
	
	public boolean isValidCvv() {
		
		if(cvv.length()!=3)return false;

		try {
			Integer.parseInt(cvv);
		}
		catch(NumberFormatException e) {
			return false;
		}
		
		return true;
	}


	@Override
	public boolean validatePayment() {
		return isValidCardNumber()&&
				isValidCvv()&&
				(!isExpired());
	}

	@Override
	public boolean processPayment() {
		return true;
	}
	
}
