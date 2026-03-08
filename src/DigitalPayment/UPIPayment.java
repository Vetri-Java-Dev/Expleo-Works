package DigitalPayment;

public class UPIPayment extends Payment{

	private String upiId;
	private String upiPin;
	
	public UPIPayment(String transactionId, double amount, 
			String customerName, String upiId, String upiPin)  {
		super(transactionId, amount, customerName);
		
		this.upiId=upiId;
		this.upiPin=upiPin;
		
	}

	@Override
	public boolean validatePayment() {
		return upiId.contains("@")&&upiId.length()>=3
				&& upiPin.length()==4;
	}

	@Override
	public boolean processPayment() {
		return true;
	}

}
