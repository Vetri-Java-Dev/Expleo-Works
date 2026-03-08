package DigitalPayment;

public class NetBankingPayment extends Payment{

	private String bankName;
	private String accountNumber;
	private String ifscCode;
	
	public NetBankingPayment(String transactionId, double amount,
			String customerName, String bankName, String
			accountNumber, String ifscCode) {
		
		super(transactionId, amount, customerName);
		this.bankName=bankName;
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;
		
	}

	@Override
	public boolean validatePayment() {
		
		if(accountNumber.length()<=8 || accountNumber.length()>18)return false;
		if(ifscCode.length()!=11)return false;
		return true;
		
	}

	@Override
	public boolean processPayment() {
		return true;
	}

}
